package com.imooc.scala.course03

object FunctionApp {

  def main(args: Array[String]): Unit = {


//    println(add(2, 3))
//
//    println(three())
//    println(three) // 没有入参的函数，调用时括号是可以省略的

//    sayHello()
//    sayHello
//    sayHello("zhangsan")


//    sayName()
//    sayName("ruoze")
//
//    loadConf()
//    loadConf("spark-production.conf")


//    println(speed(100, 10))
//    println(speed(distance = 100, time = 10))
//    println(speed(time = 10, distance = 100))

//    println(sum(1,3,5))
//    println(sum2(1,2))
//    println(sum2(1,2,3))
//    println(sum2(1,2,3,4))


//    val x = 1
//    if(x > 0) {
//      true
//    } else {
//      false
//    }

//    1 to 10
//    1.to(10)
//    Range(1,10,0)
//    1.until(10)

//    for(i <- 1 to 10 if i % 2 == 0) {
//      println(i)
//    }

//    val courses = Array("Hadoop","Spark SQL", "Spark Streaming","Storm","Scala")
//    for(course <- courses) {
//      println(course)
//    }

    // course 其实就是courses里面的每个元素
    // ==>  就是将左边的course作用上一个函数，变成另外一个结果
    // println 就是作用到course上的一个函数
//    courses.foreach(course => println(course))


    var (num, sum) = (100, 0)
    while(num > 0) {  // 出口
      sum = sum + num
      num = num - 1  // 步长
    }
    println(sum)

  }


  def add(x:Int, y:Int):Int = {
    x + y  // 最后一行就是返回值，不需要return
  }

  def three() = 1 + 2

  def sayHello(): Unit = {
    println("Say hello....")
  }

  def sayHello(name:String): Unit = {
    println("Say hello: " + name)
  }

  def sayName(name:String = "PK"): Unit = {
    println(name)
  }

  def loadConf(conf:String = "spark-defaults.conf"): Unit = {
    println(conf)
  }

  def speed(distance:Float, time:Float):Float = {
    distance/time
  }


  def sum(a:Int, b:Int) = {
    a + b
  }

  def sum(a:Int, b:Int, c:Int) = {
    a + b + c
  }

  def sum2(numbers:Int*) = {

    var result = 0
    for(number <- numbers) {
      result += number
    }

    result
  }


}
