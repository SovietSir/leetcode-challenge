package ThirtyDayChallenge.Week4

import org.scalatest.FunSuite

class P1SubarraySumEqualsKTest extends FunSuite {
  test("1") {
    assert(P1SubarraySumEqualsK.subarraySum(Array(1, 1, 1), 2) === 2)
    assert(P1SubarraySumEqualsK.subarraySum(Array(-6, 6, 1, 1, -6, 6), 2) === 5)
    assert(P1SubarraySumEqualsK.subarraySum(Array(-1), 0) === 0)
    assert(P1SubarraySumEqualsK.subarraySum(Array(-1, -1, 1), 0) === 1)
    assert(P1SubarraySumEqualsK.subarraySum(Array(-1, -1, 1), 1) === 1)
  }
}
