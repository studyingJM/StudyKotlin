package tutorial
// 클래스 선언은 클래스 이름(매개변수, ...) { 클래스 본문 }으로 구성된다. && () 와 {}는 생략 가능하다 Ex: class Empty

fun main() {
  val jimin = Person("jimin", 20, 175.2)
//  jimin.info();
//  jimin.nextYear()
//  jimin.info()
//  jimin.drinkMilk(100)
//  jimin.info()
  val rectangle = Rectangle(5.0,2.0)
  print(rectangle.perimeter)
}

// Constructor


// 클래스 간의 상속은 ':'으로 선언된다.
// 클래스는 기본적으로 final입니다.
// 클래스 상속이 가능하게 만들려면 공개로 표시하십시오.
open class Shape
private class Rectangle(var height: Double, var length: Double): Shape() {
  var perimeter = (height + length) * 2
}

// class의 기본 값은 public이다.
open class Person(val name: String, var age: Int, var height: Double) {
  fun nextYear() {
    age++
    println("1년후..")
  }
  fun info() {
    println("${name}의 나이는 ${age}살이고 신장은 ${height}이다.")
  }
  fun drinkMilk(amount: Int) {
    val value = amount * 0.0001
    height += value;
    println("${name}은 우유 마시기를 시전했다. : 신장이${value}만큼 커졌다.")
  }
}