package I_TREE;

public class ChildrenSumProperty {
    private Tree root;
    private class Tree
    {
        int data;
        Tree right;
        Tree left;
        Tree(int value)
        {
            this.data=value;
            this.left=this.right=null;
        }
    }
    private void insert(int value)
    {
        root=addNode(root,value);
    }
    private Tree addNode(Tree root,int data)
    {
        if(root==null)
        {
            root=new Tree(data);
            return root;
        }
        if(data<root.data)
            root.left=addNode(root.left,data);
        else if(data>root.data)
            root.right=addNode(root.right,data);
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
    private boolean isSumProperty()
    {
        childrenProperty(root);
        return isSumPropertyValid;
    }
    boolean isSumPropertyValid=true;
    private void childrenProperty(Tree root)
    {
        if(root==null|| !isSumPropertyValid)
            return;
        if(root.left==null && root.right==null)
            return;
        int childSum=0;
        if(root.left!=null)
            childSum+=root.left.data;
        if(root.right!=null)
            childSum+=root.right.data;

        if(childSum!=root.data) {
            isSumPropertyValid = false;
            return;
        }
        childrenProperty(root.left);
        childrenProperty(root.right);
    }
    public static void main(String[] args) {
        ChildrenSumProperty tree= new ChildrenSumProperty();
        tree.insert(10);
        tree.insert(4);
        tree.insert(6);
        tree.insert(2);
        tree.insert(2);
        System.out.println(tree.isSumProperty());
    }

}
