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
            root=addNode(root.left,value);
        if(value>root.data)
            root=addNode(root.right,value);
        return root;
    }
    public static void main(String[] args) {
        PrintNodesAtKdistance tree = new PrintNodesAtKdistance();
        tree.insert(2);
        tree.insert(223);
        tree.insert(22);
    }

}
