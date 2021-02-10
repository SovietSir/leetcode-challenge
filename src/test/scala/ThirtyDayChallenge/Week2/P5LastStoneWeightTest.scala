package ThirtyDayChallenge.Week2

import org.scalatest.FunSuite

class P5LastStoneWeightTest extends FunSuite {
  test("1") {
    assert(P5LastStoneWeight.lastStoneWeight(Array(2, 7, 4, 1, 8, 1)) === 1)
    assert(P5LastStoneWeight.lastStoneWeight(Array(1, 3)) === 2)
  }
}
