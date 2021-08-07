package tutorial

fun main() {

  // val : 읽기 전용 지역 변수 ( const 같은 느낌)
  val a: Int = 1 // 타입 즉시 할당
  val b = 2 // Int타입 자동 추론
  val c: Int // 값이 제공되지 않는 경우 필수 유형이다.
  c = 3 // 값이 제공되지 않은 변수에 값 할당.

  // var : 재할당이 가능한 변수 ( let 같은 느낌 )
  var x = 5
  x+=1
  println(x)
}

private fun sum(a:Int, b:Int): Int {
  return a + b
}

