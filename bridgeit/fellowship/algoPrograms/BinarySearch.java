package com.bridgeit.fellowship.algoPrograms;
import java.io.*;
import java.util.Arrays;
import com.bridgeit.fellowship.utility.Utility;
/*
 * purpose:  Binary search using string 
 * 
 * @author Milind Patil
 * @version 1.0
 * @since 12-11-2019
 * */
public class BinarySearch {
	public static void main(String[] args) throws IOException
	{  
		//open file
		
		File f=new File("/home/bridgeit/Desktop/AlgorithPrograms/hello.txt");
				
		// create file reader object to read file
		
		FileReader fr =new FileReader(f);
		
		// create buffered reader object to read from buffer
		
		BufferedReader br =new BufferedReader(fr);
	   
		//create and initialize variables
		
		String words[]=null;
		
		String s;	
		int mid,first,last;
		
		//fetch line of data from file and store in  words array
		while((s=br.readLine())!=null)
		{ 
			words=s.split(" ");
			
		}
		int n= words.length;
		
		// print words array
		
		System.out.println(n);
		for(int i=0;i<words.length;i++)
		System.out.println(words[i]);
		
		// sort Array
		
		Arrays.sort(words);
		
		//take search string  from user
		
		String search=Utility.inputString();
		
		//initialize variable
		
		first=0;
		last=n-1;

		boolean flag=false;
		
		while(last>=first)
		{
			//find mid of words array
			
			mid = (first+last)/2;
			
             //compare search string with words array
			
			int x= search.compareTo(words[mid]);
			//check if search contains to word
			if(x==0)
			{
				System.out.println("Search  string found ");
				flag=true;
				break;
			}
			if(x>0)
			{
				first=mid+1;
			}
			else
			{
				last = mid-1;
			}
		}
		if(flag!=true)
		{		
			System.out.println("Search string does not found");
		}
		br.close();
		 
	}
	
 
}
