package com.imooc.scala.course08

object ImplicitClassApp extends App {

  implicit class Calculator(x:Int) {
    def add(a:Int) = a + x
  }

  println(12.add(3))

//  println(1.add(2))
}



