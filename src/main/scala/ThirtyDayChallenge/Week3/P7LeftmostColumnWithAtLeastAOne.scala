package ThirtyDayChallenge.Week3

object P7LeftmostColumnWithAtLeastAOne {
  def leftMostColumnWithOne(binaryMatrix: BinaryMatrix): Int = {
    var i      = 0
    var result = Integer.MAX_VALUE

    @scala.annotation.tailrec
    def seek(start: Int, end: Int): Unit = {
      val mid = (end + start) / 2
      val (newStart, newEnd) =
        if (binaryMatrix.get(i, mid) == 0) (mid + 1, end)
        else {
          result = Math.min(mid, result)
          (start, mid)
        }
      if (end != start) seek(newStart, newEnd)
    }

    val dim = binaryMatrix.dimensions()
    while (i < dim(0) && result > 0) {
      seek(0, dim(1) - 1)
      i += 1
    }
    if (result == Integer.MAX_VALUE) -1 else result
  }
}

class BinaryMatrix {
  private var mtx: Array[Array[Int]] = Array(Array(0))

  def get(x: Int, y: Int): Int = mtx(x)(y)
  def dimensions(): Array[Int] = Array(mtx.length, mtx.head.length)
}

object BinaryMatrix {
  def apply(mtx: Array[Array[Int]]): BinaryMatrix = {
    val matrix = new BinaryMatrix
    matrix.mtx = mtx
    matrix
  }
}
