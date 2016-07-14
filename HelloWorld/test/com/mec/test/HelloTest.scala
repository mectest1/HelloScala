package com.mec.test

import org.junit.Before
import org.junit.After
import org.junit.Test

class HelloTest {
  @Before
  def setUp: Unit = {
    
  }
  
  @After
  def tearDown: Unit = {
    
  }
  
  @Test
  def testHello = {
    println("Hello, World!");
  }
}