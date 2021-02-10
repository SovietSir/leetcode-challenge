package ThirtyDayChallenge.Week1

object P4MoveZeroes {
  def moveZeroes(nums: Array[Int]): Unit = {
    var pos = nums.length - 2
    while (pos > -1) {
      if (nums(pos) == 0) {
        var i = pos + 1
        while (i < nums.length && nums(i) != 0) {
          val tmp = nums(i)
          nums(i) = 0
          nums(i - 1) = tmp
          i += 1
        }
      }
      pos -= 1
    }
  }
}
