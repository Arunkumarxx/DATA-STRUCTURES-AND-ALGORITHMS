package TREE;

public class FixTwoNodesOfBinarySearchTree {
    private Tree root;
    Tree res[]=new Tree[2];
    Tree prev=null;

    private class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            this.left=this.right=null;
        }
    }

    private void insert(int key) {
        if(root==null) {
            root=new Tree(key);
            return;
        }
        Tree curr=root;
        Tree parent=null;
        while(curr!=null) {
            parent=curr;
            if(key<curr.data)
                curr=curr.left;
            else if(key>curr.data)
                curr=curr.right;
            else return;
        }
        if(parent!=null&&key<parent.data)
            parent.left=new Tree(key);
        else if(parent!=null&&key>parent.data)
            parent.right=new Tree(key);
    }

    public Tree correctBST(Tree root) {
        res[0]=null;
        res[1]=null;
        inOrderTraversal(root);
        if(res[0]!=null&&res[1]!=null) {
            int temp=res[0].data;
            res[0].data=res[1].data;
            res[1].data=temp;
        }
        return root;
    }

    private void inOrderTraversal(Tree root) {
        if(root==null)
            return;
        inOrderTraversal(root.left);
        if(prev!=null&&prev.data>root.data) {
            if(res[0]==null) {
                res[0]=prev;
            }
            res[1]=root;
        }
        prev=root;
        inOrderTraversal(root.right);
    }

    private void printInOrder(Tree root) {
        if(root==null)
            return;
        printInOrder(root.left);
        System.out.print(root.data+" ");
        printInOrder(root.right);
    }

    private boolean isBST(Tree root,int min,int max) {
        if(root==null)
            return true;
        if(root.data<=min||root.data>=max)
            return false;
        return isBST(root.left,min,root.data)&&isBST(root.right,root.data,max);
    }

    public static void main(String[] args) {
        FixTwoNodesOfBinarySearchTree tree=new FixTwoNodesOfBinarySearchTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(8);
        tree.insert(15);

        tree.root.left.right.data=20;
        tree.root.right.data=8;

        System.out.println("Before correction:");
        tree.printInOrder(tree.root);

        tree.root=tree.correctBST(tree.root);

        System.out.println("\nAfter correction:");
        tree.printInOrder(tree.root);

        System.out.println("\nIs the tree a valid BST? "+tree.isBST(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
