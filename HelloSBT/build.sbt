name:= "HelloSBT"

version:="1.0"

scalaVersion:="2.11.7"


libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"

enablePlugins(TomcatPlugin)

libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.5"