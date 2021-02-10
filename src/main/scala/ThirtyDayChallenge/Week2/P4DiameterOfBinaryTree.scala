package ThirtyDayChallenge.Week2

object P4DiameterOfBinaryTree {
  def diameterOfBinaryTree(root: TreeNode): Int = {
    def loop(node: TreeNode): (Int, Int) = {
      if (node == null) return (0, 0)
      val (leftBranch, leftJoin)   = loop(node.left)
      val (rightBranch, rightJoin) = loop(node.right)
      val curJoin                  = leftBranch + rightBranch
      val branch                   = Math.max(leftBranch, rightBranch)
      val maxJoin                  = Math.max(curJoin, Math.max(leftJoin, rightJoin))
      (branch + 1, maxJoin)
    }
    val (_, maxJoin) = loop(root)
    maxJoin
  }
}

class TreeNode(var _value: Int) {
  var value: Int      = _value
  var left: TreeNode  = _
  var right: TreeNode = _
}
