package com.masai;

public class CheckPalindrome {
	
	public static boolean checkPalindrome(String s) {
		int l=0;
		int r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	public static void main(String[] ar) {
		String s="iasai";
		System.out.println(checkPalindrome(s));
	}
}
