package com.masai;

public class CheckPrime {
//ProblemStatement:- Given an integer N. Check whether N is prime or not.
	
	public static boolean checkPrime(int n) {
		int count=2;
		for(int u=2;u<n;u++) {
			if(n%u==0) {
				count++;
			}
			if(count==3) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] ar) {
		int n=171;
		System.out.println(checkPrime(n));
	}
}
