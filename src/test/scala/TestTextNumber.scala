package org.aje.application
import org.scalatest.funsuite.AnyFunSuite

class TestTextNumber extends AnyFunSuite {

  test("text for 9740") {
    val r: String = TextNumber.toText(9740)
    assert(r == "Nine thousand seven hundred forty")
  }

  test("text for 47200") {
    var r: String = TextNumber.toText(47200)
    assert(r == "Forty-seven thousand two hundred")
  }

  test("text for forty two") {
    var r: String = TextNumber.toText(42)
    assert(r == "Forty-two")
  }

  test("text for zero") {
    var r: String = TextNumber.toText(0)
    assert(r == "Zero")
  }

  test("text for nineteen") {
    var r: String = TextNumber.toText(19)
    assert(r == "Nineteen")
  }

  test("twenty") {
    var r: String = TextNumber.toText(20)
    assert(r == "Twenty")
  }

  test("text for thirty-seven") {
    var r: String = TextNumber.toText(37, false)
    assert(r == "thirty-seven")
  }

  test("1,234,000") {
    var r: String = TextNumber.toText(1234000, false)
    assert(r == "one million two hundred thirty-four thousand")
  }
}
