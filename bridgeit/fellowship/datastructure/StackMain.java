package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.StackUtility;

public class StackMain {
	public static void main(String[] args) 
	{
		String str = "((5+6)∗(7+8))/(4+3)(5+6)∗((7+8/(4+3)))";
		char a[] = str.toCharArray();
		System.out.println(str);
		for (int i = 0; i < a.length; i++) 
		{
			StackUtility.push(a[i]);
		}
		boolean status = isBalancePara(a.length);
		if (status) {
			System.out.println("Parenthesess is Balence...");
		} else
		{
			System.out.println("Parenthesess is Not Balence");
		}
	}

	/**
	 * This method first pop values from the stack then compare both ( )
	 * parenthesess
	 * 
	 * @param len it store size of given string array
	 * @return return count of parenthesess
	 */
	public static boolean isBalancePara(int len) {

		int count1 = 0;
		int count2 = 0;
		int i=0;
		while (i < len)
		{
			char ch = StackUtility.pop();
			if (ch == '(') 
			{
				count1++;
			}
			if (ch == ')') 
			{
				count2++;
			}
			i++;
		}
		return (count1 == count2) ? true : false;

	}
}
