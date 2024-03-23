package com.masai;


public class ReverseLinkedList {
	
	public static Node generateSinglyLinkedList(int[] arr){
		if (arr.length == 0 || arr == null) return null;
		Node SinglyLinkedList = new Node(arr[0]);
		Node temp = SinglyLinkedList;
		for (int i=1;i<arr.length;i++){
			temp.next = new Node(arr[i]);
			temp = temp.next;
		}
		return SinglyLinkedList;
	}
	public static Node reverseLinkedList(Node head){
		Node c = head;
		Node post = null;
		Node pre = null;
		while(c != null){
			post = c.next;
			c.next = pre;
			pre = c;
			c = post;
		}
		head = pre;
		return head;
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,4}; 
		Node head = generateSinglyLinkedList(arr);
		head = reverseLinkedList(head);
		if(head==null) {
			System.out.println(0);
		}else {
			while(head!=null) {
				System.out.print(head.data+" ");
				head=head.next;
			}
		}

	}
}
