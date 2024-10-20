package HEAP;

public class ArrayRepresentationOfBinarySearchTreeUnderHeap {
    Integer[] tree = new Integer[1000];  // Initial tree size
    int currentSize = 0;  // Track current number of elements
    int size = tree.length;  // Current array size

    // Method to insert a value into the binary search tree
    private void insert(int val) {
        if (currentSize == size) {
            resize();
        }

        int i = 0;
        // Traverse the tree to find the correct insertion point
        while (i < size) {
            if (tree[i] == null) {
                tree[i] = val;
                currentSize++;
                return;
            }

            // Move to the left child if the value is smaller
            if (val < tree[i]) {
                i = 2 * i + 1;
            }
            // Move to the right child if the value is greater
            else if (val > tree[i]) {
                i = 2 * i + 2;
            }
            // If the value is equal, don't insert (avoid duplicates in BST)
            else {
                return;
            }

            // Resize if the index is about to exceed current size
            if (i >= size) {
                resize();
            }
        }
    }

    // Method to resize the tree array
    private void resize() {
        Integer[] resizedTree = new Integer[size * 2];  // Double the size
        System.arraycopy(tree, 0, resizedTree, 0, size);  // Copy only 'size' elements
        tree = resizedTree;
        size = tree.length;  // Update size after resizing
    }

    // Method to print the tree using in-order traversal
    private void print() {
        inOrderTraversal(0);
    }

    // In-order traversal of the tree
    private void inOrderTraversal(int ind) {
        // Base case: if the current node is null or out of bounds, return
        if (ind >= size || tree[ind] == null)
            return;

        // Traverse the left subtree (2 * ind + 1)
        inOrderTraversal(2 * ind + 1);

        // Visit the current node
        System.out.println(tree[ind] + " ");

        // Traverse the right subtree (2 * ind + 2)
        inOrderTraversal(2 * ind + 2);
    }

    public static void main(String[] args) {
        ArrayRepresentationOfBinarySearchTreeUnderHeap tree = new ArrayRepresentationOfBinarySearchTreeUnderHeap();

        // Insert values from 0 to 100
        for (int i = 0; i <= 100; ++i) {
            tree.insert(i);
        }

        // Print the tree using in-order traversal
        tree.print();
    }
}
