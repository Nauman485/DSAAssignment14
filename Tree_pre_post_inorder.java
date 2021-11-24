package geekster;

class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}


public class Tree_pre_post_inorder {
	
		
		public static void preorder(Node root) {
			if(root==null) return;
			
			System.out.print(root.key+",");
			preorder(root.left);
			preorder(root.right);
		}
		
		public static void inorder(Node root) {
			if(root==null) return;
			
			inorder(root.left);
			System.out.print(root.key+",");
			inorder(root.right);
			
		}
		
		public static void postOrder(Node root) {
			if(root==null) return;
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key+",");
			
		}
			
		static int getHeight(Node node)
	    {
	        if (node == null)
	            return -1;
	        else
	        {
	            /* compute the depth of each subtree */
	            int lDepth = getHeight(node.left);
	            int rDepth = getHeight(node.right);
	  
	            /* use the larger one */
	            if (lDepth > rDepth)
	                return (lDepth + 1);
	             else
	                return (rDepth + 1);
	        }
	    }

		static int get_count(Node root){
		    if(root==null){
		        return 0;
		    }
		    else{
		        return 1+ get_count(root.left)+ get_count(root.right);
		    }
		}
			
		public static void main(String[] args)
		{
			Node root = new Node(1);
			root.left= new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			preorder(root);
			System.out.println();
			postOrder(root);
			System.out.println();
			inorder(root);

		}


}
