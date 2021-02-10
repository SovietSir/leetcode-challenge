package ThirtyDayChallenge.Week1

import org.scalatest.FunSuite

class P2HappyNumberTest extends FunSuite {
  test("1") {
    assert(P2HappyNumber.isHappy1(19) === true)
    assert(P2HappyNumber.isHappy1(2) === false)
  }
  test("2") {
    assert(P2HappyNumber.isHappy2(6) === false)
  }
  test("3") {
    assert(P2HappyNumber.isHappy3(19) === true)
    assert(P2HappyNumber.isHappy3(2) === false)
  }
}

/*
let's try different n:
true  (1) -> 1
false (2) -> 4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4
false (3) -> 9 -> 81 -> 65 -> 61 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4
false (4) -> (look at 2)
false (5) -> 25 -> 29 -> 85 -> 89 (look at 2)
false (6) -> 36 -> 45 -> 41 -> 17 -> 50 -> 25  (look at 5)
true  (7) -> 49 -> 97 -> 10
false (8) -> 64 -> 52 -> 29 (look at 5)
false (9) -> 9 -> 81 -> 65 (look at 3)

All other n >= 10, while computing will become 1-9,
So there are two cases 1 and 7 which are true.
Notice, that all falses come from 2, and 7 comes from 1.
So there are many ways to write the same formula.
 */
