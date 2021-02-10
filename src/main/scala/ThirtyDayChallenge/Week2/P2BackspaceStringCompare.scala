package ThirtyDayChallenge.Week2

object P2BackspaceStringCompare {
  def backspaceCompare(S: String, T: String): Boolean = {
    var Si = S.length - 1
    var Ti = T.length - 1
    while (Si >= 0 && Ti >= 0) {
      var cnt = 0
      while (Si > 0 && cnt < 1) {
        if (S(Si) == '#') cnt -= 1 else cnt += 1
      }
      val nextSChar = if (cnt == 1) S(Si).toString else ""
      cnt = 0
      while (Ti > 0 && cnt < 1) {
        if (T(Ti) == '#') cnt -= 1 else cnt += 1
      }
      val nextTChar = if (cnt == 1) T(Ti).toString else ""
      if (!nextSChar.contentEquals(nextTChar)) return false
      Si -= 1
      Ti -= 1
    }
    if (Si == Ti) true else false
//    var cnt = 0
//    if (Si > Ti) {
//      while (Si > 0 && cnt < 1) {
//        Si -= 1
//        if (S(Si) == '#') cnt -= 1 else cnt += 1
//      }
//    } else {
//      while (Ti > 0 && cnt < 1) {
//        Ti -= 1
//        if (T(Ti) == '#') cnt -= 1 else cnt += 1
//      }
//    }
//    if (cnt == 1) false else true
  }
}
