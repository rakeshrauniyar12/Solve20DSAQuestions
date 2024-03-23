package com.masai;

public class MaxEleInSizeOfK {

	public static void getMax(int[] a,int k,int n) {
		int i=0;
		while(i<=n-k) {
			int min=0;
			for(int f=i;f<k+i;f++) {
				if(a[f]>min) {
					min=a[f];
				}
			}
			i++;
			System.out.println(min);
			
		}
	}
	
   public static void main(String[] ar) {
	   int[] a= {1,2,3,1,4,5};
	   int k=3;
	   getMax(a,k,6);
   }
}
