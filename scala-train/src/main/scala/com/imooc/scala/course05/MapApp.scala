package com.imooc.scala.course05

import scala.collection.mutable
import scala.collection.mutable._
object MapApp extends App{



  val a = Map("PK" -> 18, "zhangsan" -> 30)

  val b = Map("PK" -> 18, "zhangsan" -> 30)

//  val c = mutable.HashMap[String,Int]()
//  b.getOrElse("PK", 9)

//  for((key,value) <- b) {
//    println(key + " : " + value )
//  }


//  for(key <- b.keySet) {
//    println(key + " : " + b.getOrElse(key, 9))
//  }

//  for(value <- b.values) {
//    println(value)
//  }


    for((key,_) <- b) {
      println(key + " : " + b.getOrElse(key, 9) )
    }

}



