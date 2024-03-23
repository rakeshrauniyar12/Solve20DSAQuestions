package com.masai;

public class CheckPowerOfTwo {
   public static void main(String[] ar) {
	   int n=64;
	   boolean flag=true;
	   while(n>1) {
		   if(n%2==0) {
			   n=n/2;
		   }
		   else if(n%2!=0) {
			  flag=false;
			   break;
		   }
	   }
	   if(flag) {
	   System.out.println("Yes");
	   } else {
		   System.out.println("No");
	   }
   }
}
