package ThirtyDayChallenge.Week3

object P1ProductOfArrayExceptSelf {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    var product = 1
    val result = nums.map { v =>
      val curProduct = product
      product *= v
      curProduct
    }
    product = 1
    var idx = result.length - 1
    while (idx >= 0) {
      result(idx) *= product
      product *= nums(idx)
      idx -= 1
    }
    result
  }
  def productExceptSelf1(nums: Array[Int]): Array[Int] = {
    val filteredNums = nums.filter(_ != 0)
    val diffLen      = nums.length - filteredNums.length
    diffLen match {
      case 0 =>
        val product = filteredNums.product
        nums.map(product / _)
      case 1 =>
        val product = filteredNums.product
        nums.map(v => if (v != 0) 0 else product)
      case _ => Array.fill(nums.length)(0)
    }
  }
}
