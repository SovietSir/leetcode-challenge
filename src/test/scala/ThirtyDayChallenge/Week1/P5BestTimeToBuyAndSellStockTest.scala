package ThirtyDayChallenge.Week1

import org.scalatest.FunSuite

class P5BestTimeToBuyAndSellStockTest extends FunSuite {
  test("1") {
    assert(P5BestTimeToBuyAndSellStock.maxProfit(Array(7, 1, 5, 3, 6, 4)) === 7)
    assert(P5BestTimeToBuyAndSellStock.maxProfit(Array(1, 2, 3, 4, 5)) === 4)
    assert(P5BestTimeToBuyAndSellStock.maxProfit(Array(7, 6, 4, 3, 1)) === 0)
  }

  test("2") {
    assert(P5BestTimeToBuyAndSellStock.biggerFall(Array(7, 1, 5, 3, 6, 4)) === 6)
    assert(P5BestTimeToBuyAndSellStock.biggerFall(Array(1, 2, 3, 4, 5)) === 0)
    assert(P5BestTimeToBuyAndSellStock.biggerFall(Array(7, 6, 4, 3, 1)) === 6)
    assert(P5BestTimeToBuyAndSellStock.biggerFall(Array(1, 2, 3, 4, 5, 2, 3, 0, 1, 2)) === 5)
  }
}
