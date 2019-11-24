package com.bridgeit.fellowship.datastructure;
import com.bridgeit.fellowship.utility.Utility;

public class Calander 
{
  public static void main(String[] args)
  {
	System.out.println("Enter month");
	int month=Utility.inputInt();
	System.out.println("Enter year");
	int year=Utility.inputInt();
	String calender[][]= Utility.createCalander(month,year);	
	
	for(int i=0;i<7;i++)
	{
		for(int j=0;j<7;j++)
		{
			System.out.print("\t"+calender[i][j]);
		}
		System.out.println();
	}
  }


}
