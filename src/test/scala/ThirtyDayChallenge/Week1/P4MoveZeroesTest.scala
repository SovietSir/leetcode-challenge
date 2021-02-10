package ThirtyDayChallenge.Week1

import org.scalatest.FunSuite

class P4MoveZeroesTest extends FunSuite {
  test("1") {
    val arr = Array(0, 1, 0, 3, 12)
    P4MoveZeroes.moveZeroes(arr)
    assert(arr === Array(1, 3, 12, 0, 0))
  }
  test("2") {
    val arr = Array(0, 0, 0, 0, 0)
    P4MoveZeroes.moveZeroes(arr)
    assert(arr === Array(0, 0, 0, 0, 0))
  }
}
