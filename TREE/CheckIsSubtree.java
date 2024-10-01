package TREE;

public class CheckIsSubtree {

    private static boolean isSubtree(Node root1, Node root2) {

        return treeTraversal(root1,root2);
    }
    private static boolean treeTraversal(Node root1,Node root2)
    {
        if(root1==null)
            return false;
        if(root1.data==root2.data)
            if(subTreeTraversal(root1,root2))
                return true;
        return treeTraversal(root1.left,root2) || treeTraversal(root1.right,root2);
    }

    private static boolean subTreeTraversal(Node root1,Node root2){
        if(root2==null)
            return true;
        if(root1==null  || root1.data != root2.data)
            return false;
        return  subTreeTraversal(root1.left,root2.left) && subTreeTraversal(root1.right,root2.right);
    }
    public static void main(String[] args) {

    }

}
