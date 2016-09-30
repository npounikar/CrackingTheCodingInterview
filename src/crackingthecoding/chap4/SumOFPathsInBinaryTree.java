package crackingthecoding.chap4;

public class SumOFPathsInBinaryTree {

	public static void main(String[] args) {

		int target = 5;
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(10);
		bst.add(5);
		bst.add(2);
		bst.add(3);
		bst.add(0);
		bst.add(-5);
		bst.add(-7);
		
		findSum(bst.root, target);
	}

	
	private static void findSum(Node root, int target) {
		int depth = depth(root);
		int[] path = new int[depth];
		int level = 0;
		findPath(root, target, path, level);
	}

	
	private static int depth(Node root) {
		if(root == null)
			return 0;
		return 1+Math.max(depth(root.left), depth(root.right));
	}

	
	private static void findPath(Node root, int target, int[] path, int level) {
		
		if(root == null)
			return;
		
		//insert current node into the path
		path[level] = root.data;
		
		//look for the paths with a sum that ends at this node
		int t = 0;
		for(int i = level; i>= 0; i--) {
			t = t + path[i];
			if(t == target)
				print(path, i, level);
		}
		
		//search nodes beneath this one
		findPath(root.left, target, path, level+1);
		findPath(root.right, target, path, level+1);	
		
		// Remove current node from path. Not strictly necessary, since
		//we would ignore this value, but it's good practice. 
		path[level] = Integer.MIN_VALUE;
	}

	private static void print(int[] path, int start, int end) {
		for(int i = start; i<=end; i++)
			System.out.println(path[i]+", ");
		
		System.out.println("");
	}

}
