package ThirtyDayChallenge.Week3

import org.scalatest.FunSuite

class P1ProductOfArrayExceptSelfTest extends FunSuite {
  test("1") {
    assert(P1ProductOfArrayExceptSelf.productExceptSelf(Array(1, 2, 3, 4)) === Array(24, 12, 8, 6))
    assert(P1ProductOfArrayExceptSelf.productExceptSelf(Array(0, 2, 3, 4)) === Array(24, 0, 0, 0))
    assert(P1ProductOfArrayExceptSelf.productExceptSelf(Array(0, 2, 3, 0)) === Array(0, 0, 0, 0))
  }
}
