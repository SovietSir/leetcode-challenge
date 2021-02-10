package ThirtyDayChallenge.Week2

import org.scalatest.FunSuite

class P7PerformStringShiftsTest extends FunSuite {
  test("1") {
    assert(P7PerformStringShifts.stringShift("abc", Array(Array(0, 1), Array(1, 2))) === "cab")
    assert(
        P7PerformStringShifts
        .stringShift("abcdefg", Array(Array(1, 1), Array(1, 1), Array(0, 2), Array(1, 3))) === "efgabcd"
    )
  }
}
