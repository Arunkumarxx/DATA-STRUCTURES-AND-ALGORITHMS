package TREE;

public class SizeOfBinaryTree {

    public static void main(String[] args) {

    }
    public static int getSize(Node node) {
        return treeTraversal(node);
    }
    private static int treeTraversal(Node root)
    {
        if(root==null)
            return 0;
        return 1+treeTraversal(root.left)+treeTraversal(root.right);
    }

}
