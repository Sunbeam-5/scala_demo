package ay.cn.Hello

import java.io.PrintWriter
import scala.io.Source

object HelloWorld {
  def main(args: Array[String]): Unit = {
//    val line = scala.io.StdIn.readLine
//    val i = readLine("Please input a Intnumber")

    /*val a = 5
    val b = 3.14f
    printf("a = %-5.3d, b = %5.3f", a, b)*/

//    println(i)
//    println(line);
//    println("Hello World")

    /*val  i = 10
    val f = 3.5452
    val s = "hello"
    println(s"$s : i = $i, f = $f")
    println(f"$s : i = $i, f = $f")
    //f可进行可视化
    println(f"$s : i = $i%-4d, f = $f%.1f")*/

    /*val inputFlie = new PrintWriter("test.txt")
    inputFlie.println("Hadoop")
    inputFlie.println("Spark")
    inputFlie.println("Java")
    inputFlie.println("Scala")
    inputFlie.close();

    val outputFile = Source.fromFile("test.txt")
    val lines = outputFile.getLines()
    for (l <- lines)
      println(l)*/

    val x = 6
    val a = if(x > 3) 1 else 0
    val b = if(x > 3) true else false
    println(a)
    println(b)
  }
}
