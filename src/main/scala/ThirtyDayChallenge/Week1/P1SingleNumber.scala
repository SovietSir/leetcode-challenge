package ThirtyDayChallenge.Week1

object P1SingleNumber {
  def singleNumber(nums: Array[Int]): Int = {
    val sortedNums = nums.sorted
    var i          = 0
    while (i < nums.length - 2) {
      if (sortedNums(i) != sortedNums(i + 1)) return sortedNums(i)
      i += 2
    }
    sortedNums(nums.length - 1)
  }
}
