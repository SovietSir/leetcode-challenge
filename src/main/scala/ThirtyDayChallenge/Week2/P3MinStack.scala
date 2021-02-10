package ThirtyDayChallenge.Week2

object P3MinStack {
  class MinStack() {

    private var min = Integer.MAX_VALUE

    private var buff     = List.empty[Int]
    private var minsBuff = List(min)

    def push(x: Int) {
      if (x <= min) {
        min = x
        minsBuff = min :: minsBuff
      }
      buff = x :: buff
    }

    def pop() {
      if (buff.head == min) {
        minsBuff = minsBuff.tail
        min = minsBuff.head
      }
      buff = buff.tail
    }

    def top(): Int = buff.head

    def getMin: Int = min

  }

  /**
  * Your MinStack object will be instantiated and called as such:
  * var obj = new MinStack()
  * obj.push(x)
  * obj.pop()
  * var param_3 = obj.top()
  * var param_4 = obj.getMin()
  */
}
