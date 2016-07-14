package com.mec.test

import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import java.util.Stack


object BDDStyleTest extends FeatureSpec with GivenWhenThen{
  println("Welcome to the Scala worksheet")
  
  feature("The user can pop an element off the top of the stack"){
  	info("As a programmer")
  	info("Iwant to be able to pop items off the stack")
  	info("So that Ican get then in last-in-first-out order")
  	
  	scenario("pop is invoked on a non-empty stack"){
  	  given("a non-empty stack")
  	  val stack = new Stack[Int]
  	  stack.push(1)
  	  stack.push(2)
  	  val oldSize = stack.size
  	  
  	  when("when pop is invoked on the stack")
  	  val result = stack.pop()
  	 
  	  then("the most recently pushed element should be returned")
  	  assert(result === 2)
  	  
  	  and("the stack should have one less item then before")
  	  assert(stack.size === oldSize - 1)
  	}
  	
  	scenario("pop is invoked on an empty stack"){
  	  given("an empty stack")
  	  val emptyStack = new Stack[Int]
  	  
  	  when("pop is invoked on the stack")
  	  then("NoSuchElementException should be thrown")
  	  intercept[NoSuchElementException]{
  	    emptyStack.pop()
  	  }
  	  
  	  and("the stack should still be empty")
  	  assert(emptyStack.isEmpty)
  	}
  	
  }
  
  
}