package I_TREE;

public class ConstructBinaryTreeFromInorderAndPreorder {
    private Tree root;
    private class Tree {
        int data;
        Tree right;
        Tree left;
        Tree(int value)
        {
            this.data=value;
            this.left=right=null;
        }
    }
    private void insert(int value)
    {
        root=addNode(root,value);
    }
    private Tree  addNode(Tree root,int value)
    {
        if(root==null)
        {
            root=new Tree(value);
            return root;
        }
        if(value<root.data)
            root.left=addNode(root.left,value);

        else if(value>root.data)
            root.right=addNode(root.right,value);

        return root;
    }
    private void print()
    {
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Tree root)
    {
        if(root==null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    private void constructTree(int [] preOrder,int[] inOrder)
    {
        root=helpFunction(preOrder,inOrder,0,0,inOrder.length-1);
    }
    private Tree  helpFunction(int [] preOrder,int[] inOrder,int preStart,int inStart,int inEnd)
    {
        if(preStart>=preOrder.length || inStart>inEnd)
            return null;
        Tree root=new Tree(preOrder[preStart]);
        int index=0;
        for(int i=inStart;i<=inEnd;++i)
        {
            if(inOrder[i]==root.data) {
                index = i;
                break;
            }
        }
       root.left= helpFunction(preOrder,inOrder,preStart+1,inStart,index-1);
       root.right= helpFunction(preOrder,inOrder,preStart+index-inStart+1,index+1,inEnd);
       return root;
    }
    public static void main(String[] args) {
        ConstructBinaryTreeFromInorderAndPreorder tree = new ConstructBinaryTreeFromInorderAndPreorder();
        int [] preOrder={1,2,4,5,3,6,7};
        int [] inOrder={4,2,5,1,6,3,7};
        tree.constructTree(preOrder,inOrder);
        tree.print();
    }
}