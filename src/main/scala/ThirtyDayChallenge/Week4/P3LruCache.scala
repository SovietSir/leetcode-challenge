package ThirtyDayChallenge.Week4

object P3LruCache {
  class LRUCache1(_capacity: Int) {

    private val valuesMap = scala.collection.mutable.Map.empty[Int, Int]
    private val memoryMap = scala.collection.mutable.Map.empty[Int, (Int, Int)]

    private var lre = (-1, (-1, -1))
    private var mre = (-1, (-1, -1))

    private var full = false

    def get(key: Int): Int =
      valuesMap.get(key) match {
        case Some(value) =>
          update(key)
          value
        case None => -1
      }

    def put(key: Int, value: Int): Unit =
      valuesMap.get(key) match {
        case Some(_) =>
          update(key)
          valuesMap.put(key, value)
        case None =>
          if (!full) {
            val (mreKey, (mrePrev, mreFollow)) = mre
            memoryMap.put(key, (mreKey, mreFollow))
            mre = (key, (mreKey, mreFollow))
            if (mreKey != -1) memoryMap.put(mreKey, (mrePrev, key))
            if (lre._1 == -1) lre = (key, (mreKey, mreFollow))
            else if (lre._1 == mreKey) lre = (mreKey, (mrePrev, key))
            valuesMap.put(key, value)
            full = valuesMap.size == _capacity
          } else if (lre == mre) {
            val (mreKey, (mrePrev, mreFollow)) = mre
            memoryMap.put(key, (mrePrev, mreFollow))
            mre = (key, (mrePrev, mreFollow))
            lre = (key, (mrePrev, mreFollow))
            memoryMap.remove(mreKey)
            valuesMap.remove(mreKey)
            valuesMap.put(key, value)
          } else {
            val (lreKey, (lrePrev, lreFollow)) = lre
            val (mreKey, (mrePrev, mreFollow)) = mre
            memoryMap.put(key, (mreKey, mreFollow))
            if (mreKey == lreFollow) {
              memoryMap.put(mreKey, (lrePrev, key))
            } else {
              memoryMap.put(mreKey, (mrePrev, key))
              val (_, followFollow) = memoryMap(lreFollow)
              memoryMap.put(lreFollow, (lrePrev, followFollow))
            }
            mre = (key, (mreKey, mreFollow))
            lre = (lreFollow, memoryMap(lreFollow))
            memoryMap.remove(lreKey)
            valuesMap.remove(lreKey)
            valuesMap.put(key, value)
          }
      }

    private def update(key: Int): Unit =
      if (key != mre._1) {
        memoryMap.get(key) match {
          case Some((prev, follow)) =>
            if (prev > -1) {
              val (prePrev, _) = memoryMap(prev)
              memoryMap.put(prev, (prePrev, follow))
            }
            if (follow > -1) {
              val (_, followFollow) = memoryMap(follow)
              memoryMap.put(follow, (prev, followFollow))
            }
            val (mreKey, (mrePrev, mreFollow)) = mre
            if (mrePrev == key) {
              memoryMap.put(mreKey, (prev, key))
            } else {
              memoryMap.put(mreKey, (mrePrev, key))
            }
            memoryMap.put(key, (mreKey, mreFollow))
            mre = (key, (mreKey, mreFollow))
            if (key == lre._1) lre = (follow, memoryMap(follow))
            if (prev == lre._1) lre = (prev, memoryMap(prev))
          case None =>
        }
      }

    def validate(): Unit = {
      var follow  = lre._2._2
      var prev    = lre._1
      var isValid = true
      var size    = 1
      while (follow != -1) {
        val (newPrev, newFollow) = memoryMap(follow)
        isValid = prev == newPrev
        prev = follow
        follow = newFollow
        size += 1
      }
      if (isValid && lre._2 == memoryMap(lre._1) && mre == (prev, memoryMap(prev)) && size == memoryMap.size)
        println("Valid!")
      else
        println("Invalid!")
    }
  }
  class LRUCache(_capacity: Int) {

    private val map = scala.collection.mutable.LinkedHashMap.empty[Int, Int]

    def get(key: Int): Int =
      if (map.contains(key)) {
        val value = map(key)
        map.remove(key)
        map.put(key, value)
        value
      } else -1

    def put(key: Int, value: Int): Unit = {
      if (map.contains(key))
        map.remove(key)
      else if (map.size == _capacity)
        map.remove(map.head._1)
      map.put(key, value)
    }
  }
}
