package com.imooc.scala.course06

import scala.util.Random

object MatchApp extends App {


//  val names = Array("Akiho Yoshizawa", "YuiHatano", "Aoi Sola")
//  val name = names(Random.nextInt(names.length))
//
//  name match {
//    case "Akiho Yoshizawa" =>  println("吉老师...")
//    case "YuiHatano"  => println("波老师....")
//    case _ => println("真不知道你们在说什么....")
//  }
//
//  def judgeGrade(grade:String): Unit = {
//    grade match {
//      case "A" => println("Excellent...")
//      case "B" => println("Good...")
//      case "C" => println("Just so so...")
//      case _ => println("You need work harder...")
//    }
//  }
//
//  judgeGrade("A")
//  judgeGrade("C")
//  judgeGrade("D")

//  def judgeGrade(name:String, grade:String): Unit = {
//    grade match {
//      case "A" => println("Excellent...")
//      case "B" => println("Good...")
//      case "C" => println("Just so so...")
//      case _ if(name == "lisi") => println(name + ", you are a good boy, but...")
//      case _  => println("You need work harder...")
//    }
//  }
//
//  judgeGrade("zhangsan", "D")
//  judgeGrade("lisi", "D") // 双重过滤


//  def greeting(array:Array[String]): Unit = {
//    array match {
//      case Array("zhangsan") => println("Hi:zhangsan")
//      case Array(x,y) => println("Hi:" + x + " , " + y)
//      case Array("zhangsan", _*) => println("Hi:zhangsan and other friends...")
//      case _ => println("Hi: everybody...")
//    }
//  }
//
//  greeting(Array("lisi","zhangsan","wangwu"))


//  def greeting(list:List[String]): Unit = {
//    list match {
//      case "zhangsan"::Nil => println("Hi:zhangsan")
//      case x::y::Nil => println("Hi:" + x + " , " + y)
//      case "zhangsan"::tail => println("Hi: zhangsan and other friends...")
//      case _ => println("Hi:everybody....")
//    }
//  }
//
//  greeting(List("PK","zhangsan","lisi"))


//  def matchType(obj:Any): Unit = {
//    obj match {
//      case x:Int => println("Int")
//      case s:String => println("String")
//      case m:Map[_,_] => m.foreach(println)
//      case _ => println("other type")
//    }
//  }
//
//  matchType(Map("name"->"PK"))


//  def caseclassMatch(person:Person): Unit = {
//    person match {
//      case CTO(name,floor) => println("CTO name is: " + name + " , floor is: " + floor)
//      case Employee(name,floor) => println("Employee name is: " + name + " , floor is: " + floor)
//      case _ => println("other")
//    }
//  }
//
//
//  class Person
//  case class CTO(name:String, floor:String) extends Person
//  case class Employee(name:String, floor:String) extends Person
//  case class Other(name:String) extends Person
//
//
//  caseclassMatch(CTO("PK", "22"))
//  caseclassMatch(Employee("zhangsan", "2"))
//  caseclassMatch(Other("other"))


    val grades = Map("PK"->"A", "zhangsan"-> "C")

    def getGrade(name:String): Unit = {
      val grade = grades.get(name)

      grade match {
        case Some(grade) => println(name + ": your grade is :" + grade)
        case None => println("Sorry....")
      }
    }

  getGrade("zhangsan")
  getGrade("PK")
  getGrade("lisi")


}
