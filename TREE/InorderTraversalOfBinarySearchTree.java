package TREE;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversalOfBinarySearchTree {
    private TreeNode root;

    // TreeNode class to represent each node in the BST
    private class TreeNode {
        int data;
        TreeNode right;
        TreeNode left;

        TreeNode(int value) {
            this.data = value;
            this.right = null;
            this.left = null;
        }
    }

    // Method to insert a new key into the BST
    private void insert(int key) {
        // If the tree is empty, create the root
        if (root == null) {
            root = new TreeNode(key);
            return;
        }

        TreeNode curr = root;
        TreeNode parent = null;

        // Traverse the tree to find the appropriate position
        while (curr != null) {
            parent = curr;
            if (key < curr.data) {
                curr = curr.left;
            } else if (key > curr.data) {
                curr = curr.right;
            } else {
                return; // Duplicate key, do not insert
            }
        }

        // Insert the new node as a left or right child
        if (key < parent.data) {
            parent.left = new TreeNode(key);
        } else {
            parent.right = new TreeNode(key);
        }
    }

    // Method for in-order traversal of the BST
    private ArrayList<Integer> inOrder(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        // Traverse the tree iteratively
        while (root != null || !stack.isEmpty()) {
            // Go to the leftmost node
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            // Visit the node
            root = stack.pop();
            res.add(root.data);
            // Traverse to the right child
            root = root.right;
        }
        return res;
    }

    public static void main(String[] args) {
        InorderTraversalOfBinarySearchTree tree = new InorderTraversalOfBinarySearchTree();
        // Inserting nodes into the BST
        tree.insert(3);
        tree.insert(1);
        tree.insert(4);
        tree.insert(2);
        tree.insert(5);
        // Performing in-order traversal
        ArrayList<Integer> res = tree.inOrder(tree.root);
        System.out.println(res); // Output should be in sorted order
    }
}
