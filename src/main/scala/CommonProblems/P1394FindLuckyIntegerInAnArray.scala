package CommonProblems

object P1394FindLuckyIntegerInAnArray {
  def findLucky(arr: Array[Int]): Int = {
    val seeds = new Array[Int](501)
    arr.foreach(elem => seeds(elem) = seeds(elem) + 1)
    var i = arr.length
    while (i > 0) {
      if (seeds(i) == i) return i
      i -= 1
    }
    -1
  }
}
