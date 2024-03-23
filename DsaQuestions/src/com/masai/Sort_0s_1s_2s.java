package com.masai;

import java.util.Arrays;

public class Sort_0s_1s_2s {
  
	public static void sortEle(int[] a,int n) {
		int c0=0;
		int c1=0;
		int c2=0;
		int i=0;
		for(int r=0;r<n;r++) {
			if(a[r]==0) {
				c0++;
			}
			else if(a[r]==1) {
				c1++;
			}
			else if(a[r]==2) {
				c2++;
			}
		}
		while(c0>0) {
			a[i]=0;
			i++;
			c0--;
		}
		while(c1>0) {
			a[i]=1;
			i++;
			c1--;
		}
		while(c2>0) {
			a[i]=2;
			i++;
			c2--;
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] ar) {
		int n=5;
		int[] a= {1,0,1,2,0};
		sortEle(a,n);
	}
}
