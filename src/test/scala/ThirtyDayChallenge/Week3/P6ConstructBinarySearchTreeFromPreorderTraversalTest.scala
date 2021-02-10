package ThirtyDayChallenge.Week3

import ThirtyDayChallenge.Week3.P6ConstructBinarySearchTreeFromPreorderTraversal.TreeNode
import org.scalatest.FunSuite

class P6ConstructBinarySearchTreeFromPreorderTraversalTest extends FunSuite {
  test("1") {
    val root = TreeNode(8)
    root.left = TreeNode(5)
    root.left.left = TreeNode(1)
    root.left.right = TreeNode(7)
    root.right = TreeNode(10)
    root.right.right = TreeNode(12)

    assert(
        P6ConstructBinarySearchTreeFromPreorderTraversal.bstFromPreorder(Array(8, 5, 1, 7, 10, 12)) === root
    )
  }
}
