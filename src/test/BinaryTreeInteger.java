package test;

import java.util.*;
import java.util.Stack;

public class BinaryTreeInteger {
	private static TreeNode root;
	private TreeNode prev;
	
	public static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int item) {
			value = item;
			left = right = null;
			
		}
	}
	
	public void TreeNode() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void insert(int data) {
		TreeNode newNode = new TreeNode(data);
		//newNode.value = data;
		//newNode.right = newNode.left = null;
		
		if (isEmpty()) {
			root = newNode;
			return;
		}
		insert(root, newNode);
	}
	
	public void insert(TreeNode latestRoot, TreeNode newNode) {
		
		if (newNode.value < latestRoot.value) {
			if (latestRoot.left == null) {
				latestRoot.left = newNode;
				return;
			} else {
				insert(latestRoot.left, newNode);
			}
		} else {
			if (latestRoot.right == null) {
				latestRoot.right = newNode;
				return;
			} else {
				insert(latestRoot.right, newNode);
			}
		}
			
	}
	
	/*Simplified code for Binary tree insertion using recursion*/

	public static TreeNode Insert(TreeNode root,int value)
	    {
	        if (root == null) {
	        	TreeNode newNode = new TreeNode(value);
	            newNode.left = null;
	            newNode.right = null;
	            root = newNode;
	        } else if (root.value > value) {
	            root.left = Insert(root.left, value);
	        } else if (root.value < value) {
	            root.right = Insert(root.right, value);
	        }
	    
	        return root;
	    }
	//Getting the height of the tree
	public static int height(TreeNode root) {
//		if (root == null) return 0;
//		return 1 + Math.max(height(root.left), height(root.right));
		
		if (root == null)
             return 0;
       
        int leftDepth = height(root.left);
        int rightDepth = height(root.right);
       
        if (leftDepth > rightDepth) {
            return leftDepth+1;
        } else {
            return rightDepth+1;
        }
	}
	
	public void displayInOrder(TreeNode nodePtr) {
		if (nodePtr != null) {
			displayInOrder(nodePtr.left);
			System.out.print(nodePtr.value + "\n");
			displayInOrder(nodePtr.right);
		}
	}
		
	public void displayPreOrder(TreeNode nodePtr) {
		if (nodePtr != null) {
			System.out.print(nodePtr.value + "\n");
			displayPreOrder(nodePtr.left);
			displayPreOrder(nodePtr.right);
		}
	}
	
	public void displayPostOrder(TreeNode nodePtr) {
		if (nodePtr != null) {
			displayPostOrder(nodePtr.left);
			displayPostOrder(nodePtr.right);
			System.out.print(nodePtr.value + "\n");
		}
	}
	
	public void displayInOrder() {
		displayInOrder(root);
	}
	
	public void displayPreOrder() {
		displayPreOrder(root);
	}
	
	public void displayPostOrder() {
		displayPostOrder(root);
	}
	
	
	//VALIDATES BINARY TREE
	// To keep tract of previous node in Inorder Traversal

 
    boolean isBST()  {
        prev = null;
        return isBST(root);
    }
 
    /* Returns true if given search tree is binary
       search tree (efficient version) */
    boolean isBST(TreeNode node)
    {
        // traverse the tree in inorder fashion and
        // keep a track of previous node
        if (node != null)
        {
            if (!isBST(node.left))
                return false;
 
            // allows only distinct values node
            if (prev != null && node.value <= prev.value )
                return false;
            
            prev = node;
            return isBST(node.right);
        }
        return true;
    }
    
    public static boolean isValidBST() {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
     
    public static boolean helper(TreeNode root, int min, int max){
    	
    	if (root == null) 
    		return true;
     
        if(root.value<=min || root.value>=max)
            return false;
     
        return (helper(root.left, min, root.value-1)   &&
        		helper(root.right, root.value+1, max));
        
    }
    
    //In order traversal without recursion
    /*
    1) Create an empty stack S.
    2) Initialize current node as root
    3) Push the current node to S and set current = current->left until current is NULL
    4) If current is NULL and stack is not empty then 
         a) Pop the top item from stack.
         b) Print the popped item, set current = popped_item->right 
         c) Go to step 3.
    5) If current is NULL and stack is empty then we are done.
    */
    public ArrayList<Integer> inorderTraversal(TreeNode a) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	
    	if (a == null) {
    		return null;
    	}
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode node = a;
    	
    	while (node != null) {
    		stack.push(node);
    		node = node.left;
    	}
    	
    	//traverse the tree
    	while (stack.size() > 0) {
    		node = stack.pop();
    		res.add(node.value);
    		
    		if (node.right != null) {
    			node = node.right;
    			
    			while (node != null) {
    				stack.push(node);
    				node = node.left;
    			}
    		}
 
    	} //end while
    	
    	return res;
    	
	}
	
	
	public static void main(String[] args) {
		BinaryTreeInteger tree = new BinaryTreeInteger();


        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
    
       // tree.root.left.right = new TreeNode(3);
		//System.out.println(Double.POSITIVE_INFINITY);
		//System.out.println("Displaying In Order Traversal");
		tree.displayInOrder();
//		
//		System.out.println("Displaying PreOrder Traversal");
//		tree.displayPreOrder();
//		
//		System.out.println("Displaying PostOrder Traversal");
//		tree.displayPostOrder();
		if (tree.isBST())
            System.out.println("TREE IS BST");
        else
            System.out.println("TREE Not a BST");
		
		//System.out.println(height(tree.root));
		
	}
}
