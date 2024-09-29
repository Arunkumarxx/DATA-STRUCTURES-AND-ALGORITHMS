package TREE;

public class MaxAndMinInBinaryTree {
    
    static int max=0;
    static int min=0;
    public static int findMax(Node root){
        max=Integer.MIN_VALUE;
        maxOfTree(root);
        return max;
    }
    private static void maxOfTree(Node root)
    {
        if(root==null)
            return ;

        maxOfTree(root.left);
        if(root.data>max)
            max=root.data;
        maxOfTree(root.right);

    }
    public static int findMin(Node root){
        //code here
        min=Integer.MAX_VALUE;
        minOfTree(root);
        return min;
    }
    private static void minOfTree(Node root)
    {
        if(root==null)
            return;
        minOfTree(root.left);
        if(root.data<min)
            min=root.data;
        minOfTree(root.right);
    }
    public static void main(String[] args) {

    }

}
