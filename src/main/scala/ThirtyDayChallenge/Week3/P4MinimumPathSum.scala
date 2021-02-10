package ThirtyDayChallenge.Week3

object P4MinimumPathSum {
  def minPathSum(grid: Array[Array[Int]]): Int = {
    if (grid == null || grid.length == 0 || grid(0).length == 0) return 0
    val height = grid.length
    val length = grid(0).length

    var i = 0
    var j = 1
    while (i < height) {
      while (j < length) {
        val up   = if (i - 1 >= 0) grid(i - 1)(j) else Integer.MAX_VALUE
        val back = if (j - 1 >= 0) grid(i)(j - 1) else Integer.MAX_VALUE
        grid(i)(j) = Math.min(up, back) + grid(i)(j)
        j += 1
      }
      i += 1
      j = 0
    }

    grid.last.last
  }
  def minPathSum1(grid: Array[Array[Int]]): Int = {
    if (grid == null || grid.length == 0 || grid(0).length == 0) return 0
    val height = grid.length
    val length = grid(0).length

    val sums = grid.map(_.map(_ => Integer.MAX_VALUE))

    def explore(i: Int, j: Int, sum: Int): Unit = {
      sums(i)(j) = sum
      if (i + 1 < height && sums(i + 1)(j) > sum + grid(i + 1)(j)) explore(i + 1, j, sum + grid(i + 1)(j))
      if (j + 1 < length && sums(i)(j + 1) > sum + grid(i)(j + 1)) explore(i, j + 1, sum + grid(i)(j + 1))
    }

    explore(0, 0, grid.head.head)

    sums.last.last
  }
}
