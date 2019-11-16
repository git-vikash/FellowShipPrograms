package com.bridgeit.fellowship.algoPrograms;

import java.util.Arrays;

import com.bridgeit.fellowship.utility.Utility;
/*
 * purpose:  To Check string is Annagram or not  
 * 
 * @author Milind Patil
 * @version 1.0
 * @since 13-11-2019
 * */

public class AnagramDetection 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the first string");
		String str1 = Utility.inputString();
		System.out.println("Enter the secound string");
		String str2 = Utility.inputString();
		boolean b = isAnagram(str1, str2);
		if (b) 
		{
			System.out.println("String is Anagram");
		} else 
		{
			System.out.println("String is not Anagram");
		}

		// Closing Scanner

		Utility.closeScanner();
	}

	/**
	 * Function to check whether strings are anagram
	 * 
	 * @param s1 : First String
	 * @param s2 : Second String
	 * @return true if strings are anagram else false
	 **/

	public static boolean isAnagram(String str1, String str2) 
	{
            boolean status;
		if (str1.length() != str2.length())
		{
			return false;
		}
		char[] s1 = str1.toLowerCase().toCharArray();
		char[] s2 = str2.toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		status=Arrays.equals(s1,s2);
		return status;
		
	}

}
