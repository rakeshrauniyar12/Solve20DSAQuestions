package com.masai;

import java.util.Arrays;

public class ReturnIndicesOfTwoNum {

	
	public static int[] returnIndices(int[] a,int k,int n) {
		int i=1;
		while(i<n) {
			int sum=a[i-1]+a[i];
			if(sum==k) {
				int[] d= new int[2];
				d[0]=i-1;
				d[1]=i;
				return d;
			}
			i++;
		}
		return new int[2];
	}
	
	public static void main(String[] ar) {
		int[] a= {1,1,3,3,4};
		int k=3;
		int n=5;
		System.out.println(Arrays.toString(returnIndices(a,k,n)));
	}
}
