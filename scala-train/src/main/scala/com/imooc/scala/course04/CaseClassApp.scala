package com.imooc.scala.course04

// 通常用在模式匹配
object CaseClassApp {

  def main(args: Array[String]): Unit = {
    println(Dog("wangcai").name)
  }

}

// case class不用new
case class Dog(name:String)
