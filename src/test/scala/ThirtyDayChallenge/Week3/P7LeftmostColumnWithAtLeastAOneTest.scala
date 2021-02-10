package ThirtyDayChallenge.Week3

import org.scalatest.FunSuite

class P7LeftmostColumnWithAtLeastAOneTest extends FunSuite {
  test("1") {
    val matrix = BinaryMatrix(
        Array(
          Array(0, 0)
        , Array(1, 1)
      )
    )

    assert(
        P7LeftmostColumnWithAtLeastAOne.leftMostColumnWithOne(matrix) === 0
    )
  }
  test("2") {
    val matrix = BinaryMatrix(
        Array(
          Array(0, 0)
        , Array(0, 1)
      )
    )

    assert(
        P7LeftmostColumnWithAtLeastAOne.leftMostColumnWithOne(matrix) === 1
    )
  }
  test("3") {
    val matrix = BinaryMatrix(
        Array(
          Array(0, 0)
        , Array(0, 0)
      )
    )

    assert(
        P7LeftmostColumnWithAtLeastAOne.leftMostColumnWithOne(matrix) === -1
    )
  }
  test("4") {
    val matrix = BinaryMatrix(
        Array(
          Array(0, 0, 0, 1)
        , Array(0, 0, 1, 1)
        , Array(0, 1, 1, 1)
      )
    )

    assert(
        P7LeftmostColumnWithAtLeastAOne.leftMostColumnWithOne(matrix) === 1
    )
  }
  test("5") {
    val matrix = BinaryMatrix(
        Array(
          Array(0, 0, 0, 1)
        , Array(0, 0, 1, 1)
        , Array(0, 1, 1, 1)
        , Array(1, 1, 1, 1)
      )
    )

    assert(
        P7LeftmostColumnWithAtLeastAOne.leftMostColumnWithOne(matrix) === 0
    )
  }
}
