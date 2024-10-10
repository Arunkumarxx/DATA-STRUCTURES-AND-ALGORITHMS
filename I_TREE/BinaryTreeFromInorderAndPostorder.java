package TREE;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeFromInorderAndPostorder {
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
   private void  buildTree(int n, int in[], int post[]) {
         root= buildTree(in,post);
    }
    int p;
    int i;

    public Tree buildTree(int[] inorder, int[] postorder) {
        p = postorder.length - 1;
        i = inorder.length - 1;
        return helper(postorder, inorder, Integer.MAX_VALUE);
    }

    private Tree  helper(int[] postorder, int[] inorder, int rightBoundary) {
        if (p < 0 || inorder[i] == rightBoundary) {
            return null;
        }

        Tree newNode = new Tree(postorder[p--]);
        newNode.right = helper(postorder, inorder, newNode.data);
        i--;
        newNode.left = helper(postorder, inorder, rightBoundary);

        return newNode;
    }
    private void print()
    {
        levelTraversal(root);
    }
    private void levelTraversal(Tree root)
    {
        Queue<Tree> q =new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();

            for(int i=0; i<size;++i)
            {
                Tree node=q.poll();
                System.out.print(node.data+" ");
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BinaryTreeFromInorderAndPostorder tree =new BinaryTreeFromInorderAndPostorder();
        int  inorder[] = {4, 8, 2, 5, 1, 6, 3, 7};
        int postorder[] = {8, 4, 5, 2, 6, 7, 3, 1};
        tree.buildTree(inorder.length,inorder,postorder);
        tree.print();

    }

}
