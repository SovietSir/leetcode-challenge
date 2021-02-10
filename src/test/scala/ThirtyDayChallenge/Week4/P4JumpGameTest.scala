package ThirtyDayChallenge.Week4

import org.scalatest.FunSuite

class P4JumpGameTest extends FunSuite {
  test("1") {
    assert(P4JumpGame.canJump(Array(2, 3, 1, 1, 4)))
    assert(!P4JumpGame.canJump(Array(3, 2, 1, 0, 4)))
  }
}
