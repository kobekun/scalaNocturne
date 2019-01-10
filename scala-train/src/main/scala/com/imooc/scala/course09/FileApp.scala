package com.imooc.scala.course09

import scala.io.Source

object FileApp {

  def main(args: Array[String]): Unit = {

    val file = Source.fromFile("/Users/rocky/imooc/hello.txt")(scala.io.Codec.ISO8859)

    def readLine(): Unit ={
      for(line <- file.getLines()){
        println(line)
      }
    }

    //readLine()

    def readChar(): Unit ={
      for(ele <- file) {
        println(ele)
      }
    }

//    readChar()


    def readNet(): Unit ={
      val file = Source.fromURL("http://www.baidu.com")
      for(line <- file.getLines()){
        println(line)
      }
    }

    readNet()

  }

}
