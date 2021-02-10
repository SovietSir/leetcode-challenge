package ThirtyDayChallenge.Week4

object P2BitwiseAndOfNumbersRange {
  def rangeBitwiseAnd(m: Int, n: Int): Int = {
    if (m == n) return n
    var mul = m
    for (elem <- m + 1 to n) mul &= elem
    mul
  }
}
