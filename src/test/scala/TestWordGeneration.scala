package org.aje.application

import org.scalatest.funsuite.AnyFunSuite

class TestWordGeneration extends AnyFunSuite {

  test("text for 99999") {
    val r: List[Int] = TextNumber.getValues(List(99999))
    assert (r.length == 6) // 99999, 45, 10, 3, 5, 4
    assert (r.sum == 99999 + 45 + 10 + 3 + 5 + 4)
    assert (r.last == 4)
  }

  test("text for 1,234,000") {
    val r: List[Int] = TextNumber.getValues(List(1234000))
    assert (r.length == 6) // List(1234000, 44, 10, 3, 5, 4)
    assert (r.sum == 1234000 + 44 + 10 + 3 + 5 + 4)
    assert (r.last == 4)
  }
}
