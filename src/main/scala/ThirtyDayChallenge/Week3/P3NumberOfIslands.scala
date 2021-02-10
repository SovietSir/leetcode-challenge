package ThirtyDayChallenge.Week3

object P3NumberOfIslands {
  def numIslands(grid: Array[Array[Char]]): Int = {
    if (grid == null) return 0
    val height = grid.length
    val length = if (grid.length > 0) grid(0).length else 0

    def explore(i: Int, j: Int): Unit = {
      grid(i)(j) = 'x'
      if (i + 1 < height && grid(i + 1)(j) == '1') explore(i + 1, j)
      if (j + 1 < length && grid(i)(j + 1) == '1') explore(i, j + 1)
      if (i - 1 >= 0 && grid(i - 1)(j) == '1') explore(i - 1, j)
      if (j - 1 >= 0 && grid(i)(j - 1) == '1') explore(i, j - 1)
    }

    var i       = 0
    var j       = 0
    var islands = 0
    while (i < height) {
      while (j < length) {
        if (grid(i)(j) == '1') {
          islands += 1
          explore(i, j)
        }
        j += 1
      }
      i += 1
      j = 0
    }
    islands
  }
}
