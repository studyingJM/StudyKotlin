
package tutorial

fun main() {
  val a = sum(10,20)
  val b = multiply(9, 3)
  println(a)
  println(b)
  val c = printMinus(20,10)
}

/*
  kotlin에서 함수는 fun키워드를 사용하여 선언할수 있다.
  TypeScript와 유사한것 같다.
*/

private fun sum(a: Int, b: Int): Int {
  return a + b
}

// 함수는 표현식으로도 나타낼 수 있다.
private fun multiply(a: Int, b:Int) = a * b

// 유닛 타입은 생략 가능하다.
private fun printMinus(a: Int, b: Int) {
  println("minus of $a and $b is ${a - b}")
}
