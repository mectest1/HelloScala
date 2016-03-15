package com.mec.scala

object NoDotIsBetter {
  def main(args:Array[String]) ={
    1 to 10 filter isEven foreach println
  }
  
  def isEven(n: Int) = 0 == (n%2)
}