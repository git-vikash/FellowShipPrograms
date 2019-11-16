package com.bridgeit.fellowship.algoPrograms;
import  com.bridgeit.fellowship.utility.Utility;
/*
 * purpose:  sort string using insertion sort
 * 
 * @author Milind Patil
 * @version 1.0
 * @since 11-11-2019
 * */
public class InsertionSort
{
	public static void main(String[] args) 
	{	
		System.out.println("Enter the no of  String element in array");
		//take n element in array
		int n =Utility.inputInt();
		// create string array
		String  s[] = new String[n];
		
		System.out.println("Enter "+n+" Element in array");
		for(int i=0;i<n;i++)
		{
			s[i]=Utility.inputString();
		}
		//print array
		System.out.println("Unsorted Array");
		for (String b : s) 
		{
			System.out.print(b+" ");
		}
         //insertion logic
		for (int i = 0; i < n; i++) 
		{
			 for(int j=i+1;j<n;j++)
			 {
				 //comparing string
				 if(s[i].compareToIgnoreCase(s[j])>0) 
					{
					 System.out.println(s[i].compareToIgnoreCase(s[j]));
				       String t=s[i];
				       s[i]=s[j];
				       s[j]=t;
				       
					}
				
			 }
			 
		}	

		//print sorted array
		System.out.println();
		System.out.println("Sorted array is");		
		for(String t:s)
		{
			System.out.print(t+" ");
		}
	}
}
