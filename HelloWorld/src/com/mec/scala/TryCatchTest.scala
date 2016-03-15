package com.mec.scala

object TryCatchTest {
  def main(args: Array[String]) = {
    //println ("Hello,World!")
    List("src/com/mec/scala/TryCatchTest.scala", 
        "src/com/mec/scala/TryCatchTest.scala2").
        foreach(countLines)
  }
  
  
  import scala.io.Source
  import scala.util.control.NonFatal
  
  def countLines(fileName:String) = {
    println();
    var source : Option[Source] = None;
    try{
      source = Some(Source.fromFile(fileName))
      val size = source.get.getLines.size
      println(s"file $fileName has $size lines")
    }catch{
      case NonFatal(ex) => println(s"Non fatal exception! $ex")
    }finally{
      for(s <- source){
        println(s"Closing $fileName...")
        s.close
      }
    }
  }
}