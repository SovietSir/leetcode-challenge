package ThirtyDayChallenge.Week2

object P7PerformStringShifts {
  def stringShift(s: String, shift: Array[Array[Int]]): String = {
    val totalShiftMap = shift.groupMapReduce(_(0) == 0)(_(1))(_ + _)
    val totalShift    = totalShiftMap(false) - totalShiftMap(true)
    val length        = s.length
    val resultShift   = totalShift % length
    val charArray     = Array.fill(length * 3)("")
    s.indices.foreach(idx => charArray(idx + length + resultShift) = s(idx).toString)
    val head = charArray.slice(length * 2, charArray.length).mkString
    val body = charArray.slice(length, length * 2).mkString
    val tail = charArray.slice(0, length).mkString
    head + body + tail
  }
}
