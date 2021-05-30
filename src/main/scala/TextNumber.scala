package org.aje.application

object TextNumber {

  def getValues(previousValues: List[Int]): List[Int] = {
    // get the last value in the list
    // get the number of characters in the last value
    // check if the number of characters is already in the list
    // if it is return the original list otherwise
    // return a new list with the new last number appended
//    println(s"Entering with values: $previousValues")
    val newValue: Int = TextNumber.generateTextValue(previousValues.last).size
    if (previousValues.contains(newValue))
      previousValues
    else {
//      println(s"adding $newValue")
      getValues(previousValues ::: List(newValue))
    }
  }

  def toText(x: Int, capitalize: Boolean = true): String = {
    if (capitalize)
      generateTextValue(x).capitalize
    else
      generateTextValue(x)
  }

  private def generateTextValue(x: Int): String = {
    if (x == 0) {
      "zero"
    } else {
      x match {
        case 1 => "one"
        case 2 => "two"
        case 3 => "three"
        case 4 => "four"
        case 5 => "five"
        case 6 => "six"
        case 7 => "seven"
        case 8 => "eight"
        case 9 => "nine"
        case 10 => "ten"
        case 11 => "eleven"
        case 12 => "twelve"
        case 13 => "thirteen"
        case 14 => "fourteen"
        case 15 => "fifteen"
        case 16 => "sixteen"
        case 17 => "seventeen"
        case 18 => "eighteen"
        case 19 => "nineteen"
        case y if 20 to 99 contains y => {
          val tens = y / 10
          val tensRemainder = y % 10
          val tensPrefix = tens match {
            case 2 => "twenty"
            case 3 => "thirty"
            case 4 => "forty"
            case 5 => "fifty"
            case 6 => "sixty"
            case 7 => "seventy"
            case 8 => "eighty"
            case 9 => "ninety"
          }
          if (tensRemainder == 0)
            tensPrefix
          else
            tensPrefix + "-" + generateTextValue(tensRemainder)
        }
        case y if 100 to 999 contains y => {
          val hundreds = y / 100
          val hundredsRemainder = y % 100
          val hundredsPrefix: String = generateTextValue(hundreds) + " hundred"
          if (hundredsRemainder == 0)
            hundredsPrefix
          else
            hundredsPrefix + " " + generateTextValue(hundredsRemainder)
        }
          // 47,200 Forty-seven thousand two hundred
        case y if 1000 to 999999 contains y => {
          val thousands = y / 1000
          val thousandsRemainder = y % 1000
          val thousandsPrefix: String = generateTextValue(thousands) + " thousand"
          if (thousandsRemainder == 0)
            thousandsPrefix
          else
            thousandsPrefix + " " + generateTextValue(thousandsRemainder)
        }
        case y if 1000000 to 99999999 contains y => {
          val millions = y / 1000000
          val millionsRemainder = y % 1000000
          val millionsPrefix: String = generateTextValue(millions) + " million"
          if (millionsRemainder == 0)
            millionsPrefix
          else
            millionsPrefix + " " + generateTextValue(millionsRemainder)
        }
        case y if 1000000 to 99999999 contains y => {
          val billions = y / 1000000
          val billionsRemainder = y % 1000000
          val billionsPrefix: String = generateTextValue(billions) + " billion"
          if (billionsRemainder == 0)
            billionsPrefix
          else
            billionsPrefix + " " + generateTextValue(billionsRemainder)
        }
        case _ => "number too large or less than zero"
      }
    }
  }
}
