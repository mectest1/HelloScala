package com.mec.test
import org.scalatest._

object ScalaTestWorkSheet extends FlatSpec with Matchers{
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  true should be === true
  
  List(1, 2, 3, 4) should have length(4)
  
  List.empty should be (Nil)
  
  Map(1 -> "Value 1", 2 -> "Value 2") should contain key (2)
  
  Map(1 -> "Java", 2 -> "Scala") should contain value ("Scala")
  
  Map(1 -> "Java", 2 -> "Scala") get 1 should be (Some("Java"))
  
  Map(1 -> "Java", 2 -> "Scala") should (contain key (2) and not contain value ("Clojure"))
  
  3 should (be > (0) and be <= (5))
  
  new java.io.File(".") should (exist)
}