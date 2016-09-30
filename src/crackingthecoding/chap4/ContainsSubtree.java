package crackingthecoding.chap4;

public class ContainsSubtree {

	public static void main(String[] args) {


		//perform the inorder and preorder traversals for T1 and T2
		// if T1 (being the bigger tree) contains T2(being the smaller)... then
		// the T2 would be substring of T1 ( traversal reuslt)
		
		//Note that we'll need to insert a special character into our strings to indicate when a
		//left or right node is NULL.
		
		
		BinarySearchTree t1 = new BinarySearchTree();
		t1.add(5);
		t1.add(3);
		t1.add(4);
		
		BinarySearchTree t2 = new BinarySearchTree();
		t2.add(5);
		t1.add(3);
		t1.add(4);
		
		System.out.println(containTree(t1.root,t2.root));

	}

	private static boolean containTree(Node t1, Node t2) {
		if(t2 == null)
			return true;
		return subTree(t1, t2);
	}

	private static boolean subTree(Node t1, Node t2) {
		if(t1 == null)
			return false;
		
		if(t1.data == t2.data) {
			if(matchTree(t1,t2))
				return true;
		}
		
		return (subTree(t1.left, t2) || subTree(t1.right, t2));
			
	}

	
	private static boolean matchTree(Node t1, Node t2) {
		
		if(t1 == null && t2 == null)
			return true;
		
		//if one emty and the other is not
		if(t1 == null ||t2 == null)
			return false;
		
		if(t1.data != t2.data)
			return false;  //doesnt match
		
		return (matchTree(t1.left, t2) && matchTree(t1.right, t2));
	}

}
