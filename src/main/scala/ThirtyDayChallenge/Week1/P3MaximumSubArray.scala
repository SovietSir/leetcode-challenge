package ThirtyDayChallenge.Week1

import utils.IterablePrettyPrint.pprint

object P3MaximumSubArray {
  def maxSubArray1(nums: Array[Int]): Int = {
    def find(arr: Array[Int], comparator: (Int, Int) => Boolean): (Int, Int) = {
      var value = arr.head
      var index = 0
      var i     = 0
      while (i < arr.length) {
        if (comparator(arr(i), value)) {
          value = arr(i)
          index = i
        }
        i += 1
      }
      (value, index)
    }

    var curSum = 0
    val sumArr = nums.map { n =>
      curSum += n
      curSum
    }

    curSum = 0
    val sumArrRev = nums.reverse.map { n =>
      curSum += n
      curSum
    }

    pprint(sumArr)

    val bigger  = (a: Int, b: Int) => a >= b
    val smaller = (a: Int, b: Int) => a < b

    val (maxSumStr, maxSumStrIndex) = find(sumArr, bigger)
    val (minSumStr, _)              = find(sumArr.take(maxSumStrIndex + 1), smaller)

    val (maxSumRev, maxSumRevIndex) = find(sumArrRev, bigger)
    val (minSumRev, _)              = find(sumArrRev.take(maxSumRevIndex + 1), smaller)

    print(
      s"  maxSumStr=$maxSumStr, minSumStr=$minSumStr, diffStr=${maxSumStr - minSumStr}, maxSumRev=$maxSumRev, minSumRev=$minSumRev, diffRev=${maxSumRev - minSumRev}"
    )

    val (maxNum, _) = find(nums, bigger)
    val (maxSum, minSum) =
      if ((maxSumStr - minSumStr > maxSumRev - minSumRev) || ((maxSumStr - minSumStr == maxSumRev - minSumRev) && maxSumStr > maxSumRev))
        (maxSumStr, minSumStr)
      else (maxSumRev, minSumRev)

    val result =
      if (maxNum <= 0) maxNum
      else if (maxSum == minSum || minSum >= 0) maxSum
      else maxSum - minSum

    print(s"  Result is: $result")
    result
  }

  def maxSubArray2(nums: Array[Int]): Int = {
    var max    = nums.head
    var subSum = nums.head
    var i      = 1
    while (i < nums.length) {
      val increase = nums(i)
      if (increase <= 0) {
        if (subSum < increase) subSum = increase
        else subSum += increase
      } else {
        if (subSum < 0) subSum = increase
        else subSum += increase
      }
      if (max < subSum) max = subSum
      i += 1
    }
    max
  }

  def maxSubArray3(nums: Array[Int]): Int = {
    var max    = nums.head
    var subSum = nums.head
    var i      = 1
    while (i < nums.length) {
      val increase = nums(i)
      val sum      = subSum + increase
      if (increase < sum) subSum = sum else subSum = increase
      if (max < subSum) max = subSum
      i += 1
    }
    max
  }
  def maxSubArray(nums: Array[Int]): Int = {
    var max = Integer.MIN_VALUE
    var sum = 0
    var i   = 0
    while (i < nums.length) {
      sum += nums(i)
      if (sum > max) max = sum
      if (sum < 0) sum = 0
      i += 1
    }
    max
  }
}
