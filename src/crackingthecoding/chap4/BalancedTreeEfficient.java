package crackingthecoding.chap4;

public class BalancedTreeEfficient {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();

		bst.add(10);
		bst.add(7);
		bst.add(12);
		bst.add(5);
		bst.add(3);
	
		bst.postOrderTraversal(bst.root);
		System.out.println(isBalanced(bst.root));

	}

	private static boolean isBalanced(Node root) {

		if(checkHeight(root) == -1)
			return false;
		else 
			return true;
	}

	private static int checkHeight(Node root) {
		
		if(root == null)
			return 0;
		
		int lH = checkHeight(root.left);
		if(lH == -1)
			return -1;
		
		int rH = checkHeight(root.right);
		if(rH == -1)
			return -1;
		
		int hDiff = lH - rH;
		if(Math.abs(hDiff) > 1)
			return -1;
		else
			return Math.max(lH, rH) + 1;
		
	}

}
