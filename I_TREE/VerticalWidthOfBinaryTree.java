package I_TREE;

import java.util.HashSet;

public class VerticalWidthOfBinaryTree {
    private Tree root;

    private class Tree {
        int data;
        Tree left;
        Tree right;

        Tree(int data) {
            this.data=data;
            this.left=this.right=null;
        }
    }

    private void insert(int value) {
        root=addNode(root,value);
    }

    private Tree addNode(Tree root,int data) {
        if (root==null) {
            root=new Tree(data);
            return root;
        }
        if (data<root.data)
            root.left=addNode(root.left,data);
        else if (data>root.data)
            root.right=addNode(root.right,data);
        return root;
    }

    private void print() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Tree root) {
        if (root==null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    public int verticalWidth(Tree root) {
        HashSet<Integer> hashset=new HashSet<Integer>();
        preOrderTraversal(hashset,root,0);
        return hashset.size();
    }

    private void preOrderTraversal(HashSet<Integer> hashset,Tree root,int lvl) {
        if(root==null)
            return;
        if(!hashset.contains(lvl))
            hashset.add(lvl);
        preOrderTraversal(hashset,root.left,lvl+1);
        preOrderTraversal(hashset,root.right,lvl-1);
    }

    public static void main(String[] args) {
        VerticalWidthOfBinaryTree tree=new VerticalWidthOfBinaryTree();
        tree.insert(10);
        tree.insert(7);
        tree.insert(15);
        tree.insert(5);
        tree.insert(9);
        tree.insert(11);
        tree.insert(17);
        System.out.println("Vertical width of the tree: "+tree.verticalWidth(tree.root));
    }
}
