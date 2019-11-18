package com.bridgeit.fellowship.datastructure;

public class LinkedList<E> 
{  
static Node head;
   static int size;
     
    public LinkedList()
    {   size=0;
    	head=null;
    }
  static class  Node<E>
  	{
	   E data;
	   Node next;
	   
	  public Node(E data)
	  {
		  this.data=data;
		  next=null;
	  }
	  
	  
	 
	
  	}
   
   public static<E> void insertAtFirst(E data)
   {
	   Node node = new Node(data);
	   size++;
	if(head == null)
	{
		head = node;
	}
	else
	{  
		Node ptr = head;
		while(ptr.next!=null)
		{
			ptr = ptr.next;
		}
	
		ptr.next = node;
	}
	   
   }
  
   
   public static void delete(String str)
   {
	   Node ptr = head;
		Node prev = head;
		if(ptr.data.equals(str)) 
		{
			head = ptr.next;
	        size--;
	
		}
		while(ptr.next!=null)
		{			
			if(ptr.data.equals(str))
			{
				prev.next = ptr.next;
				size--;
				
			}
			
		prev=ptr;
		ptr=ptr.next;
			
		
		}
		if(ptr.data.equals(str))
		{
			if(ptr.next==null)
			{
				prev.next=null;	
				size--;
		
			}
		}
   }
   public static<E> boolean search(E data)
   {
	   Node ptr = head;

		if(ptr.data.equals(data)) 
		{
		 return true;
	
	
		}
		while(ptr.next!=null)
		{			
			if(data.equals(ptr.data))
			{
				 return  true;				
			}
		
			ptr=ptr.next;
			
		}
		if(data.equals(ptr.data))
		{
			 return  true;				
		}
		return false ;

	   
   }
   public static<E> void show()
   {

	   Node ptr = head;

		if(ptr.data==null) 
		{
		   
	       System.out.println("Empty");
	
		}
		while(ptr.next!=null)
		{			
			System.out.println(" "+ptr.data);
		
			ptr=ptr.next;
		}	
		System.out.println(" "+ptr.data);


   }
   public static<E> String getElement(int index)
   {     
		Node n = head;
		int count = 0;
		while(n!=null)
		{
			if(count == index)
				return (String)n.data;
			count ++;
			n = n.next;
		}
		return (String) "/0";
	   
   }
  

public int size() {
	// TODO Auto-generated method stub
	return size;
}
   
}
