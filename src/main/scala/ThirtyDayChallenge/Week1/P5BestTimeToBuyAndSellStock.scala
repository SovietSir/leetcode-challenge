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
}
