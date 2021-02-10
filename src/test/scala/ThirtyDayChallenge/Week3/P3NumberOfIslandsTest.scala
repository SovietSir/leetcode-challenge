package ThirtyDayChallenge.Week3

import org.scalatest.FunSuite

class P3NumberOfIslandsTest extends FunSuite {
  test("1") {
    assert(
        P3NumberOfIslands.numIslands(
          Array(
            Array('1', '1', '1', '1', '0')
          , Array('1', '1', '0', '1', '0')
          , Array('1', '1', '0', '0', '0')
          , Array('0', '0', '0', '0', '0')
        )
      ) === 1
    )
    assert(
        P3NumberOfIslands.numIslands(
          Array(
            Array('1', '1', '0', '0', '0')
          , Array('1', '1', '0', '0', '0')
          , Array('0', '0', '1', '0', '0')
          , Array('0', '0', '0', '1', '1')
        )
      ) === 3
    )
    assert(
        P3NumberOfIslands.numIslands(
          Array(
            Array('1', '1', '1')
          , Array('0', '1', '0')
          , Array('1', '1', '1')
        )
      ) === 1
    )
  }
}
