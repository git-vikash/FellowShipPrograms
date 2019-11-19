package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Utility;

class OderedListMain 
{
	public static void main(String args[])throws Exception 
 	{  LinkedList list=new LinkedList();
		String str[] = Utility.readFile("Hello.txt");
		   
		int n=str.length;
		System.out.println("Unsorted data=====>>");
		for(String s:str)
		{
			System.out.print(" "+s);
		}
	
		String s[]=Utility.insertionSort(str);
		for(int i=0;i<n;i++)
		{
			list.insert(s[i]);
		}
		System.out.println("sorted data=====>>");
		list.show();
	    Utility.writeToFile("Hello.txt", list);
	}
}