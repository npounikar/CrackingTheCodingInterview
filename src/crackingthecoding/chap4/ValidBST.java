package crackingthecoding.chap4;

public class ValidBST
{
    Node root;
 
    boolean isBST()  {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
 
    boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;
 
        if (node.data < min || node.data > max)
            return false;
 
        return (isBSTUtil(node.left, min, node.data) && isBSTUtil(node.right, node.data, max));
    }
 


    public static void main(String args[])
    {
        ValidBST tree = new ValidBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
        
//        System.out.println(tree.isValidBST());
    }
}
