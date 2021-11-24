package geekster;

public class Leaf_node_Tree {
	
	static void leaf(Node node) {
		if(node==null) 
			return;
	leaf(node.left);
	leaf(node.right);
	if(node.left==null && node.right==null) {
		System.out.print(node.key+" ");
	}
	}
	
	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left= new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		leaf(root);
	}

}
