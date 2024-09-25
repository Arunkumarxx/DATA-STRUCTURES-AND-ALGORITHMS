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
        int height = getHeight(root);
        printTree(root, 0, height);
    }

    private int getHeight(Tree node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    private void printTree(Tree node, int level, int height) {
        if (node == null) {
            return;
        }

        // Print right child first (in reverse order)
        printTree(node.right, level + 1, height);

        // Print current node with connecting lines
        if (level == 0) {
            System.out.printf("%s%d\n", " ".repeat(height * 4), node.data);
        } else {
            // Calculate space before the node
            String space = " ".repeat((height - level) * 4);
            String connector = " ".repeat((height - level - 1) * 4 - 2) + "|--";
            System.out.printf("%s%s%d\n", space, connector, node.data);
        }

        // Print left child
        printTree(node.left, level + 1, height);
    }

    public static void main(String[] args) {
        HeightOfBinaryTree tree = new HeightOfBinaryTree();
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.printTree(); // Call the new printTree method
    }
}
