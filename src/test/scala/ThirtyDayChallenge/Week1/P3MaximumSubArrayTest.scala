package ThirtyDayChallenge.Week1

import org.scalatest.FunSuite

class P3MaximumSubArrayTest extends FunSuite {
  test("1") {
    assert(P3MaximumSubArray.maxSubArray(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) === 6)
    assert(P3MaximumSubArray.maxSubArray(Array(4)) === 4)
    assert(P3MaximumSubArray.maxSubArray(Array(-1, 5, -1)) === 5)
    assert(P3MaximumSubArray.maxSubArray(Array(-1, -2)) === -1)
    assert(P3MaximumSubArray.maxSubArray(Array(-2, -1)) === -1)
    assert(P3MaximumSubArray.maxSubArray(Array(-1, 0)) === 0)
    assert(P3MaximumSubArray.maxSubArray(Array(1, 2)) === 3)
    assert(P3MaximumSubArray.maxSubArray(Array(-2, 1)) === 1)
    assert(P3MaximumSubArray.maxSubArray(Array(1, -1, -2)) === 1)
    assert(P3MaximumSubArray.maxSubArray(Array(-1, 0, -2, 2)) === 2)
    assert(P3MaximumSubArray.maxSubArray(Array(0, -3, 1, 1)) === 2)
    assert(P3MaximumSubArray.maxSubArray(Array(-2, -2, -3, 0, -3, 1, -3)) === 1)
    assert(P3MaximumSubArray.maxSubArray(Array(0, -3, -2, -3, -2, 2, -3, 0, 1, -1)) === 2)
  }
}
