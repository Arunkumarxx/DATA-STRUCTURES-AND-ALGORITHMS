package TREE;

import java.util.*;

public class VerticalOrderPrintElementsInBinaryTree {
    class Tree {
        int data;
        Tree left, right;
        Tree(int value) {
            this.data = value;
            left = right = null;
        }
    }
    private int leftMin = 0;
    private int rightMax = 0;
    private HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();

    public ArrayList<Integer> verticalOrder(Tree root) {
        leftMin = 0;
        rightMax = 0;
        hashMap.clear();
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            Tree node = curr.node;
            int x_axis = curr.x_axis;
            if (x_axis < leftMin)
                leftMin = x_axis;
            if (x_axis > rightMax)
                rightMax = x_axis;
            if (node.left != null)
                queue.add(new Pair(node.left, x_axis - 1));
            if (node.right != null)
                queue.add(new Pair(node.right, x_axis + 1));
            hashMap.computeIfAbsent(x_axis, k -> new ArrayList<>()).add(node.data);
        }
        for (int i = leftMin; i <= rightMax; ++i) {
            ArrayList<Integer> temp = hashMap.get(i);
            if (temp != null) {
                ans.addAll(temp);
            }
        }
        return ans;
    }

    class Pair {
        Tree node;
        int x_axis;
        Pair(Tree node, int axis) {
            this.x_axis = axis;
            this.node = node;
        }
    }

    public static void main(String[] args) {
        VerticalOrderPrintElementsInBinaryTree tree = new VerticalOrderPrintElementsInBinaryTree();
        Tree root = tree.new Tree(1);
        root.left = tree.new Tree(2);
        root.right = tree.new Tree(3);
        root.left.left = tree.new Tree(4);
        root.left.right = tree.new Tree(5);
        root.right.left = tree.new Tree(6);

        ArrayList<Integer> result = tree.verticalOrder(root);
        System.out.println("Vertical Order: " + result);
    }
}
