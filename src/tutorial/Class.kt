package tutorial

fun main() {
  val jimin = Person("jimin", 20, 175.2)
  jimin.info();
  jimin.nextYear()
  jimin.info()
  jimin.drinkMilk(100)
  jimin.info()
//  val rectangle = Rectangle(5.0,2.0)
//  print(rectangle.perimeter)
}

open class Shape
private class Rectangle(var height: Double, var length: Double): Shape() {
  var perimeter = (height + length) * 2
}

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