package ThirtyDayChallenge.Week4

object P1SubarraySumEqualsK {
  def subarraySum(nums: Array[Int], k: Int): Int = {
    var sum    = 0
    var result = 0
    val sumMap = scala.collection.mutable.Map(0 -> 1)
    nums.foreach { elem =>
      sum += elem
      sumMap.get(sum - k).foreach(result += _)
      sumMap.put(sum, sumMap.getOrElse(sum, 0) + 1)
    }
    result
  }
}
