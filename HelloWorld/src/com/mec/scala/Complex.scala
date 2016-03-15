package com.mec.scala

class Complex(real: Double, imaginary: Double){
  def re() = real
  def im() = imaginary
 
}

class Complex2(real: Double, imaginary: Double){
  def re = real
  def im = imaginary
  
  override def toString() = 
    "" + re + (if(im<0) "" else "+") + im + "i"
  
}

object CoplexNumbers{
   
  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2, 3.4)
    println(s"imaginary part: ${c.im()}")
    println(s"imaginary part: ${c.im}")
    
    val c2 = new Complex2(1.2, 3.4)
    println(s"imaginary part: ${c.im}")
    
    println(c2)
  }
}