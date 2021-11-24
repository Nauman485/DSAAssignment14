package geekster;
public class Height_of_Tree {
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

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left= new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.println(getHeight(root));

	}



}
