package TREE;

public class SizeOfBinaryTree {
    private Tree root;

    private class Tree {
        int data;
        Tree left, right;
        Tree(int value) {
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }

    private void insert(int value) {
        root = addNode(root, value);
    }

    private Tree addNode(Tree root, int value) {
        if (root == null) {
            root = new Tree(value);
            return root;
        }
        if (value < root.data)
            root.left = addNode(root.left, value);
        else if (value > root.data)
            root.right = addNode(root.right, value);
        return root;
    }

    private void print() {
        InOrderTraversal(root);
    }

    private void InOrderTraversal(Tree node) {
        if (node != null) {
            InOrderTraversal(node.left);
            System.out.print(node.data + " ");
            InOrderTraversal(node.right);
        }
    }

    public static int getSize(Tree node) {
        return treeTraversal(node);
    }

    private static int treeTraversal(Tree root) {
        if (root == null)
            return 0;
        return 1 + treeTraversal(root.left) + treeTraversal(root.right);
    }

    public static void main(String[] args) {
        SizeOfBinaryTree tree = new SizeOfBinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        tree.print();
        System.out.println("\nSize of the tree: " + getSize(tree.root));
    }
}
