package TREE;

public class CountTheNodesAtDistanceKFromLeaf {
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;
        Tree (int data)
        {
            left=right=null;
            this.data=data;
        }
    }
    private void insert(int value)
    {
        root =addNode(root,value);
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
    private void print()
    {
        PostOrderTraversal(root);
    }
    private void PostOrderTraversal(Tree root)
    {
        if(root==null)
            return;
        PostOrderTraversal(root.left);
        System.out.print(root.data+" ");
        PostOrderTraversal(root.right);
    }

    private int  countNodeLeafK()
    {
        return -1;
    }
    private void CountTheNodeAtDistanceLeaf()
    {
        
    }


    public static void main(String[] args) {
        CountTheNodesAtDistanceKFromLeaf BinaryTree =new CountTheNodesAtDistanceKFromLeaf();
        BinaryTree.insert(1);
        BinaryTree.insert(2);
        BinaryTree.insert(3);
        BinaryTree.insert(4);
        BinaryTree.print();
        System.out.println(BinaryTree.countNodeLeafK());
    }

}
