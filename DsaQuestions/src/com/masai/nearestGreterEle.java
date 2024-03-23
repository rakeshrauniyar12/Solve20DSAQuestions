package com.masai;

public class nearestGreterEle {
	
	public static void findGreater(int[] a,int n) {
		int i=1;
	   if(a[0]>a[1]) {
		   System.out.println(0);
		   return;
	   }
	   else if(a[n-1]>a[n-2]) {
		   System.out.println(n-1);
		   return;
	   }
	   else {
		   for(int g=1;g<n-1;g++) {
			   if(a[g]>a[g-1] && a[g]>a[g+1]) {
				   System.out.println(g);
				   break;
			   }
			   
		   }
	   }
	}
    public static void main(String[] ar) {
    	int[] a= {1,2,3,1};
    	int n=4;
    	findGreater(a,n);
    }
}
