package assignment;
import java.util.*;


class Tree extends Thread 

{ 
	
   //BST node
    class Node
    
    { 
        String key; 
        Node left, right; 
   
        public Node(String data)
        { 
            key = data; 
            left = right = null; 
        } 
    } 
    
    //root node 
    Node root; 
  
  
    //constructor
   Tree()
    { 
        root = null; 
    } 
    
    
   
  
   
   
    
    // inserting node 
    
    public void insert(String word)  
    { 
        root = insert_Recursive(root, word); 
    } 
   
    //recursive insert function
    Node insert_Recursive(Node root, String key)
    { 
        
    	if (root == null) { 
            root = new Node(key); 
            return root; 
       } 
        
        
        
        if (key.compareTo(root.key) < 0)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key); 
        else if (key.compareTo(root.key) > 0)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key); 
          // return pointer
        return root; 
    } 
 
    
    //traversal of BST 
    void inorder() { 
        inorder_Recursive(root); 
    } 
   
    // recursively traverse the BST  
    void inorder_Recursive(Node root) { 
        if (root != null) { 
            inorder_Recursive(root.left); 
            System.out.print(root.key + " "); 
            inorder_Recursive(root.right); 
        } 
    } 
     
   
    boolean search(String key)  { 
        root = search_Recursive(root, key); 
        if (root!= null)
            return true;
        else
            return false;
    } 
   
    //recursive insert function
    Node search_Recursive(Node root, String key) 
    { 
       if (root==null || key.compareTo(root.key)==0)
            return root; 
       
       if (key.compareTo(root.key) < 0) 
            return search_Recursive(root.left, key); 
       
       return search_Recursive(root.right, key); 
    }
   
   
}