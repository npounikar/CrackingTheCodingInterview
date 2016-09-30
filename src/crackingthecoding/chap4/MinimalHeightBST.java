package crackingthecoding.chap4;

import java.util.Arrays;

public class MinimalHeightBST {

	public static void main(String[] args) {

		int[] in = {0,2,3,4,5,6,7,8,9,10};
		Node root = createMinimalBST(in);
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.inOrderTraversal(root);
		System.out.println(root.data);
	}

	private static Node createMinimalBST(int[] in) {
		return createMinimalBST(in, 0, in.length-1);
	}

	private static Node createMinimalBST(int[] in, int start, int end) {
		
		if(end<start)
			return null;
		
		int mid = (end + start)/2;
		Node newNode = new Node(in[mid]);
		newNode.left = createMinimalBST(in, start, mid-1);
		newNode.right = createMinimalBST(in, mid+1, end);
		
		return newNode;
	}

}
