package com.masai;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerNeighbourElement {

	public static void findSmaller(int[] a,int n) {
		Stack<Integer> s=new Stack<>();
		Stack<Integer> ans= new Stack<>();
		for(int g=0;g<n;g++) {
			while(!s.isEmpty() && s.peek()>=a[g]) {
				s.pop();
			}
			if(s.isEmpty()) {
				ans.push(-1);
			}else {
				ans.push(s.peek());
			}
			s.push(a[g]);
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		int n=5;
		int[] a= {1,2,5,3,5};
		findSmaller(a,n);

	}

}
