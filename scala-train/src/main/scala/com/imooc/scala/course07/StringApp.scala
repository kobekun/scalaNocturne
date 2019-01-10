package com.imooc.scala.course07

object StringApp extends App {


  val s = "Hello:"
  val name = "PK"
//  println(s + name)

  println(s"Hello:$name")
  val team = "AC Milan"

  // 插值
  println(s"Hello:$name, Welcome to $team")


  val b =
    """
      |这是一个多行字符串
      |hello
      |world
      |PK
    """.stripMargin

  println(b)


}
