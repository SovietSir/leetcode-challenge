package CommonProblems

import org.scalatest.FunSuite

class P1394FindLuckyIntegerInAnArrayTest extends FunSuite {
  test("1") {
    assert(P1394FindLuckyIntegerInAnArray.findLucky(Array(2,2,3,4)) === 2)
    assert(P1394FindLuckyIntegerInAnArray.findLucky(Array(1,2,2,3,3,3)) === 3)
    assert(P1394FindLuckyIntegerInAnArray.findLucky(Array(2,2,2,3,3)) === -1)
    assert(P1394FindLuckyIntegerInAnArray.findLucky(Array(5)) === -1)
    assert(P1394FindLuckyIntegerInAnArray.findLucky(Array(7,7,7,7,7,7,7)) === 7)
  }
}
