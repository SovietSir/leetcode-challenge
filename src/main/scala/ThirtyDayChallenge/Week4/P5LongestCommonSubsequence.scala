package ThirtyDayChallenge.Week4

import scala.collection.mutable

object P5LongestCommonSubsequence {
  def longestCommonSubsequence(text1: String, text2: String): Int = {
    val charMap = mutable.Map.empty[Char, Int]
    text1.indices.foreach(idx => charMap.getOrElseUpdate(text1(idx), idx))

    2
  }
}
