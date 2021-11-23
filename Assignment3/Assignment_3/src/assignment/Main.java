package assignment;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.StringTokenizer;
import java.io.IOException;  // Import this class to handle errors



public class Main

{
	public static void main(String args[]) throws IOException , choice_exception, FileNotFoundException
	
	{
		
		
		 int no_files = args.length;
			System.out.println("Total number of files are: " + no_files);
			
			System.out.println("Names of the files are: ");
			for (int i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
			
	 
		// calculating number of input files
		 int x = args.length-1;
			
		
		 
		 
		//creating tree obj 
		Tree my_bst = new Tree();
		
		
		//Threads
		vocab_thread VT = new vocab_thread(args,my_bst);
		VT.start();
		
		Input_thread IT = new Input_thread (x , args , my_bst);
		IT.start();
		
		
		
		
	     
		
		//MENU
		 int choice = 0;
		 System.out.println("Press (1) to display BST");
		 System.out.println("Press (2) to display input files through vectors");
		 System.out.println("Press (3) to match a word and find frequency");
		 System.out.println("Press (4) to search a word");
		 
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object		 
		 
		 System.out.println("Enter Choice");

		 choice = myObj.nextInt();

		     
		     
		     //input exception
		   if ((choice<=0) || (choice>=6))
		   {
			   throw new choice_exception("Invalid Input, enter a number between 1 and 5");
			   
		   }
		    
			
		     
		 if (choice == 1)
		 {
			 System.out.println("Displaying BST: ");
			 my_bst.inorder();	
		 }
		 
		 
		 else if (choice == 2)
		 {
			
		 IT.input_file_display();
			 
		 }
		 
		 
		 else if (choice == 3)
		 {
		
			
		 
		 }
		 
		 
		 else if (choice == 4)
		 {
			
			 IT.search_word();	
			 
		 }
		 
		 else if (choice == 5)
		 {
		 System.out.println("EXITING");
		 }
	
		 	
		 
	
		 
		 
	}
}