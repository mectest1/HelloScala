package com.mec.test

object Snippets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
	
	def parse(numberAsString: String): Int =
		try{
			Integer.parseInt(numberAsString)
		}catch{
			case nfe: NumberFormatException =>
				println(s"Wrong format from number $numberAsString"); Int.MinValue
			case e:Exception =>
				println(s"Error when parsing number $numberAsString: $e.getMessage"); Int.MinValue
		}                                 //> parse: (numberAsString: String)Int
		
	parse("10")                               //> res0: Int = 10
	parse("what")                             //> Wrong format from number what
                                                  //| res1: Int = -2147483648
	
	
	case class Failure(val reason: String)
	def parse2(numberAsString: String): Either[Failure, Int] =
		try{
			Right(Integer.parseInt(numberAsString))
		}catch{
			case _: Throwable =>
				Left(Failure(s"Error when parsing number $numberAsString"))
		}                                 //> parse2: (numberAsString: String)Either[com.mec.test.Snippets.Failure,Int]
	parse2("12ab")                            //> res2: Either[com.mec.test.Snippets.Failure,Int] = Left(Failure(Error when pa
                                                  //| rsing number 12ab))
	parse2("123")                             //> res3: Either[com.mec.test.Snippets.Failure,Int] = Right(123)
	
  println("Hello, World!")                        //> Hello, World!
}