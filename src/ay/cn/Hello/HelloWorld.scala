package ay.cn.Hello

import java.io.PrintWriter
import scala.collection.mutable.ListBuffer
import scala.io.Source
import scala.util.control.Breaks.{break, breakable}

object HelloWorld {

  class Test(var name:String) {
      def display(): Unit = {
        println(name)
      }
  }

  def main(args: Array[String]): Unit = {

    var t = new Test("zhangsan")
    t.display()


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

    /*val x = 6
    val a = if(x > 3) 1 else 0
    val b = if(x > 3) true else false
    println(a)
    println(b)*/

    /*for (i <- 1 to 5 by 2) {   //by每次循环加2
      println(i)
    }

    for (j <- 1 to 5 if j % 2 == 0) {
      println(j)
    }*/

    /*//99乘法口诀表
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        //print(i + "*" + j + "=" + i * j + " ")
        /*val k = i * j;
        println(f"$i * $j = $k%-3d")*/
        printf("%d * %d = % -3d ", i, j, i * j)
      }
      println()
    }*/

    /*val inputfile= Source.fromFile("test.txt")
    val line = inputfile.getLines()
    for (l <- line) {
      println(l)
    }*/

    /*//yield
    val l = for (i <- 1 to 9 if  i % 3 == 0) yield {i}
    for (i <- l) {
      println(i)
    }*/


    /*//breakable的使用放在外面是Java里面的break，放在里面是continue
    val array = Array(1,3,10,5,4)
    breakable{
      for (i <- array) {
        if (i > 5) break
        println(i)
      }
    }

    println("-----------------")

    for (i <- array) {
      breakable {
        if (i > 5)
          break
        println(i)
      }
    }*/

    /*val line = scala.io.StdIn.readLine("请输入数字:")
    println(line)*/

    //数组
    /*val valueArr = new Array[Int](3)
    valueArr(0) = 3
    valueArr(1) = 4
    valueArr(2) = 6
    for (i <- valueArr)
      println(i)*/

    /*//val限制的是myStrArr是常量，var 可变
    val myStrArr = Array("BigData", "Spark", "Hadoop")
    myStrArr(0) = "Java"
    for (i <- myStrArr)
      println(i)

    //myStrArr = Array("Java") 会报错，换成 var 则不会*/

    /*val myStrArr = Array("BigData", "Spark", "Hadoop")
    for (i <- 0 to myStrArr.length - 1)
      println(myStrArr(i))*/

    /*//二维数组
    val  myMatrix = Array.ofDim[Int](3,4)
    for (i <- 0 to 3 - 1) {
      for  (j <- 0 to 4 - 1) {
        myMatrix(i)(j) = i * j
      }
    }

    for (i <- 0 to 3 - 1) {
      for  (j <- 0 to 4 - 1) {
        print(myMatrix(i)(j)+ " ")
      }
      println()
    }*/

    /*//元组
    val  tuple = ("BigData", 2015, 45.0)
    println(tuple.toString())
    println(tuple._1)
    val (t1,t2,t3) = tuple
    println(t1+t2+t3)*/

    /*var strList = List("BigData","Spark","Hadoop")
    for (l <- strList) {
      println(l)
    }

    val x = List(1.34,"Spark")
    for (s <- x) {
      println(s)
    }*/

    /*var strList = List("BigData","Spark","Hadoop")
    var otherList = "Apache"::strList
    for (l <- strList) {
      println(l)
    }
    println("------------------")
    for (l <- otherList) {
      println(l)
    }

    val intList = 1::2::3::Nil
    for (s <- intList) {
      println((s))
    }
    println(strList.head)
    println(strList.tail)
    println(strList.mkString)*/

    /*var str1 = "Hello "
    var str2 = "World"
    var str3 = str1 + str2;
    println(str3)*/

    /*val vecl = Vector(12,34,56,78,90)//向量存储到数组里面
    println(vecl(4))
    for (s <- vecl) {
      println(s)
    }
    println("-------------")
    val vec2 = 3+:4+:vecl
    for (a <- vec2) {
      println(a)
    }*/

    /*val multableL1 = ListBuffer(10,20,30)
    multableL1 += 40;
    multableL1.insert(2,50)
    println(multableL1.toString())*/

    /*val r = new Range(1,10,2)
    println(r.toString())*/

    /*var myset = Set(1,2,3,4,5,6,7,8,9,2,3,4,5,6,7)
    println(myset.toString())
    for (s <- myset) {
      print(s + " ")
    }*/

    /*//Python的字典
    val university = Map("UCLA" -> "University California of Los Angeles",
                         "THU" -> "Tsinghua University",
                         "PKU" -> "Peking University")
    println(university("UCLA"))
    for ((k,v) <- university) {
      println(k + " " + v)
    }
    println("----------------")
    for (u <- university){
      println(u._1 + " " + u._2)
    }*/

    /*//迭代器
    val iter = Iterator("Hadoop","Spark", "Scala")
    val n = iter.length//指针已经从头到尾了，不能再遍历了
    println(n)
    while((iter.hasNext)) {
      println(iter.next())
    }*/
  }
}
