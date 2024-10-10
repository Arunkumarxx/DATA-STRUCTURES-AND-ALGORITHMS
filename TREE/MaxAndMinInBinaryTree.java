package I_TREE;

public class MaxAndMinInBinaryTree {
    private Tree root;

    private class Tree {
        int data;
        Tree left,right;

        Tree(int value) {
            this.data=value;
            this.left=null;
            this.right=null;
        }
    }

    private void insert(int value) {
        root=addNode(root,value);
    }

    private Tree addNode(Tree root,int value) {
        if(root==null) {
            root=new Tree(value);
            return root;
        }
        if(value<root.data)
            root.left=addNode(root.left,value);
        else if(value>root.data)
            root.right=addNode(root.right,value);
        return root;
    }

    private void print() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Tree node) {
        if(node!=null) {
            inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            inOrderTraversal(node.right);
        }
    }

    public static int findMax(Tree root) {
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(findMax(root.left),findMax(root.right)));
    }

    public static int findMin(Tree root) {
        if(root==null)
            return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(findMin(root.left),findMin(root.right)));
    }

    public static void main(String[] args) {
        MaxAndMinInBinaryTree tree = new MaxAndMinInBinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        System.out.print("In-order Traversal: ");
        tree.print();

        System.out.println("\nMaximum value in the tree: "+findMax(tree.root));
        System.out.println("Minimum value in the tree: "+findMin(tree.root));
    }
}
