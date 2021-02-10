package ThirtyDayChallenge.Week1

import org.scalatest.FunSuite

class P7CountingElementsTest extends FunSuite {
  test("1") {
    assert(P7CountingElements.countElements(Array(1, 2, 3)) === 2)
    assert(P7CountingElements.countElements(Array(1, 1, 3, 3, 5, 5, 7, 7)) === 0)
    assert(P7CountingElements.countElements(Array(1, 3, 2, 3, 5, 0)) === 3)
    assert(P7CountingElements.countElements(Array(1, 1, 2, 2)) === 2)
  }
}
