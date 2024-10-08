package TREE;

public class PrintNodesAtKdistance {
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;

        Tree(int value)
        {
            this.data=value;
            this.left=null;
            this.right=null;
        }
    }
    private void insert(int value)
    {
        root=addNode(root,value);
    }
    private Tree addNode(Tree root,int value)
    {
        if(root==null)
        {
            root=new Tree(value);
            return root;
        }
        if(value<root.data)
            root.left=addNode(root.left,value);
        if(value>root.data)
            root.right=addNode(root.right,value);
        return root;
    }
    private void printDistanceK(int k)
    {
        printDistanceOfK(root,k);
    }
    private void printDistanceOfK(Tree root,int k)
    {
        if(root==null)
            return;
        if(k==0)
        {
            System.out.print(root.data+" ");
            return;
        }
        printDistanceOfK(root.left,k-1);
        printDistanceOfK(root.right,k-1);
    }
    public static void main(String[] args) {
        PrintNodesAtKdistance tree = new PrintNodesAtKdistance();
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.printDistanceK(2);
    }


}
