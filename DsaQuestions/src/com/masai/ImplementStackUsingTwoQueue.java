package com.masai;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingTwoQueue {
	  Queue<Integer> queue1 = new LinkedList<>();
      Queue<Integer> queue2 = new LinkedList<>();
     static int size;
 public ImplementStackUsingTwoQueue() {
     
 }
 
 public void push(int x) {
	 size++;
       while(!queue1.isEmpty()){
          queue2.add(queue1.peek());
          queue1.remove();
      }
      queue1.add(x);
       while(!queue2.isEmpty()){
          queue1.add(queue2.peek());
           queue2.remove();
      }
 }
 
 public int pop() {
     int x=0;
       if(queue1.size()==0){
         
     } else{
         x=queue1.remove();
         size--;
     }
     return x;
 }
 static int size(){
		return size;
	}
 public int top() {
       if(queue1.size()!=0){
      return queue1.peek();
   } else{
       return 0;
   }
 }
 
 public boolean empty() {
     return queue1.isEmpty();
 }
  public static void main(String[] ar) {
	  ImplementStackUsingTwoQueue stack = new ImplementStackUsingTwoQueue();
		stack.push(2);
		stack.push(3);
      System.out.println(stack.pop());
      stack.push(4);
      System.out.println(stack.pop());
      System.out.println(stack.top());
      System.out.println(stack.size());
  }
}
