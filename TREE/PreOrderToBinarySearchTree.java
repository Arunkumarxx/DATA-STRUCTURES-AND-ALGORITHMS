package TREE;

public class PreOrderToBinarySearchTree {
    private class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            left=right=null;
        }
    }

    private int ind=0;

    public Tree Bst(int pre[],int size) {
        return preOrderToBinaryTree(pre,size,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private Tree preOrderToBinaryTree(int pre[],int size,int min,int max) {
        if(ind>=size)
            return null;
        if(pre[ind]<min||pre[ind]>max)
            return null;
        Tree root=new Tree(pre[ind++]);
        root.left=preOrderToBinaryTree(pre,size,min,root.data);
        root.right=preOrderToBinaryTree(pre,size,root.data,max);
        return root;
    }

    public static void main(String[] args) {
        PreOrderToBinarySearchTree tree=new PreOrderToBinarySearchTree();
        int[] preOrder1={10,5,1,7,40,50};
        Tree root1=tree.Bst(preOrder1,preOrder1.length);
        System.out.println("In-order Traversal of Test Case 1:");
        printInOrder(root1);
        System.out.println();
    }

    private static void printInOrder(Tree root) {
        if(root!=null) {
            printInOrder(root.left);
            System.out.print(root.data+" ");
            printInOrder(root.right);
        }
    }
}
