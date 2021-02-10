package ThirtyDayChallenge.Week1

import org.scalatest.FunSuite

class P6GroupAnagramsTest extends FunSuite {
  test("1") {
    assert(
        P6GroupAnagrams
        .groupAnagrams(
            Array(
              "eat"
            , "tea"
            , "tan"
            , "ate"
            , "nat"
            , "bat"
          )
        ).toSet === Set(
          List("bat")
        , List("tan", "nat")
        , List("eat", "tea", "ate")
      )
    )
  }
}
