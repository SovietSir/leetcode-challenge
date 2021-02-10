package ThirtyDayChallenge.Week3

object P2ValidParenthesisString {
  def checkValidString(s: String): Boolean = {
    var lp     = 0
    var rp     = 0
    var mul    = 0
    var closed = 0
    s.foreach { char =>
      if (char == '(') lp += 1
      if (char == ')') rp += 1
      if (char == '*') {
        mul += 1
        closed += 1
      }
      if (rp > lp + mul) return false
      closed = Math.min(closed, lp - rp)
    }
    if (rp == lp) true
    else if (lp > rp && lp - rp <= closed) true
    else if (lp < rp && rp - lp <= mul) true
    else false
  }
}
