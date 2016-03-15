package com.mec.scala

import scala.annotation.tailrec

object FactorialTest {
   def factorial(i: Int): Long = {
     @tailrec
     def fact(i : Int, accumulator: Int) : Long = {
       if( 1 >= i) accumulator
       else fact(i -1, i *accumulator)
     }
   
     fact(i, 1)
   }
   
   def main(args: Array[String]) = {
     (1 to 10 ) foreach {
         index => {
           printf("factorial(%s)\t: ", index)
           println(factorial(index))
         }
     }
   }
}