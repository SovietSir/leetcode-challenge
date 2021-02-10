package ThirtyDayChallenge.Week4

import ThirtyDayChallenge.Week4.P3LruCache.LRUCache
import org.scalatest.FunSuite

class P3LruCacheTest extends FunSuite {
  test("1") {
    val cache = new LRUCache(_capacity = 2)
    cache.put(1, 1)
    cache.put(2, 2)
    assert(cache.get(1) == 1)  // returns 1
    cache.put(3, 3)            // evicts key 2
    assert(cache.get(2) == -1) // returns -1 (not found)
    cache.put(4, 4)            // evicts key 1
    assert(cache.get(1) == -1) // returns -1 (not found)
    assert(cache.get(3) == 3)  // returns 3
    assert(cache.get(4) == 4)  // returns 4
  }
  test("2") {
    val cache = new LRUCache(_capacity = 2)
    cache.put(2, 1)
    cache.put(2, 2)
    assert(cache.get(2) == 2)
    cache.put(1, 1)
    cache.put(4, 1)
    assert(cache.get(2) == -1)
  }
  test("3") {
    val cache = new LRUCache(_capacity = 3)
    cache.put(1, 1)
    cache.put(2, 2)
    cache.put(3, 3)
    cache.put(4, 4)
    assert(cache.get(4) == 4)
    assert(cache.get(3) == 3)
    assert(cache.get(2) == 2)
    assert(cache.get(1) == -1)
    cache.put(5, 5)
    assert(cache.get(1) == -1)
    assert(cache.get(2) == 2)
    assert(cache.get(3) == 3)
    assert(cache.get(4) == -1)
    assert(cache.get(5) == 5)
  }
  test("4") {
    val cache = new LRUCache(_capacity = 10)
    cache.put(10, 13)
    cache.put(3, 17)
    cache.put(6, 11)
    cache.put(10, 5)
    cache.put(9, 10)
    assert(cache.get(13) == -1)
    cache.put(2, 19)
    assert(cache.get(2) == 19)
    assert(cache.get(3) == 17)
    cache.put(5, 25)
    assert(cache.get(8) == -1)
    cache.put(9, 22)
    cache.put(5, 5)
    cache.put(1, 30)
    assert(cache.get(11) == -1)
    cache.put(9, 12)
    assert(cache.get(7) == -1)
    assert(cache.get(5) == 5)
    assert(cache.get(8) == -1)
    assert(cache.get(9) == 12)
    cache.put(4, 30)
    cache.put(9, 3)
    assert(cache.get(9) == 3)
    assert(cache.get(10) == 5)
    assert(cache.get(10) == 5)
    cache.put(6, 14)
    cache.put(3, 1)
    assert(cache.get(3) == 1)
    cache.put(10, 11)
    assert(cache.get(8) == -1)
    cache.put(2, 14)
    assert(cache.get(1) == 30)
    assert(cache.get(5) == 5)
    assert(cache.get(4) == 30)
    cache.put(11, 4)
    cache.put(12, 24)
    cache.put(5, 18)
    assert(cache.get(13) == -1)
    cache.put(7, 23)
    assert(cache.get(8) == -1)
    assert(cache.get(12) == 24)
    cache.put(3, 27)
    cache.put(2, 12)
    assert(cache.get(5) == 18)
    cache.put(2, 9)
    cache.put(13, 4)
    cache.put(8, 18)
    cache.put(1, 7)
    assert(cache.get(6) == -1)
    cache.put(9, 29)
    cache.put(8, 21)
    assert(cache.get(5) == 18)
    cache.put(6, 30)
    cache.put(1, 12)
    assert(cache.get(10) == -1)
    cache.put(4, 15)
    cache.put(7, 22)
    cache.put(11, 26)
    cache.put(8, 17)
    cache.put(9, 29)
    assert(cache.get(5) == 18)
    cache.put(3, 4)
    cache.put(11, 30)
    assert(cache.get(12) == -1)
    cache.put(4, 29)
    assert(cache.get(3) == 4)
    assert(cache.get(9) == 29)
    assert(cache.get(6) == 30)
    cache.put(3, 4)
    assert(cache.get(1) == 12)
    assert(cache.get(10) == -1)
    cache.put(3, 29)
    cache.put(10, 28)
    cache.put(1, 20)
    cache.put(11, 13)
    assert(cache.get(3) == 29)
    cache.put(3, 12)
    cache.put(3, 8)
    cache.put(10, 9)
    cache.put(3, 26)
    assert(cache.get(8) == 17)
    assert(cache.get(7) == 22)
    assert(cache.get(5) == 18)
    cache.put(13, 17)
    cache.put(2, 27)
    cache.put(11, 15)
    assert(cache.get(12) == -1)
    cache.put(9, 19)
    cache.put(2, 15)
    cache.put(3, 16)
    assert(cache.get(1) == 20)
    cache.put(12, 17)
    cache.put(9, 1)
    cache.put(6, 19)
    assert(cache.get(4) == -1)
    assert(cache.get(5) == 18)
    assert(cache.get(5) == 18)
    cache.put(8, 1)
    cache.put(11, 7)
    cache.put(5, 2)
    cache.put(9, 28)
    assert(cache.get(1) == 20)
    cache.put(2, 2)
    cache.put(7, 4)
    cache.put(4, 22)
    cache.put(7, 24)
    cache.put(9, 26)
    cache.put(13, 28)
    cache.put(11, 26)
  }
}
