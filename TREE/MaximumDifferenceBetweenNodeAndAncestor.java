package I_TREE;

import java.util.Random;

public class MaximumDifferenceBetweenNodeAndAncestor {
    private Tree root;

    private class Tree
    {
        int data;
        Tree right;
        Tree left;
        private Tree(int value)
        {
            this.data=value;
            left=right=null;
        }
    }
    private void insert(int value)
    {
        root=addNode(root,value);
    }

    private Tree addNode(Tree root,int val)
    {
        if(root==null)
        {
            root=new Tree(val);
            return root;
        }
        if(val<root.data)
            root.left=addNode(root.left,val);
        else if(val>root.data)
            root.right=addNode(root.right,val);
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
        int ans = Integer.MIN_VALUE;
        private int maxDiff(Tree root)
        {
            maximumDifference(root);
            return ans;
        }

        private int maximumDifference(Tree root) {
            if(root==null)
                return Integer.MAX_VALUE;

            int left = maximumDifference(root.left);
            int right = maximumDifference(root.right);
            ans = Math.max(ans,Math.max(root.data-left,root.data-right));
            return Math.min(left,Math.min(root.data,right));
        }

    public static void main(String[] args) {
        MaximumDifferenceBetweenNodeAndAncestor tree =new MaximumDifferenceBetweenNodeAndAncestor();
        Random random =new Random();
        for(int i=0 ;i<=10;++i)
            tree.insert(random.nextInt(0,9));
        tree.print();
    }
}
