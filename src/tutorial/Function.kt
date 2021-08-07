package tutorial

fun main() {
  val a = sum(10,20)
  val b = multiply(9, 3)
  println(a)
  println(b)
  val c = printMinus(20,10)
}

private fun sum(a: Int, b: Int): Int {
  return a + b
}

private fun multiply(a: Int, b:Int) = a * b

private fun printMinus(a: Int, b: Int) {
  println("minus of $a and $b is ${a - b}")
}
