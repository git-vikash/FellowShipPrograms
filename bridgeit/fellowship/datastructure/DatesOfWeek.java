package com.bridgeit.fellowship.datastructure;
import com.bridgeit.fellowship.utility.Queue;
import com.bridgeit.fellowship.utility.Utility;

public class DatesOfWeek 
{
  public static void main(String[] args) 
  {	int week,month,year;
	do
	{  System.out.println("Enter week");
	      week=Utility.inputInt();
		System.out.println("Enter month");
		   month=Utility.inputInt();
		System.out.println("Enter year");
		year=Utility.inputInt();			
	}while(week>0&&week<6==false||month>12&&month<1);
	
	
	
		String calender[][]= Utility.createCalander(month,year);
			for(int i=0;i<7;i++)
			{
				for(int j=0;j<7;j++)
				{  if(week==i)
				 	{
						if(calender[i][j]!="")
							Queue.enqueue(calender[i][j]);
				 	}	
				}
		
			}
		
		System.out.println("dates of week is");
		Queue.printQueue();
	  }
}

