package com.mec.scala.fx

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.layout.VBox
import javafx.scene.control.Label
import javafx.scene.Scene
import com.mec.scala.HelloWorld
import javafx.scene.control.Button
import javafx.event.ActionEvent
import javafx.scene.control.Alert
//import java.lang.Exception 

object HelloFX {
  
  class HelloWorld extends Application{
    

    override def start(primaryStage: Stage) = {
      val lblHello = new Label("Hello, World")
      val helloBtn = new Button("Click Me")
//      helloBtn.setOnAction((e : ActionEvent) => {  //type mismatch
//        val alert = new Alert(Alert.AlertType.INFORMATION, "What can I help you?");
//        alert.showAndWait();
//      })
      
      
      
      val root = new VBox(5, lblHello, helloBtn);
      
      //
      val scene = new Scene(root)
      primaryStage.setScene(scene)
      primaryStage.setTitle("Hello from FX")
      primaryStage.show
    }
  }
  
  
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[HelloWorld]);
  }
}
