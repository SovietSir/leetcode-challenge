package ThirtyDayChallenge.Week1

import scala.collection.mutable

object P6GroupAnagrams {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    val keyMap = scala.collection.mutable.Map[String, List[Int]]()
    strs.indices.map { i =>
      val keyArr = scala.collection.mutable.ArrayBuffer.fill(26)(0)
      strs(i).foreach(char => keyArr(char - 'a') += 1)
      keyMap.updateWith(keyArr.toString)(v => Some(v.getOrElse(List.empty) :+ i))
    }

    keyMap.values.map(_.map(strs(_))).toList
  }

  def groupAnagrams1(strs: Array[String]): List[List[String]] = {
    val charMap = scala.collection.mutable.Map[(Int, Char), Int]()
    for {
      i    <- strs.indices
      char <- strs(i)
      _ = charMap.updateWith(i, char)(v => Some(v.getOrElse(0) + 1))
    } yield ()

    val charSet               = charMap.keys.map(_._2).toSet
    var coll: List[List[Int]] = List(strs.indices.toList)

    charSet.foreach(char => coll = coll.flatMap(_.groupBy(i => charMap.getOrElse((i, char), 0)).values))

    coll.map(_.map(strs(_)))
  }

  def groupAnagrams2(strs: Array[String]): List[List[String]] = {
    val charMap = mutable.Map[(Int, Char), Int]()
    for {
      i    <- strs.indices
      char <- strs(i)
      _ = charMap.updateWith(i, char)(v => Some(v.getOrElse(0) + 1))
    } yield ()

    val charSet                             = charMap.keys.map(_._2).toSet
    var coll: mutable.Seq[mutable.Seq[Int]] = mutable.Seq(mutable.Seq.from(strs.indices))

    @scala.annotation.tailrec
    def loop(charSet: Set[Char]): Unit =
      if (charSet.isEmpty) ()
      else {
        val char = charSet.head
        coll = coll.flatMap(_.groupBy(i => charMap.getOrElse((i, char), 0)).values)
        loop(charSet.tail)
      }

    loop(charSet)

    coll.map(_.map(strs(_)).toList).toList
  }
}
