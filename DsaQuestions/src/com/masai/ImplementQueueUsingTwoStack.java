package com.masai;

import java.util.Stack;

public class ImplementQueueUsingTwoStack {
	  Stack<Integer> stack1 = new Stack<>();
	  Stack<Integer> stack2 = new Stack<>();
	  
	  public void add(int data){
	       while(!stack1.isEmpty()){
	           stack2.push(stack1.peek());
	          stack1.pop(); 
	       }
	       stack1.push(data);
	        while(!stack2.isEmpty()){
	           stack1.push(stack2.peek());
	          stack2.pop(); 
	       }
	  }
	  
	  public int remove(){
	   if(!stack1.isEmpty()){
	      return stack1.pop();
	   } else{
	       return 0;
	   }
	  }
	  
	  public int front(){
	       if(!stack1.isEmpty()){
	          return stack1.peek();
	       } else{
	           return 0;
	       }
	  }
	public static void main(String[] args) {
		int n = 5;
	    int[] arr = {1,2,1,3,2,1,4,2};
	    ImplementQueueUsingTwoStack queue = new ImplementQueueUsingTwoStack();
	    for (int i=0;i<arr.length;i++){
	        if (arr[i] == 1){
	            queue.add(arr[i+1]);
	            i++;
	        }else{
	            System.out.print(queue.remove()+" ");
	        }
	    }

	}

}
