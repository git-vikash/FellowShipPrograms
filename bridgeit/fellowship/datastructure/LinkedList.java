package com.bridgeit.fellowship.datastructure;

public class LinkedList
{  
@SuppressWarnings("rawtypes")
static Node head;
    int size;
     
    public LinkedList()
    {   size=0;
    	head=null;
    }
  class  Node<E>
  	{
	   E data;
	   @SuppressWarnings("rawtypes")
	Node next;
	   
	  public Node(E data)
	  {
		  this.data=data;
		  next=null;
	  }
	  
	  
	 
	
  	}
   
   @SuppressWarnings("unchecked")
public <E> void insert(E data)
   {
	   Node<E> node = new Node<E>(data);
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
  
   
   @SuppressWarnings("unchecked")
public  void delete(String str)
   {
	   @SuppressWarnings("rawtypes")
	Node ptr = head;
		@SuppressWarnings("rawtypes")
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
   @SuppressWarnings("rawtypes")
public <E> boolean search(E data)
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
   public <E> void show()
   {

	   @SuppressWarnings("rawtypes")
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
   public <E> String getElement(int index)
   {     
		@SuppressWarnings("rawtypes")
		Node n = head;
		int count = 0;
		while(n!=null)
		{
			if(count == index)
				return (String)n.data;
			count ++;
			n = n.next;
		}
		return (String) "";
	   
   }
  

public int size() {
	// TODO Auto-generated method stub
	return size;
}
   
}
