package TREE;

public class LowestCommonAncestorInABinarySearchTree {
    Node LCA(Node root, int n1, int n2)
    {
        while(root!=null)
        {
            if(n1 < root.data  && n2 <root.data)
                root=root.left;
            else if(n1 > root.data  && n2 > root.data)
                root=root.right;
            else return root;
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
