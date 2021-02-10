package ThirtyDayChallenge.Week2

import ThirtyDayChallenge.Week2.P3MinStack.MinStack
import org.scalatest.FunSuite

class P3MinStackTest extends FunSuite {
  test("1") {
    val stack = new MinStack()
    stack.push(2147483646)
    stack.push(2147483646)
    stack.push(2147483647)
    assert(stack.top() === 2147483647)
    stack.pop()
    assert(stack.getMin === 2147483646)
    stack.pop()
    assert(stack.getMin === 2147483646)
    stack.pop()
    stack.push(2147483647)
    assert(stack.top() === 2147483647)
    assert(stack.getMin === 2147483647)
    stack.push(-2147483648)
    assert(stack.top() === -2147483648)
    assert(stack.getMin === -2147483648)
    stack.pop()
    assert(stack.getMin === 2147483647)
  }
}
