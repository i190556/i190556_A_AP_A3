package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class vocab_thread extends Thread 
{
String[] args;
	
Tree my_bst = new Tree();
	
	public vocab_thread(String[] S , Tree tree)
	{
		
		args= S;
		my_bst = tree;
		
	}


	@Override
	public void run()
	{
		
		try {
		      File file_obj = new File(args[0]);
		      Scanner reader = new Scanner(file_obj);
		      
		        while (reader.hasNextLine()) {
		            String data = reader.nextLine();
		            my_bst.insert(data);
		           
		          }
		   
		        
		      reader.close();
		    }
		
		
		catch (FileNotFoundException e) 
		{
		      System.out.println("Error");
		      e.printStackTrace();
		   
		}
		
		
		
		
	}
	
	
	
	
	
}