package ThirtyDayChallenge.Week1

import org.scalatest.FunSuite

class P1SingleNumberTest extends FunSuite {
  test("1") {
    assert(P1SingleNumber.singleNumber(Array(2, 2, 1)) === 1)
    assert(P1SingleNumber.singleNumber(Array(4, 1, 2, 1, 2)) === 4)
  }
}
