
//AS2016480 : K.K.G.H.H. Priyangika.(Assignment_1) 
package bst;

import bst.Bst.Node;

/**
 * @author Himali Hansani
 */
public class BSTapp {
    public static void main(String[] args) {
        
        Bst a=new Bst();
       
        //8,3,6,10,4,7,1,14,13
        
        
	/*  following BST 
		 8	
		/ \ 
	       3   10 
	      / \     \ 
	     1   6     14
                / \    /
               4   7  13    */
       
        a.insert(8);
        a.insert(3);
        a.insert(6);
        a.insert(10);
        a.insert(4);
        a.insert(7);
        a.insert(1);
        a.insert(14);
        a.insert(13);
        
        System.out.println("\nInorder traversal of the given tree"); 
        a.inorder(); 
  
        System.out.println("\nDelete 1 ->(no child)"); 
        a.delete(1); 
        System.out.println("Inorder traversal of the modified tree"); 
        a.inorder(); 
  
        System.out.println("\nDelete 14 ->(one child)"); 
        a.delete(14); 
        System.out.println("Inorder traversal of the modified tree"); 
        a.inorder(); 
  
        System.out.println("\nDelete 6 ->(two children)"); 
        a.delete(6); 
        System.out.println("Inorder traversal of the modified tree"); 
        a.inorder();
        
        System.out.println("\n\n");
        
        
    }
    
}


/* The NetBeans out put is : 

Inorder traversal of the given tree
1 3 4 6 7 8 10 13 14 
Delete 1 ->(no child)
Inorder traversal of the modified tree
3 4 6 7 8 10 13 14 
Delete 14 ->(one child)
Inorder traversal of the modified tree
3 4 6 7 8 10 13 
Delete 6 ->(two children)
Inorder traversal of the modified tree
3 4 7 8 10 13 


BUILD SUCCESSFUL (total time: 0 seconds)

*/