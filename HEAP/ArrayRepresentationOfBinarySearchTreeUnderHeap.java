package HEAP;

public class ArrayRepresentationOfBinarySearchTreeUnderHeap {
    Integer[] tree = new Integer[100];  // Initial tree size
    int currentSize = 0;  // Track the current number of inserted elements
    int size = tree.length;  // Current size of the array

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
            if (val < tree[i]) {
                i = 2 * i + 1;
            } else if (val > tree[i]) {
                i = 2 * i + 2;
            } else {
                return;  // Avoid duplicates
            }

            if (i >= size) {
                resize();
            }
        }
    }

    // Resizing the array by increasing its size by 3x
    private void resize() {
        int newSize = size * 3;  // Triple the current size
        Integer[] resizedTree = new Integer[newSize];
        System.arraycopy(tree, 0, resizedTree, 0, size);  // Copy old elements to the new array
        tree = resizedTree;
        size = tree.length;  // Update the size variable
        System.out.println("Resized tree to size: " + size);
    }

    // Method to print the tree using in-order traversal
    private void print() {
        inOrderTraversal(0);
    }

    // In-order traversal of the tree
    private void inOrderTraversal(int ind) {
        if (ind >= size || tree[ind] == null)
            return;
        inOrderTraversal(2 * ind + 1);
        System.out.println(tree[ind] + " ");
        inOrderTraversal(2 * ind + 2);
    }

    public static void main(String[] args) {
        ArrayRepresentationOfBinarySearchTreeUnderHeap tree = new ArrayRepresentationOfBinarySearchTreeUnderHeap();

        // Insert values into the tree
        for (int i = 0; i <= 100; ++i)
            tree.insert(i);

        // Print the tree using in-order traversal
        tree.print();
    }
}
