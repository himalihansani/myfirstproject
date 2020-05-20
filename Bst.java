//AS2016480 : K.K.G.H.H. Priyangika.(Assignment_1)
package bst;


public class Bst {
    
    Node cur;
    
    public class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int key) { 
	    data = key; 
	    left = right = null; 
        } 
        
    }


    // Constructor
    public Bst() {
        cur=null;
    }
    
        // This method mainly calls insertRec() 
	void insert(int key){ 
	   cur = insertRec(cur,key); 
	} 

	/* A recursive function to insert a new key in BST */
	Node insertRec(Node cur, int key) 
	{ 

	    /* If the tree is empty, return a new node */
	    if (cur == null) { 
		cur = new Node(key); 
		return cur; 
            } 

		/* Otherwise, recur down the tree */
		if (key < cur.data) 
		    cur.left = insertRec(cur.left, key); 
		else if (key > cur.data) 
		    cur.right = insertRec(cur.right, key); 

		
		return cur; 
	} 
    
        // This method mainly calls deleteRec() 
	void delete(int key) 
	{ 
	     cur = deleteRec(cur,key); 
	} 
        
    public Node deleteRec(Node cur,int val){
        if(cur==null){
          return null;
        }
        if(val<cur.data){
         cur.left=deleteRec(cur.left,val);
        } else if(val>cur.data){
         cur.right=deleteRec(cur.right,val);
        } else { 
            //case 1: no child
            if(cur.left==null && cur.right==null){
              cur=null;
            }
            //case 2: one child
            else if(cur.left==null){
              Node temp = cur;
              cur=cur.right;
              temp = null;
             
            }else if(cur.right==null){
              Node temp = cur;
              cur=cur.left;
              temp = null; 
            }
            //case 3: two children 
            else{
               Node successor=getsuccessor(cur);
               cur.data=successor.data;
               cur.right=deleteRec(cur.right,successor.data);
            }
            
        }
    
      return cur;
    }
    
    
    public Node  getsuccessor(Node cur){
        if(cur==null){
          return null;
        }
        Node temp=cur.right;

        while(temp.left != null){
         temp=temp.left;
        }

        return temp;
    
    }

    
    // This method mainly calls InorderRec() 
    void inorder(){ 
       inorderRec(cur); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node cur) 
    { 
        if (cur != null) 
        { 
            inorderRec(cur.left); 
            System.out.print(cur.data + " "); 
            inorderRec(cur.right); 
        } 
    }
       
   
}



