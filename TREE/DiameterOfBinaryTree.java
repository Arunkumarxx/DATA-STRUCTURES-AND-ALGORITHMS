package I_TREE;
import java.util.LinkedList;
import java.util.Queue;

public class DiameterOfBinaryTree {
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;

        Tree(int value)
        {
            this.data=value;
            this.left=this.right=null;
        }
    }
    private void insert(int value)
    {
        if (root==null) {
            root=new Tree(value);
            return;
        }
        Queue<Tree> q=new LinkedList<Tree>();
        q.add(root);
        while (!q.isEmpty()) {
            Tree curr=q.poll();
            if (curr.left==null) {
                curr.left=new Tree(value);
                return;
            } else {
                q.add(curr.left);
            }
            if (curr.right==null) {
                curr.right=new Tree(value);
                return;
            } else {
                q.add(curr.right);
            }
        }
    }

    private void print()
    {
        InOrderTraversal(root);
    }
    private void InOrderTraversal(Tree node)
    {
        if(node!=null)
        {
            InOrderTraversal(node.left);
            System.out.print(node.data+" ");
            InOrderTraversal(node.right);
        }
    }
    private int diameter(Tree root) {
        longestPath(root);
        return lngPath+1;
    }
    int lngPath=0;
    private int  longestPath(Tree root)
    {

        if(root==null)
            return 0;

        int leftHeight=longestPath(root.left);
        int rightHeight=longestPath(root.right);

        if(leftHeight+rightHeight>lngPath)
            lngPath=leftHeight+rightHeight;

        if(leftHeight>rightHeight)
            return leftHeight+1;
        return rightHeight+1;
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
        for(int i=0;i<=234;++i)
            tree.insert(i);

        System.out.println("Diameter of the tree: " + tree.diameter(tree.root));
        tree.print();
    }
}
