package com.bridgeit.fellowship.utility;
import java.util.Random;
import java.util.Scanner;



public class Utility 
{    //create scanner object
	static Scanner sc = new Scanner(System.in);
 /*
  * static function to check for input integer
  * 
  * @return integer of scanner type
  * */
	public static int inputInt() 
	{
		return sc.nextInt();
	}
	/*
	  * static function to check for input String 
	  * 
	  * @return String of scanner type
	  * */

	public static String inputString()
	{
		return sc.next();
	}
	/*
	  * static function to check for input character
	  * 
	  * @return character of scanner type
	  * */

	public static char inputChar()
	{
		return sc.next().charAt(0);		
	}
/*
 * 
 * 
 * function check for inputing float
 * 
 * @return float of scanner type
 * */

	public static Float inputFloat()
	{
		return sc.nextFloat();		
	}
	/*
	 * 
	 * 
	 * static function check for inputing long
	 * 
	 * @return long of scanner type
	 * */

	public static long inputLong() 
	{
		return sc.nextLong();
	}
	/*
	 * 
	 * 
	 * static function check for inputing Boolean
	 * 
	 * @return Boolean of scanner type
	 * */

	public static boolean inputBoolean() 
	{
		return sc.nextBoolean();
	}
	/*static function to close scanner
	 * 
	 * */
	public static void closeScanner()
	{
		sc.close();
	}
	/**
	 * Purpose: function to print 2D Array
	 * @param:Passing string array
	 * */
	public static void print2DArray(String a[][])
	{
		int m=a.length;
		int n=a[0].length;
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	/**
	 * Purpose : Function to print 2D Array
	 * @param arr : Passing int array as an argument
	 */
	public static void print2DArray(int a[][])
	{
		int m=a.length;
		int n=a[0].length;
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	
	}
	/*
	 * purpose: static function  for inputing double type */

	public static double inputDouble() {
		
		return sc.nextDouble();
	}
	/*
	 * purpose: static function for checking  isLeap year
	 * @param : passing int value
	 * @return: boolean type
	 * */
	public static boolean isLeap(int year)
	{
		if(year % 4 == 0)
		{			
			if(year % 100 == 0) 
			{ 
				if (year % 400 == 0)
			    {
				  return true ;
			    }
				else
				return false;
			}
			else 
				return true;
		}
		else
		return false;
	
		
	
	}
	/*
	 * purpose: static function for generate random number
	 *
	 * @return: integer type
	 * */

	public static int randomNum() 
	{
		Random random=new Random();
		int i=random.nextInt(10);
        if(i!=0)
        {    
      	  return i-1;
        }
        else { 
      	  randomNum();
      	  
        }
     return 0;
   }
	
	
}
