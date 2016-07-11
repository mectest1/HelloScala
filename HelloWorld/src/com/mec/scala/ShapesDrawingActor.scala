package com.mec.scala

object Messages{
  object Exit
  object Finished
  case class Response(message: String)
}

import akka.actor.Actor
class ShapesDrawingActor extends Actor{
  import Messages._
  
  def receive = {
    case s: Shape =>
      s.draw { str  => println(s"ShapeDrawingActor: $str")}
      sender ! Response(s"ShapesDr awingActor: $s drawn")
    case Exit =>
      println(s"ShapesDrawingActor: exiting...")
      sender ! Finished
    case unexpected =>  //default. Equivalent to "unexpected: Any"
      val response = Response(s"Error: Unknown message:$unexpected")
      println(s"ShapesDrawingActor: $response")
      sender ! response
  }
}