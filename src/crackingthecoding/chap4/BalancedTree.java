package crackingthecoding.chap4;

public class BalancedTree {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add(10);
		bst.add(7);
		bst.add(12);
		bst.add(5);
		bst.add(3);
		bst.add(11);
		bst.add(15);
		bst.add(8);
		bst.postOrderTraversal(bst.root);
		System.out.println(isBalanced(bst.root));

	}

	private static boolean isBalanced(Node root) {
		
		if(root == null)
			return true;
		
		int leftSubTree = height(root.left);
		int rightSubTree = height(root.right);
		
		if((Math.abs(leftSubTree-rightSubTree) <= 1) && isBalanced(root.left) && isBalanced(root.right))
			return true;
		
		return false;
	}

	
	private static int height(Node root) {
		
		if(root == null)
			return 0;
			
		return 1+max(height(root.left), height(root.right));
	}

	
	private static int max(int lHeight, int rHeight) {
		return (lHeight >= rHeight) ? lHeight : rHeight;
	}
	
	

}
