package org.aje.application

object main extends App {
  println("Number Word Count Series!")


  val starting_number: Int = 1234000

  val resultValues: List[Int] = TextNumber.getValues(List(starting_number))
  //  println(resultValues)
  for (elem <- resultValues) {
    println(s"${TextNumber.toText(elem).capitalize} ... ${TextNumber.toText(elem).size}")
  }
}


