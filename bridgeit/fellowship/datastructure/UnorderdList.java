package com.bridgeit.fellowship.datastructure;
import com.bridgeit.fellowship.utility.Utility;

public class UnorderdList 
{
public static void main(String[] args) throws Exception
{
        LinkedList list=new LinkedList();		
		
		//Reading the file and storing it in an array
		//String data = "rahul,rajat rakesh,shubham";
        
		String words[] = Utility.readFile("Hello.txt");
       // System.out.println("Enter the word to search :");
       // String str = Utility.inputString();
        
        //Calling unOrderedList of DSUtil class 
		//System.out.println(Arrays.toString(words));
        int len=words.length;
        for(int i=0;i<len;i++)
        {
        	list.insert(words[i]);
        }
        list.show();
        System.out.println("Enter the search String");
        String search=Utility.inputString();
          
        boolean found=list.search(search);
        if(found)
        {
        	list.delete(search);
        System.out.println("found  ");
        }else
        	System.out.println("Not found");
        list.show();
        Utility.writeToFile("Hello.txt", list);
        //Closing Scanner
        
        
        Utility.closeScanner();
        
	}
}
