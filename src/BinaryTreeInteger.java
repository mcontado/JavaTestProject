
public class BinaryTreeInteger {
	private TreeNode root;
	
	public static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
	}
	
	public void TreeNode() {
		root = null;
	}
	
	public void insertNode(int data) {
		TreeNode newNode = new TreeNode();
		newNode.value = data;
		newNode.right = newNode.left = null;
		
		insert(root, newNode);
	}
	
	public void insert(TreeNode nodePtr, TreeNode newNode) {
		if (nodePtr == null) {
			nodePtr = newNode;  //Insert the node
		} else if (newNode.value < nodePtr.value) {
			insert(nodePtr.left, newNode); //search the left branch
		} else {
			insert(nodePtr.right, newNode);  //search the right branch
		}
			
	}
	
	public void displayInOrder(TreeNode nodePtr) {
		if (nodePtr != null) {
			displayInOrder(nodePtr.left);
			System.out.print(nodePtr.value);
			displayInOrder(nodePtr.right);
		}
	}
	
	public void displayInOrder() {
		displayInOrder(root);
	}
	
	
	public static void main(String[] args) {
		BinaryTreeInteger tree = new BinaryTreeInteger();
		tree.insertNode(5);
		tree.insertNode(8);
		tree.insertNode(3);
		tree.insertNode(12);
		tree.insertNode(9);
		tree.displayInOrder();
		
	}
}
