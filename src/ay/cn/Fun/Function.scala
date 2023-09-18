package ay.cn.Fun

object Function {

  def counter(int: Int): Int = {
    var x = int
    x = x + 5
    x
  }

  def fun01(): Int = {
    2 + 3
  }

  def fun02(): Int = 2 + 3

  def fun03: Int = 2 + 3

  def fun04 = 2 + 3

  val fun05 = {
    println("Hello")
  } //匿名函数

  def fun11(a: Int): Int = {
    a + 1
  }

  def fun12(a: Int): Int = a + 1 //仅有一条语句

  val fun13: (Int) => Int = { a => a + 1 }

  val fun14 = (a: Int) => {
    a + 1
    a + 2
  }

  val fun15 = (a: Int) => a + 1 //仅一条语句

  val fun16 = (a: Int) => {
    a + 1
  }

  val fun17: Int => Int = { value => value + 1 } //仅适合只有一个参数的情况

  val fun18 = (_: Int) + 1

  //两个参数
  def fun21(a: Int, b: Int): Int = {
    a + b
  }

  def fun22(a: Int, b: Int): Int = a + b //仅一条语句

  val fun23 = (a: Int, b: Int) => {
    a + b
  }

  val fun24 = (a: Int, b: Int) => a + b //仅一条语句//

  val fun25 = (_: Int) + (_: Int) // 参数仅出现一次


  def powerofTwo(x: Int): Int = {
    if (x == 0)
      1
    else
      2 * powerofTwo(x - 1)
  } //so？意义何在？递归递了个寂寞

  def sunInts(a: Int, b: Int): Int = {
    if (a > b)
      0
    else
      a + sunInts(a + 1, b)
  }

  def sunSquares(a: Int, b: Int): Int = {
    if (a > b)
      0
    else
      a * a + sunSquares(a + 1, b)
  }

  def sunPowerofTwo(a: Int, b: Int): Int = {
    if (a > b)
      0
    else
      powerofTwo(a) + sunPowerofTwo(a + 1, b)
  }

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b)
      0
    else
      f(a) + sum(f, a + 1, b)

  }

  def main(args: Array[String]): Unit = {
    /*println(counter(1))
    println(fun01())
    println(fun02())
    println(fun03)
    println(fun04)
    println(fun11(1))*/

    /*val m1 = List(1, 2, 3)
    val m2 = m1.map(_*2)
    println(m2.toString())*/

    println(powerofTwo(5))

    println(sunInts(1, 5))

    println(sunSquares(1, 5))

    println(sunPowerofTwo(1, 3))

    println(sum(x => x * x, 1, 5))

    println(sum(powerofTwo,1,5))
  }
}
