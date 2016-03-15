package com.mec.scala

case class Point2(x:Double = 0.0, y : Double = 0.0) {
  def shift(deltax: Double = 0.0, deltay: Double = 0.0)=
    copy(x + deltax, y + deltay)

}

object Point2Test{
      
  def main(args: Array[String]) = {
    val p1 = new Point2(x = 3.3, y = 4.4);
    val p2 = p1.copy(y=6.6)
    val p3 = p1.shift(deltax = 5)
    printf("%s, %s, %s", p1, p2, p3)
    println
    
//    m1(100, i => s"$i  + $i")   //missing parameter type for i
    val str1 = m1(100, (i: Int) => s"$i  + $i")
    val str2 = m2(100){
      i => s"$i + $i"
    }
    printf("m1 = %s, m2 = %s", str1, str2)
  }
  
  def m1[A](a: A, f: A => String) = f(a)
  def m2[A](a: A)(f: A => String) = f(a)
  
}