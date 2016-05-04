package test;

public class BinaryTreeInteger {
	private TreeNode root;
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
	
	
	public static void main(String[] args) {
		BinaryTreeInteger tree = new BinaryTreeInteger();
		
		tree.insert(5);
		tree.insert(8);
		tree.insert(3);
		tree.insert(12);
		tree.insert(9);
//		tree.insert(4);
//		tree.insert(6);
//		tree.insert(2);
//		tree.insert(7);
//		tree.insert(15);
//	
//		BinaryTreeInteger tree = new BinaryTreeInteger();
//        tree.root = new TreeNode(4);
//        tree.root.left = new TreeNode(2);
//        tree.root.right = new TreeNode(5);
//        tree.root.right.left = new TreeNode(3);
//        tree.root.left.left = new TreeNode(1);
       // tree.root.left.right = new TreeNode(3);
		System.out.println("Displaying In Order Traversal");
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
		
	}
}
