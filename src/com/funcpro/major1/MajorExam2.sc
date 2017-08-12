package com.funcpro.major1


object MajorExam2 {
	
	//1.
		def fib(n:Int) :Int = {
			
		val predicate1 = 0;
		val predicate2 = 1;
		
		
			if(predicate1==true){
				return 0;
			}else if(predicate2==true){
				return 1;
			}else{
				fib(n-1)+fib(n-2);
				
			}
		}                                 //> fib: (n: Int)Int
	
	//2.
	def fizzString(fizzString:String):Unit={
		if(fizzString.startsWith("f")&&fizzString.endsWith("b")){
			println("FizzBuzz");
		}else if(fizzString.startsWith("f")){
			println("Fizz");
		}else if(fizzString.endsWith("b")){
			println("Buzz");
		}
		}                                 //> fizzString: (fizzString: String)Unit
		
		fizzString("fig");                //> Fizz
		fizzString("dib");                //> Buzz
		fizzString("fib");                //> FizzBuzz
		
		
		
		
		//3.
		def factorial(n: Int): Int = {
			
			
			
			if(n!=0){
				factorial(n * (n - 1));
				n;
				
			}else{
				n;
			}
			
			
		}                                 //> factorial: (n: Int)Int
		
		factorial(3);                     //> java.lang.StackOverflowError
                                                  //| 	at com.funcpro.major1.MajorExam2$.factorial$1(com.funcpro.major1.MajorEx
                                                  //| am2.scala:47)
                                                  //| 	at com.funcpro.major1.MajorExam2$.factorial$1(com.funcpro.major1.MajorEx
                                                  //| am2.scala:47)
                                                  //| 	at com.funcpro.major1.MajorExam2$.factorial$1(com.funcpro.major1.MajorEx
                                                  //| am2.scala:47)
                                                  //| 	at com.funcpro.major1.MajorExam2$.factorial$1(com.funcpro.major1.MajorEx
                                                  //| am2.scala:47)
                                                  //| 	at com.funcpro.major1.MajorExam2$.factorial$1(com.funcpro.major1.MajorEx
                                                  //| am2.scala:47)
                                                  //| 	at com.funcpro.major1.MajorExam2$.factorial$1(com.funcpro.major1.MajorEx
                                                  //| am2.scala:47)
                                                  //| 	at com.funcpro.major1.MajorExam2$.factorial$1(com.funcpro.major1.MajorEx
                                                  //| am2.scala:47)
                                                  //| 	at com.funcpro.major1.MajorExam2$.factorial$1(com.funcpro.major1.MajorEx
                                                  //| am2.scala:47)
                                                  //| 	at com.funcpro.major1.MajorExam2$.factorial$1(com.funcpro.major1.MajorEx
                                                  //| am2.scala:47)
                                                  //| 	at com.funcpro.major1.MajorExam2$.factorial$1(com.funcpro.major1.MajorEx
                                                  //| am2.scala:4
                                                  //| Output exceeds cutoff limit.
		
		//4.
		
	
		
}