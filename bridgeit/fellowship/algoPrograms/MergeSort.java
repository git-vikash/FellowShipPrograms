package com.bridgeit.fellowship.algoPrograms;

import com.bridgeit.fellowship.utility.Utility;

public class MergeSort {
	public void sort(String s[],int first,int last)
	{
	  int mid=first+last/2;
	    sort(s,first,mid);
	    sort(s,mid+1,last);
	   //merge(s,first,mid,last);
	    
	    
	}
	public static void merge()
	{
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the no of  String element in array");
		int n =Utility.inputInt();
		String  s[] = new String[n];
		String key;
		System.out.println("Enter "+n+" Element in array");
		for(int i=0;i<n;i++)
		{
			s[i]=Utility.inputString();
		}
		System.out.println("Unsorted Array");
		for (String b : s) 
		{
			System.out.print(b+" ");
		}
		
		MergeSort m=new MergeSort();
		m.sort(s,0,s.length);
	    
		
    
	}

}
