package com.bridgeit.fellowship.junit;

import com.bridgeit.fellowship.utility.Utility;

public class BinaryNibbles {
public static void main(String[] args) {
	String s = new String();
		System.out.println("Enter the decimal number");
		int n=Utility.inputInt();
		System.out.println("Binary number is  ");

		 s=Util.decToBin(n); 
		 
		  Util.toSwapNibbles(s);
		 //System.out.println(str);
	     System.out.println("Decimal number is  ");
		System.out.println(Util.toDecimal(s));
		Utility.closeScanner();
		

	   
	}
}
