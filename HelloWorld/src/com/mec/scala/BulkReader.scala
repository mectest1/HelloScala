package com.mec.scala

import java.io._

abstract class BulkReader {
  type In  //abstract type, instead of parameterized type
  val source: In
  def read: String
}

class StringBulkReader(val source:String) extends BulkReader{
  type In = String
  def read: String = source
}

class FileBulkReader(val source: File) extends BulkReader{
  type In = File
  def read: String = {
    val in = new BufferedInputStream(new FileInputStream(source))
    val numBytes = in.available()
    val bytes = new Array[Byte](numBytes)
    in.read(bytes, 0, numBytes)
    new String(bytes)
  }
}

object BulkReaderTest{
  def main(args: Array[String])={
    println(new StringBulkReader("Hello, Scala!").read)
    (1 to 100) foreach {index => printf("*")}; println
    println(new FileBulkReader(new File("src/com/mec/scala/BulkReader.scala")).read)
  }
}