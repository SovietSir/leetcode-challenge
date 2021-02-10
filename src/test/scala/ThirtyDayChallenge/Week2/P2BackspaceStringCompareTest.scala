package ThirtyDayChallenge.Week2

import org.scalatest.FunSuite

class P2BackspaceStringCompareTest extends FunSuite {
  ignore("1") {
    assert(P2BackspaceStringCompare.backspaceCompare("ab#c", "ad#c") === true)
    assert(P2BackspaceStringCompare.backspaceCompare("ab##", "c#d#") === true)
    assert(P2BackspaceStringCompare.backspaceCompare("a##c", "#a#c") === true)
    assert(P2BackspaceStringCompare.backspaceCompare("a#c", "b") === false)
    assert(P2BackspaceStringCompare.backspaceCompare("nzp#o#g", "b#nzp#o#g") === true)
    assert(P2BackspaceStringCompare.backspaceCompare("bbbextm", "bbb#extm") === false)
  }
}
