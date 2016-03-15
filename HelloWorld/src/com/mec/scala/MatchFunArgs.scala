package com.mec.scala

object MatchFunArgs {
  
  def main(args: Array[String]){
    pas map{ tup =>
      val Person(name, age) = tup._1
      val Address(street, city, country) = tup._2
      println(s"$name (age: $age) lives at $street, $city in $country")
    }
    
    (1 to 20) foreach ((_) => print("*")); println
    
    pas map{
      case (Person(name, age), Address(street, city, country)) =>
        println(s"$name (age: age) lives at $street, $city in $country")
    }
        
  }
  
  case class Address(street: String, city:String, country: String)
  case class Person(name:String, age: Int)
  
  val as = Seq(
      Address("1 Scala Lane", "Anytown", "USA"),
      Address("2 Clojure Lane", "Othertown", "USA")
      )
  val ps = Seq(
      Person("Buck Trends", 29),
      Person("Clo Jure", 28)
      )
      
  val pas = ps zip as
 
}