val operation = Array(
      "put"
    , "put"
    , "put"
    , "put"
    , "put"
    , "get"
    , "put"
    , "get"
    , "get"
    , "put"
    , "get"
    , "put"
    , "put"
    , "put"
    , "get"
    , "put"
    , "get"
    , "get"
    , "get"
    , "get"
    , "put"
    , "put"
    , "get"
    , "get"
    , "get"
    , "put"
    , "put"
    , "get"
    , "put"
    , "get"
    , "put"
    , "get"
    , "get"
    , "get"
    , "put"
    , "put"
    , "put"
    , "get"
    , "put"
    , "get"
    , "get"
    , "put"
    , "put"
    , "get"
    , "put"
    , "put"
    , "put"
    , "put"
    , "get"
    , "put"
    , "put"
    , "get"
    , "put"
    , "put"
    , "get"
    , "put"
    , "put"
    , "put"
    , "put"
    , "put"
    , "get"
    , "put"
    , "put"
    , "get"
    , "put"
    , "get"
    , "get"
    , "get"
    , "put"
    , "get"
    , "get"
    , "put"
    , "put"
    , "put"
    , "put"
    , "get"
    , "put"
    , "put"
    , "put"
    , "put"
    , "get"
    , "get"
    , "get"
    , "put"
    , "put"
    , "put"
    , "get"
    , "put"
    , "put"
    , "put"
    , "get"
    , "put"
    , "put"
    , "put"
    , "get"
    , "get"
    , "get"
    , "put"
    , "put"
    , "put"
    , "put"
    , "get"
    , "put"
    , "put"
    , "put"
    , "put"
    , "put"
    , "put"
    , "put"
  )
val input = Array(
      Array(10, 13)
    , Array(3, 17)
    , Array(6, 11)
    , Array(10, 5)
    , Array(9, 10)
    , Array(13)
    , Array(2, 19)
    , Array(2)
    , Array(3)
    , Array(5, 25)
    , Array(8)
    , Array(9, 22)
    , Array(5, 5)
    , Array(1, 30)
    , Array(11)
    , Array(9, 12)
    , Array(7)
    , Array(5)
    , Array(8)
    , Array(9)
    , Array(4, 30)
    , Array(9, 3)
    , Array(9)
    , Array(10)
    , Array(10)
    , Array(6, 14)
    , Array(3, 1)
    , Array(3)
    , Array(10, 11)
    , Array(8)
    , Array(2, 14)
    , Array(1)
    , Array(5)
    , Array(4)
    , Array(11, 4)
    , Array(12, 24)
    , Array(5, 18)
    , Array(13)
    , Array(7, 23)
    , Array(8)
    , Array(12)
    , Array(3, 27)
    , Array(2, 12)
    , Array(5)
    , Array(2, 9)
    , Array(13, 4)
    , Array(8, 18)
    , Array(1, 7)
    , Array(6)
    , Array(9, 29)
    , Array(8, 21)
    , Array(5)
    , Array(6, 30)
    , Array(1, 12)
    , Array(10)
    , Array(4, 15)
    , Array(7, 22)
    , Array(11, 26)
    , Array(8, 17)
    , Array(9, 29)
    , Array(5)
    , Array(3, 4)
    , Array(11, 30)
    , Array(12)
    , Array(4, 29)
    , Array(3)
    , Array(9)
    , Array(6)
    , Array(3, 4)
    , Array(1)
    , Array(10)
    , Array(3, 29)
    , Array(10, 28)
    , Array(1, 20)
    , Array(11, 13)
    , Array(3)
    , Array(3, 12)
    , Array(3, 8)
    , Array(10, 9)
    , Array(3, 26)
    , Array(8)
    , Array(7)
    , Array(5)
    , Array(13, 17)
    , Array(2, 27)
    , Array(11, 15)
    , Array(12)
    , Array(9, 19)
    , Array(2, 15)
    , Array(3, 16)
    , Array(1)
    , Array(12, 17)
    , Array(9, 1)
    , Array(6, 19)
    , Array(4)
    , Array(5)
    , Array(5)
    , Array(8, 1)
    , Array(11, 7)
    , Array(5, 2)
    , Array(9, 28)
    , Array(1)
    , Array(2, 2)
    , Array(7, 4)
    , Array(4, 22)
    , Array(7, 24)
    , Array(9, 26)
    , Array(13, 28)
    , Array(11, 26)
  )

operation.indices.foreach { idx =>
  operation(idx) match {
      case "put" => println(s"cache.put(${input(idx).head}, ${input(idx).last})")
      case "get" => println(s"assert(cache.get(${input(idx).head}) == ${input(idx).head})")
  }
}