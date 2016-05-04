package test;

public class TrinaryTree {
	
	  //Define a tree node
	  static class Node
	  {
	      //Left is less than node value
	      Node left;
	      //Middle is equal to node value
	      Node middle;
	      //Right is greater than node value
	      Node right;

	      //Node value
	      int value;

	      //Constructor
	      public Node(int value)
	      {
	          this.value = value;
	      }
	  }


	  //Insert a node into the tree
	  public void Insert(Node node, int value)
	  {
	      if (value < node.value)
	      {
	          //Left child exist
	          if (node.left != null)
	          {
	              Insert(node.left, value);
	          }
	          //Left child does not exist
	          //so create it
	          else
	          {
	              node.left = new Node(value);
	          }
	      }
	      //Same reasoning as above but for right
	      else if (value > node.value)
	      {
	          if (node.right != null)
	          {
	              Insert(node.right, value);
	          }
	          else
	          {
	              node.right = new Node(value);
	          }
	      }
	      //Same reasoning as above but for middle
	      else
	      {
	          if (node.middle != null)
	          {
	              Insert(node.middle, value);
	          }
	          else
	          {
	              node.middle = new Node(value);
	          }
	      }
	  }

	  public Node Delete(Node node, int value)
	  {
	      if (node.value > value)
	      {
	          node.left = Delete(node.left, value);
	      }
	      else if(node.value < value)
	      {
	          node.right = Delete(node.right, value);
	      }
	      else
	      {
	          if (node.middle != null)
	          {
	              node.middle = Delete(node.middle, value);
	          }
	          else if(node.right != null)
	          {
	              int min = minimum(node.right).value;
	              node.value = min;
	              node.right = Delete(node.right, min);
	          }
	          else
	          {
	              node = node.left;
	          }
	      }
	      return node;
	  }

	    protected Node minimum(Node node)
	  {
	      if(node != null)
	      {
	          while (node.left != null)
	          {
	              return minimum(node.left);
	          }
	      }

	      return node;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
