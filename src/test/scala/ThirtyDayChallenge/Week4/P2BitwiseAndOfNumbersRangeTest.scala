package ThirtyDayChallenge.Week4

import org.scalatest.FunSuite

class P2BitwiseAndOfNumbersRangeTest extends FunSuite {
  test("1") {
    assert(P2BitwiseAndOfNumbersRange.rangeBitwiseAnd(5, 7) === 4)
    assert(P2BitwiseAndOfNumbersRange.rangeBitwiseAnd(0, 1) === 0)
  }
}
