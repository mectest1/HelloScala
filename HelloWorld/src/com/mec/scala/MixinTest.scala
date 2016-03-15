package com.mec.scala

object MixinTest {
  def main(args: Array[String])={
    1 to 3 foreach (i => println(s"Result: ${service2.work(i)}"))
  }
  
  
  
  val service2 = new ServiceImportance("dos") with StdoutLogging{
    override def work(i: Int) :Int = {
      info(s"Starting work: i = $i")
      val result = super.work(i)
      info(s"Ending work: i = $i, result = $result")
      result
    }
  }
}


class ServiceImportance(name: String){
  def work(i: Int): Int = {
    println(s"ServiceImportance: Doing important work! $i")
    i + 1
  }
}

trait Logging{
  def info (message: String): Unit
  def warning(messaeg: String): Unit
  def error (message: String): Unit
}

trait StdoutLogging extends Logging{
  override def info (message: String) =    println(s"INFO:\t$message")
  override def warning(message:String) =   println(s"WARNING:\t$message")
  def error(message:String) =     println(s"ERROR:\t$message")
}
