package com.masai;

public class BinaryRepresentationOfNumber {
// Problem-Statement:- Write a program to print Binary representation of a given number.
	public static void main(String[] args) {
		int n=7;
		int[] arr= new int[32];
		int n1=arr.length-1;
		
		while(n>0) {
			arr[n1]=n%2;
			n1--;
			n/=2;
		}
        String ans="";
        for(Integer i:arr) {
        	ans+=i;
        }
        System.out.println(ans);
	}

}
