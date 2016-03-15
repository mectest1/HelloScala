package com.mec.scala

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object FrenchDate {
  def main(args: Array[String]) = {
    val now = LocalDateTime.now
    val df = DateTimeFormatter.ISO_DATE_TIME;
    println(df format now);
  }
}