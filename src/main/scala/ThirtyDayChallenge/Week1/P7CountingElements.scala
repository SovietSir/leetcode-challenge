package ThirtyDayChallenge.Week1

object P7CountingElements {
  def countElements(arr: Array[Int]): Int = {
    val map = arr.groupBy(identity).view.mapValues(_.length).toMap
    var sum = 0
    for {
      i <- map.keys
      _ = if (map.contains(i + 1)) sum += map(i)
    } yield ()
    sum
  }

  def countElements1(arr: Array[Int]): Int = {
    val set = arr.toSet
    var sum = 0
    for {
      i <- arr
      _ = if (set.contains(i + 1)) sum += 1
    } yield ()
    sum
  }
}
