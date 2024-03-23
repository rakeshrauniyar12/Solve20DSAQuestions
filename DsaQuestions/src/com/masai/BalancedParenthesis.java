package com.masai;

import java.util.Stack;

public class BalancedParenthesis {
	   public static boolean isBalanced(String expression) {
	        Stack<Character> stack = new Stack<>();

	        for (char ch : expression.toCharArray()) {
	            if (ch == '(' || ch == '[' || ch == '{') {
	                stack.push(ch);
	            } else if (ch == ')' || ch == ']' || ch == '}') {
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                char top = stack.pop();
	                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty();
	    }

 public static void main(String[] ar) {
	 String s="[(){}";
	 System.out.println(isBalanced(s));
 }
}
