package ThirtyDayChallenge.Week2

object P1MiddleOfTheLinkedList {
  def middleNode(head: ListNode): ListNode = {
    var node = head
    var i    = 0
    val map  = scala.collection.mutable.Map(i -> head)
    while (node.next != null) {
      i += 1
      node = node.next
      map.addOne(i -> node)
    }
    map(map.size / 2)
  }
}

class ListNode(var _x: Int = 0) {
  var next: ListNode = _
  var x: Int         = _x
}
