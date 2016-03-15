package com.mec.scala

object MatchDeepTuple {
  def main(args: Array[String]) = {
    val itemsCosts = Seq(("Pencil", 0.52), ("Paper", 1.35), ("Notebook", 2.43))
    val itemsCostsIndices = itemsCosts.zipWithIndex
    for(itemsCostsIndex <- itemsCostsIndices){
      itemsCostsIndex match {
        case ((item, cost), index) =>  println(s"$index: $item costs $cost each")
      }
    }
  }
}