package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Utility;

public class PrimeAnagram 
{
  public static void main(String[] args)
  {   
	  
	  System.out.println("Enter number");
	   
	  int num=Utility.inputInt();
	  int arr[] =Utility.primeSeries(num);
	  for(int i=0;i<arr.length;i++)
	  {
//		  boolean status= Utility.isPrime(arr[i]);	 
//		  System.out.println();
//		  if(status==true)
//		  System.out.println(arr[i]+" "+status);
		  System.out.println(arr[i]);
	  }
	 
	
 }
}
