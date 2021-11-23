package assignment;
import java.io.*;
import java.util.*;


public class My_vector extends Thread

{
    
 
        Vector<String> v = new Vector<String>();
 
        
        public void insert(String S)
        {
        	
 
        	try {
  		      File file_obj = new File(S);
  		      Scanner reader = new Scanner(file_obj);
  		      
  		        while (reader.hasNextLine())
  		        {
  		         
  		            String word = reader.nextLine();
  		          
  		            
  		          StringTokenizer st = new StringTokenizer(word);  
  		          while (st.hasMoreTokens()) 
  		          {  
  		              v.add(st.nextToken());  
  		          } 
  		            
  		            
  		        
  		          }
  		        
  		        
  		      reader.close();
  		    }
  		
  		catch (FileNotFoundException e) 
  		{
  		      System.out.println("Error");
  		      e.printStackTrace();
  		   
  		}
        
        
        
        }	
        	
        void display()
        { 
        	for (int i = 0; i < v.size(); i++)
        	System.out.println(v.get(i) + " ");
        	
        }
        
        
        
        int search (String query)
        {
        	int count=0;
        	
        	for(int i=0; i<v.size(); i++)
        	{
        		if(query.compareTo(v.get(i)) ==0 ) 
        		count++;
        			
        				
        	}
        	return count;
        	}
        
        

}
    
