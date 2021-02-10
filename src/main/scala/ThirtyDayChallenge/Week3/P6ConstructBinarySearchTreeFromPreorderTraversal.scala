package ThirtyDayChallenge.Week3

object P6ConstructBinarySearchTreeFromPreorderTraversal {
  def bstFromPreorder(preorder: Array[Int]): TreeNode = {
    var traversal = preorder.tail
    var head      = preorder.head
    def loop(nodeValue: Int, parent: Int, ancestor: Int): TreeNode = {
      val node = TreeNode(nodeValue)
      if (traversal.nonEmpty && traversal.head < nodeValue) {
        head = traversal.head
        traversal = traversal.tail
        node.left = loop(head, nodeValue, nodeValue)
      }
      if (traversal.nonEmpty && (traversal.head < parent || (nodeValue > parent && traversal.head < ancestor))) {
        head = traversal.head
        traversal = traversal.tail
        node.right = loop(head, nodeValue, ancestor)
      }
      node
    }
    loop(head, Int.MaxValue, Int.MaxValue)
  }

  case class TreeNode(var _value: Int) {
    var left: TreeNode  = _
    var right: TreeNode = _
  }
}
