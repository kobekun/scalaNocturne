package com.imooc.scala.course05

object OptionApp extends App {


  val m = Map(1 -> 2)
//  println(m(1))
//  println(m(2))

//  println(m.get(1).get)

  println(m.getOrElse(2, "None"))
}


/**
  * case object None extends Option[Nothing] {
      def isEmpty = true
      def get = throw new NoSuchElementException("None.get")
    }

    final case class Some[+A](x: A) extends Option[A] {
      def isEmpty = false
      def get = x
    }

  */
