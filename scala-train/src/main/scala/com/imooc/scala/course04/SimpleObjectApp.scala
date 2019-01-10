package com.imooc.scala.course04

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Messi"
//    person.age = 30
    println(person.name + " .. " + person.age)

    println("invoke eat method: " + person.eat)

    person.watchFootball("Barcelona")


    person.printInfo()
//    println(person.gender)
  }

}

class People {

  // 定义属性
  var name:String = _
  val age = 10


  private [this] val gender = "male"

  def printInfo(): Unit ={
    println("gender: " + gender)
  }

  // 定义方法
  def eat():String = {
    name + " eat...."
  }

  def watchFootball(teamName: String): Unit = {
    println(name + " is watching match of " + teamName)
  }
}
