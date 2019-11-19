package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.datastructure.LinkedList.Node;

public class QueueUtility {
	static Node head;
	static int size;

	public QueueUtility() {
		size = 0;
		head = null;
	}

	static class Node<E> {
		E acc_no;
		E u_name;
		E bal;
		Node next;

		public Node(E acc_no,E u_name,E bal) {
			this.bal=bal;
			this.acc_no=acc_no;
			this.bal=bal;
			next = null;
		}

	}

	public static <E> void DeleteFront(E acc_no,E u_name,E bal) {
		Node node = new Node(acc_no,u_name,bal);

		if (head == null) {
			System.out.println("queue is empty");
		} else {
			head = head.next;
			size--;
		}

	}

	public static <E> void insertAtRear(E acc_no,E u_name,E bal) {
		Node node = new Node(acc_no,u_name,bal);
		size++;
		if (head == null) {
			head = node;
		} else {
			Node ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}

			ptr.next = node;
		}
	}

	

	public static <E> void show() {

		Node ptr = head;

		if (size==0)
		{

			System.out.println("Empty");

		}
		while (ptr.next != null) {
			System.out.println(" " + ptr.acc_no+"	"+ptr.u_name+"	"+ptr.bal);

			ptr = ptr.next;
		}
		System.out.println(" " + ptr.acc_no+"	"+ptr.u_name+"	"+ptr.bal);

	}

	public static<E> boolean search(E acc_no)
	   {
		   Node ptr = head;

			if(ptr.acc_no.equals(acc_no)) 
			{
			 
		
		
			}
			while(ptr.next!=null)
			{			
				if(acc_no.equals(ptr.acc_no))
				{
					 return  true;				
				}
			
				ptr=ptr.next;
				
			}
			if(acc_no.equals(acc_no))
			{
				 return  true;				
			}
			return false ;

		   
	   }
	
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
