package ThirtyDayChallenge.Week4

object P4JumpGame {
  def canJump(nums: Array[Int]): Boolean = {
    if (nums == null || nums.length < 2) return true
    var idx        = nums.length - 2
    var jumpLength = 1
    while (idx > -1) {
      if (nums(idx) >= jumpLength) jumpLength = 1
      else jumpLength += 1
      idx -= 1
    }
    nums.head >= jumpLength
  }
}
