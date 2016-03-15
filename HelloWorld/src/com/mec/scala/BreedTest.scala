package com.mec.scala

object BreedTest {
  
  object Breed extends Enumeration{
    type Breed = Value
    val doberman = Value("Dobeman Pinscher")
    val yorkie = Value("yorkshire Terrier")
    val scottie = Value("Scottish Terrier")
    val dane = Value("Greate Dane")
    val portie = Value("portuguese Water Dog")
  }
  
  
  import Breed._
  
  def main(argss: Array[String])={
    print("ID\tBreed")
    for(breed <- Breed.values) println(s"${breed.id}\t$breed")
    
    //
    println("\nJust Terriers")
    Breed.values filter (_.toString.endsWith("Terrier")) foreach println
    
    //
    def isTerrier(b: Breed) = b.toString.endsWith("Terrier")
//    def isTerrier(b: Value) = b.toString.endsWith("Terrier")  //this line also works
    
    println("\nTerriers Again?")
    Breed.values filter isTerrier foreach println
  }
}