package ThirtyDayChallenge.Week1

object P5BestTimeToBuyAndSellStock {
  def maxProfit(prices: Array[Int]): Int =
    if (prices.isEmpty) 0
    else {
      var curMin = prices.head
      var i      = 1
      var profit = 0
      while (i < prices.length - 1) {
        if (prices(i) < curMin) curMin = prices(i)
        if (prices(i) > curMin && prices(i + 1) < prices(i)) {
          profit += prices(i) - curMin
          curMin = prices(i)
        }
        i += 1
      }
      if (curMin < prices.last) profit += prices.last - curMin
      profit
    }

  def biggerFall(points: Array[Int]): Int = {
    var curMax = points.head
    var curFall = 0
    var maxFall = 0
    var prevElem = points.head
    var i = 1


    while (i < points.length) {
      if (points(i) > prevElem) {
        if (curFall > maxFall) maxFall = curFall
        if (points(i) >= curMax) curMax = points(i)
      } else if (points(i) < prevElem) {
        curFall = curMax - points(i)
      }
      prevElem = points(i)
      i += 1
    }

    if(curFall > maxFall) curFall else maxFall
  }
}
