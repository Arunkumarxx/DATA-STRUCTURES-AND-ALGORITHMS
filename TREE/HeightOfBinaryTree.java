package TREE;

public class HeightOfBinaryTree {
    private Tree root;

    private class Tree {
        int data;
        Tree left;
        Tree right;

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
        if (value < root.data) {
            root.left = addNode(root.left, value);
        } else if (value > root.data) {
            root.right = addNode(root.right, value);
        }
        return root;
    }

    // Method to print the tree in a structured format
    private void printTree() {
        printTree(root, 0);
    }

    private void printTree(Tree node, int space) {
        // Base case
        if (node == null) {
            return;
        }

        // Increase distance between levels
        space += 10;

        // Process right child first
        printTree(node.right, space);

        // Print current node after space count
        System.out.println();
        for (int i = 10; i < space; i++) {
            System.out.print(" ");
        }
        System.out.print(node.data);

        // Process left child
        printTree(node.left, space);
    }

    public static void main(String[] args) {
        HeightOfBinaryTree tree = new HeightOfBinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(-3);
        tree.insert(3);
        tree.insert(4);
        tree.insert(6);
        tree.printTree(); // Call the new printTree method
    }
}
