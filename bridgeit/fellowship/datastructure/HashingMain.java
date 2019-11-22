package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.ArrayList;
import com.bridgeit.fellowship.utility.Utility;

public class HashingMain 
{
  public static void main(String[] args) 
  { int data;
	Object obj[]=new Object[11];
	for(int i=0;i<11;i++)
	{
		obj[i]=new LinkedList();
	}
    	int slotno;
    System.out.println("Enter n no of data");
    int n=Utility.inputInt();
    System.out.println("Enter  "+n+" Element in list ");

    for(int i=0;i<n;i++)
    {   data=Utility.inputInt();
    	slotno=data%10;
    	slotData(slotno,obj[i],data);	
    }
    
    
//	   LinkedList list=new LinkedList();
//	   list.insert(data);
//		ArrayList.addAllList(obj,index,list);
//	    ArrayList.showAll(obj);
	
	  
}
  
  
  
  public static void slotData(int slotno,Object obj,int data)
  {
	  LinkedList list = (LinkedList) obj;
	  switch(slotno)
	  {
	  case 0:System.out.println(slotno);
	  list.insert(data);
	  list.show();
	  
	  break;
	  case 1:System.out.println(slotno);
	  list.insert(data);
	  
	  list.show();
	  break;
	  case 2:System.out.println(slotno);
	  list.insert(data);
	  list.show();
	  break;
	  case 3:System.out.println(slotno);
	  list.insert(data);
	  System.out.println("slot 3 data");
	  list.show();
	  break;
	  case 4:System.out.println(slotno);
	  list.insert(data);
	  
	  break;
	  case 5:System.out.println(slotno);
	  list.insert(data);
	  
	  break;
	  case 6:System.out.println(slotno);
	  list.insert(data);
	  
	  break;
	  case 7:System.out.println(slotno);
	  list.insert(data);
	  
	  break;
	  case 8:System.out.println(slotno);
	  list.insert(data);
	  
	  break;
	  case 9:System.out.println(slotno);
	  list.insert(data);
	  
	  break;
	  case 10:System.out.println(slotno);
	  list.insert(data);
	  break;
	  
	  }
	  
	  
	  
	 
  }
}
