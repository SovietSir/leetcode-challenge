package ThirtyDayChallenge.Week3

import org.scalatest.FunSuite

class P2ValidParenthesisStringTest extends FunSuite {
  test("1") {
    assert(P2ValidParenthesisString.checkValidString("()") === true)
    assert(P2ValidParenthesisString.checkValidString("(*)") === true)
    assert(P2ValidParenthesisString.checkValidString("(*))") === true)
    assert(P2ValidParenthesisString.checkValidString(")") === false)
    assert(P2ValidParenthesisString.checkValidString("())") === false)
    assert(P2ValidParenthesisString.checkValidString("(*****)))") === true)
    assert(P2ValidParenthesisString.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*") === false)
    assert(P2ValidParenthesisString.checkValidString("(())(())(((()*()()()))()((()()(*()())))(((*)()") === false)
  }
}
