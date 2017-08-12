package com.funcpro.major1

object Major1WS {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x = 1+2;                                    //> x  : Int = 3
  
  def square(x:Int) = x * x;                      //> square: (x: Int)Int
  println(square(x));                             //> 9
  
  
  
  def check(q:Boolean, y:Boolean): Boolean = {
  	if(q==y){
  		true;
  	}else{
  		false;
  	}
  	}                                         //> check: (q: Boolean, y: Boolean)Boolean
  	
  	
  	
  	println(check(true,true));                //> true
  	
  	def abs(x: Int) = if (x>=0) x else -x     //> abs: (x: Int)Int
  	abs(-5);                                  //> res0: Int = 5
}