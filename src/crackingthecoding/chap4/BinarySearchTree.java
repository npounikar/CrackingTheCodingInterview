package crackingthecoding.chap4;


public class BinarySearchTree {

    Node root;
	
    BinarySearchTree() {
		root  = null;
	}
	
	public boolean isempty() {
		return root == null;
	}
	
	public void add(int data) {
		root = add(root, data);
	}
	
	public Node add(Node root, int data) {
		
		if(root == null)
			root = new Node(data);
		
		else if(root.data > data)
			root.left = add(root.left, data);
		
		else if(root.data <= data)
			root.right = add(root.right, data);
		
		return root;
	}
	
	
	
	public void preOrderTraversal(Node root) {
		if(root == null) return;
		System.out.println(root.data);
		inOrderTraversal(root.left);
		inOrderTraversal(root.right);
	}
	public void inOrderTraversal(Node root) {
		if(root == null) return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
	public void postOrderTraversal(Node root) {
		if(root == null) return;
		inOrderTraversal(root.left);
		inOrderTraversal(root.right);
		System.out.println(root.data);
	}


}
