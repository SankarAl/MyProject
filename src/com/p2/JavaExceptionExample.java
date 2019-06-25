package com.p2;

public class JavaExceptionExample {
	  public static void main(String args[]){
		   try{
		 double data=200/100d;
			//   double data = 201/100;
			//   float data = 201/100;
			 //  double data = 20/100;
		      System.out.println(data);
		   }catch(ArithmeticException e){
			   System.out.println(e.getMessage());
			   }
		  }
		}

//System.out.println("min size="+Integer.MIN_VALUE+" max size="+Integer.MAX_VALUE);

