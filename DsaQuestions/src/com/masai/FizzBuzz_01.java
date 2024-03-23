package com.masai;

public class FizzBuzz_01 {
   //Problem Statement:- Given an integer N. Print the numbers from 1 to N 
	//and for multiples of ‘3’ print “Fizz” instead of the number, for 
	//the multiples of ‘5’
	//print “Buzz” and for multiples of both 5 and 3 print "FizzBuzz"
	public static void printFizzBuzz(int n) {
		    for(int f=1;f<=n;f++) {
		    	if(f%3==0 && f%5==0) {
		    		System.out.print("FizzBuzz"+" ");
		    	}
		    	
		    	else if(f%3==0) {
		    		System.out.print("Fizz"+" ");
		    	}
		    	else if(f%5==0) {
		    		System.out.print("Buzz"+" ");
		    	}
		    	
		    	else {
		    	System.out.print(f+" ");
		    	}
		    }
	}
	public static void main(String[] args) {
		int n=10;
		printFizzBuzz(n);
       
	}

}
