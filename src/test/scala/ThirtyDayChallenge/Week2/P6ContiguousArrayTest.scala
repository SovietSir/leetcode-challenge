package ThirtyDayChallenge.Week2

import org.scalatest.FunSuite

class P6ContiguousArrayTest extends FunSuite {
  test("1") {
    assert(P6ContiguousArray.findMaxLength(Array(0)) === 0)
    assert(P6ContiguousArray.findMaxLength(Array(1, 1, 1)) === 0)
    assert(P6ContiguousArray.findMaxLength(Array()) === 0)
    assert(P6ContiguousArray.findMaxLength(Array(0, 1)) === 2)
    assert(P6ContiguousArray.findMaxLength(Array(0, 1, 0)) === 2)
    assert(P6ContiguousArray.findMaxLength(Array(0, 1, 0, 0, 0, 1, 1, 0, 1, 1)) === 10)
  }
}
