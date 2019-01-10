package com.imooc.scala.course05

object ListApp extends App{


//  val l = List(1,2,3,4,5)
//
//
//  val l5 = scala.collection.mutable.ListBuffer[Int]()
//  l5 += 2
//  l5 += (3,4,5)
//  l5 ++= List(6,7,8,9)
//
//
//  l5 -= 2
//  l5 -= 3
//  l5 -= (1, 4)
//  l5 --= List(5,6,7,8)
//
//  println(l5)
//
//
//  l5.isEmpty
//  l5.head
//  l5.tail



  def sum(nums:Int*):Int = {
    if(nums.length == 0) {
      0
    } else {
      nums.head + sum(nums.tail:_*)
    }
  }


//  val set = scala.collection.mutable.Set[Int]()
//  set += 1
//  set += (1,1)

  println(sum())
  println(sum(1,2,3,4))
}
