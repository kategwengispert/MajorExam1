package com.funcpro.major1

object MajorExam1 {
		
		def fib(n:Int) : Int = {
			
		val predicate1 = n==0;
		val predicate2 = n==1;
		
		
			if(predicate1){
				sysoutprintln("Not valid");
			}else if(predicate2){
				System.out.print("not valid" );
			
			}else{
				
				fib(n-1)+fib(n-2);
			}
		}
		
		fib(6);
}