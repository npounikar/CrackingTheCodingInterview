package crackingthecoding.chap4;

import java.util.LinkedList;

public class RouteBetweenTwoNodes {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(10);
		bst.add(7);
		bst.add(12);
		bst.add(5);
		bst.add(3);
		
		System.out.println(search(bst, 7, 3));
	}

	//BFS - using Queue
	private static boolean search(BinarySearchTree bst, int i, int j) {
		
		LinkedList<Node> q = new LinkedList<Node>();
		
		
		return false;
		
	}

}
