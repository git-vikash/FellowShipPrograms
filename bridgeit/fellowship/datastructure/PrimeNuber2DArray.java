package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Utility;

public class PrimeNuber2DArray
{
  public static void main(String[] args) 
  {
	 int row=1000/100;
	 int col=30;
		int ar[] = Utility.primeSeries(1000);
		int primeArray[][] = Utility.storePrimeNumberInTo2DArray(ar, row, col);
		int count = 99;
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				if (primeArray[i][j] != 0)
					System.out.print("" + primeArray[i][j] + " ");
				if (count < primeArray[i][j])
				{
					count = count + 100;
					System.out.println();
				}
		
			}

		}

	}
}
