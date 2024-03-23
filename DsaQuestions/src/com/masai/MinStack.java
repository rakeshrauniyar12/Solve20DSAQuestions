package com.masai;

import java.util.Stack;

public class MinStack {
	Stack<Integer> st= new Stack<>();
	Stack<Integer> min_st= new Stack<>();
	int min=Integer.MAX_VALUE;
    public void push(int e) {
    	st.push(e);
    	if(e<=min) {
    		min=e;
    		min_st.push(e);
    	}
    }
    public void pop(){
		if(!st.isEmpty()){
			int temp = st.pop();
			if (temp == min){
				min_st.pop();
			}
			if (min_st.isEmpty()){
				min = Integer.MAX_VALUE;
			}else{
				min = min_st.peek(); 
			}
		}
	}
	public int getMin(){
		if (!st.isEmpty()) return min;
        return -1; 
	}
	public int top(){
		if (!st.isEmpty()) return st.peek();
        return -1; 
	}
	public static void main(String[] ar) {
		MinStack object = new MinStack();
		object.push(3);
		object.push(5);
		object.push(1);
		System.out.println(object.getMin());
		object.pop();
		System.out.println(object.getMin());
	}
}
