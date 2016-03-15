package com.mec.scala

object GenericityApp {
  
  
  class Reference[T]{
    private var contents: T = _
    
    def set(value: T) = {contents = value}
    def get: T = contents
  }
  
  def main(args: Array[String]): Unit = {
    val cell = new Reference[Int]
    cell.set(13)
    println(s"Reference contains the half of ${cell.get * 2}")
  }
}