package ThirtyDayChallenge.Week2

object P6ContiguousArray {
  def findMaxLength(nums: Array[Int]): Int = {
    val map   = scala.collection.mutable.Map(0 -> -1)
    var idx   = 0
    var value = 0
    var max   = 0
    while (idx < nums.length) {
      value = if (nums(idx) == 0) value - 1 else value + 1
      map.get(value) match {
        case None       => map.update(value, idx)
        case Some(init) => max = math.max(max, idx - init)
      }
      idx += 1
    }
    max
  }
}
