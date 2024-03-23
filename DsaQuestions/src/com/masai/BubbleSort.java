package com.masai;

import java.util.Arrays;

public class BubbleSort {
	public static void sortArrByBubbleSortAlgo(int[] a) {
		
		for(int f=0;f<a.length;f++) {
			for(int g=f;g<a.length-f-1;g++) {
				if(a[g]>a[g+1]) {
					int t=a[g];
					a[g]=a[g+1];
					a[g+1]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
    public static void main(String[] ar) {
    	int[] a= {2,1,5,3,7,6};
    	sortArrByBubbleSortAlgo(a);
    }
}
