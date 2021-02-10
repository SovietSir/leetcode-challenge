package utils

object IterablePrettyPrint {
  def pprint(it: Iterable[_], tag: String = "Data"): Unit = {
    println()
    print(s"$tag: ")
    it.foreach(elem => print(s"$elem, "))
  }
}
