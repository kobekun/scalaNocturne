package com.imooc.scala.course09

import java.io.{FileInputStream, InputStreamReader}

import scala.xml.XML


object XMLApp {

  def main(args: Array[String]): Unit = {

    //    loadXML()
//    readXMLAttr()
    updateXML()
  }

  def updateXML(): Unit ={
    val xml = XML.load(this.getClass.getClassLoader.getResource("books.xml"))
//    println(xml)
    val bookMap = scala.collection.mutable.HashMap[String,String]()

    (xml \ "book").map(x => {
      val id = (x \ "@id").toString()
      val name = (x \ "name").text.toString
      bookMap(id) = name
    })

//    for((key,value) <- bookMap) {
//      println(s"$key : $value")
//    }

    val newXml = <bookshelf>{bookMap.map(updateXmlFile)}</bookshelf>

//    println(newXml)
    XML.save("newBooks.xml", newXml)
  }

  def updateXmlFile(ele:(String,String)) = {
    val (id, oldName) = ele

    <book id={id + "-new"}>
      <name>{oldName + " Programming"}</name>
    </book>
  }

  def readXMLAttr(): Unit = {
    val xml = XML.load(this.getClass.getClassLoader.getResource("pk.xml"))
    //    println(xml)

    // header/field
    //    val headerField = xml \ "header" \ "field"
    //    println(headerField)

    // all field
    //    val fields = xml \\ "field"
    //    for (field <- fields) {
    //      println(field)
    //    }

    // header/field/name
    //    val fieldAttributes = (xml \ "header" \ "field").map(_ \ "@name")
    //    val fieldAttributes = (xml \ "header" \ "field" \\ "@name")
    //    for (fieldAttribute <- fieldAttributes) {
    //      println(fieldAttribute)
    //    }


    //name="Logon" message
//    val filters = (xml \\ "message")
//      .filter(_.attribute("name").exists(_.text.equals("Logon")))

//    val filters = (xml \\ "message")
//      .filter(x => ((x \ "@name").text).equals("Logon"))
//    for (filter <- filters) {
//      println(filter)
//    }

    // header/field  content
    (xml \ "header" \ "field")
      .map(x => (x \ "@name", x.text, x \ "@required"))
      .foreach(println)

  }

  def loadXML(): Unit = {
    //    val xml = XML.load(this.getClass.getClassLoader.getResource("test.xml"))
    //    println(xml)

    //    val xml = XML.load(new FileInputStream("/Users/rocky/source/scala-train/src/main/resources/test.xml"))
    //    println(xml)

    val xml = XML.load(
      new InputStreamReader(
        new FileInputStream("/Users/rocky/source/scala-train/src/main/resources/test.xml")
      )
    )
    println(xml)
  }

}
