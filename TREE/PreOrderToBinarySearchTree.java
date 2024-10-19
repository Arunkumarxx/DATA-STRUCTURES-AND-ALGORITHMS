package TREE;

public class PreOrderToBinarySearchTree {
    public Node Bst(int pre[], int size) {
        return preOrderToBinaryTree(pre,size,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private int ind=0;
    private Node preOrderToBinaryTree(int pre[],int size,int min,int max)
    {
        if(ind>=size)
            return null;

        if(pre[ind]<min || pre[ind]>max)
            return null;

        Node root=new Node(pre[ind++]);

        root.left=preOrderToBinaryTree(pre,size,min,root.data);
        root.right=preOrderToBinaryTree(pre,size,root.data,max);
        return root;
    }
    public static void main(String[] args) {

    }



}
