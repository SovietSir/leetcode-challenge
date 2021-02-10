package ThirtyDayChallenge.Week2

object P5LastStoneWeight {
  def lastStoneWeight(stones: Array[Int]): Int = {
    var sortedStones = stones.sorted(implicitly[Ordering[Int]].reverse)
    while (sortedStones.length > 1) {
      val st1  = sortedStones(0)
      val st2  = sortedStones(1)
      val diff = Math.abs(st1 - st2)
      sortedStones = sortedStones.slice(2, sortedStones.length)
      if (diff != 0) {
        if (sortedStones.isEmpty) sortedStones = Array(diff)
        else if (diff >= sortedStones.head) sortedStones = sortedStones.prepended(diff)
        else if (diff <= sortedStones.last) sortedStones = sortedStones.appended(diff)
        else {
          var i = 0
          while (diff < sortedStones(i)) i += 1
          sortedStones = sortedStones.slice(0, i).appended(diff) ++ sortedStones.slice(i, sortedStones.length)
        }
      }
    }
    if (sortedStones.isEmpty) 0 else sortedStones.head
  }
}
