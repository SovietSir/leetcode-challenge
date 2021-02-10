package ThirtyDayChallenge.Week1

import utils.IterablePrettyPrint

import scala.annotation.tailrec
import scala.collection.mutable

object P2HappyNumber {
  def isHappy1(n: Int): Boolean = {
    val memSet = mutable.Set.empty[Int]
    @tailrec
    def checkLoop(in: Int): Boolean = {
      val res = getDigitsSqrtSum(in)
      if (res == 1) true
      else if (memSet.contains(res)) false
      else {
        memSet += res
        checkLoop(res)
      }
    }

    def getDigitsSqrtSum(in: Int): Int = {
      @tailrec
      def loop(in: Int, sum: Int): Int =
        if (in == 0) sum
        else {
          val lastDigit = in % 10
          val rest      = in / 10
          loop(rest, lastDigit * lastDigit + sum)
        }
      loop(in.abs, 0)
    }

    checkLoop(n)
  }
  def isHappy2(n: Int): Boolean = {
    var slow = n
    var fast = n

    var slowList = mutable.Seq.empty[Int]
    var fastList = mutable.Seq.empty[Int]

    while (fast != 1) {
      slow = getSumSquare(slow)
      fast = getSumSquare(getSumSquare(getSumSquare(fast)))

      slowList = slowList :+ slow
      fastList = fastList :+ fast

      if (slow == fast && slow != 1) {
        IterablePrettyPrint.pprint(slowList, "slowList")
        IterablePrettyPrint.pprint(fastList, "fastList")
        return false
      }
    }

    true
  }

  def isHappy3(n: Int): Boolean = {
    var num    = getSumSquare(n)
    val memSet = mutable.Set.empty[Int]
    while (num != 1) {
      if (memSet.contains(num)) return false
      memSet += num
      num = getSumSquare(num)
    }
    true
  }

  def getSumSquare(n: Int): Int = {
    var x   = n
    var sum = 0
    while (x > 0) {
      val c = x % 10
      x = x / 10
      sum = sum + c * c
    }
    sum
  }
}
