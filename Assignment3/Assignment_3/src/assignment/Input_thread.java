package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input_thread extends Thread
{
	int files;
	String [] args;
	Tree my_bst = new Tree();
	My_vector[] V;
	//Word_freq myWord;
	
	
	public Input_thread(int no_files, String[] arg, Tree my_tree) {
		files= no_files;
		my_bst = my_tree;
		V = new My_vector [files];
		args = arg;
	}
	
	
	//inserting in Vector
	public void run()
	{
		
		 for(int i=0;i<files;i++) {
			 V[i] = new My_vector();
		 }
		 for (int i=0;i<files;i++)
		 
		 {
			 V[i].insert(args[i+1]);
		 }

	}
	
	
	
	// to display input files through vectors
	public void input_file_display() 
	{
		
		 for (int i=0;i<files;i++)
		 {
					 V[i].display();
		 }
		 
	}
	
	
	
	
	// Search Word in input files
	public void search_word() 
	
	{
		 String search_word;
		 int occurence;
		 
		 Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter the word you want to search");
		 
		 search_word = myObj2.nextLine();
		 
		 for(int i=0; i<files; i++)
		 {
			 occurence = V[i].search(search_word);
			 
System.out.println("Your searched word " +"("+ search_word +")" +" occured in " + args[i+1] + " " + occurence + " Times" );
		 }
		 
		 

		
	}
	
}