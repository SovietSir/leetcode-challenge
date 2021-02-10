package ThirtyDayChallenge.Week3

import org.scalatest.FunSuite

class P4MinimumPathSumTest extends FunSuite {
  test("1") {
    assert(
        P4MinimumPathSum.minPathSum(
          Array(
            Array(1, 3, 1)
          , Array(1, 5, 1)
          , Array(4, 2, 1)
        )
      ) === 7
    )
  }
}
