package com.masai;

public class FindDuplicateInArray {
    public static int findDuplicate(int[] a,int n) {
    	int ans=0;
    	int i=1;
    	while(i<n) {
    		if(a[i-1]==a[i]) {
    			ans=a[i-1];
    			break;
    		}
    		else {
    			i++;
    		}
    	}
    	return ans;
    }
    public static void main(String[] s) {
    	int n=5;
    	int[] a= {1,2,3,3,4};
    	System.out.println(findDuplicate(a,n));
    	
    }
}
