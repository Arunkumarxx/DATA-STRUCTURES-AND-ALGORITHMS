package TREE;

import java.util.*;

public class TopViewOfBinaryTree {
    private class Tree {
        int data;
        Tree left, right;
        Tree(int value) {
            this.data = value;
            left = right = null;
        }
    }
    private class Pair {
        Tree root;
        int x_axis;
        Pair(Tree root, int x_axis) {
            this.root = root;
            this.x_axis = x_axis;
        }
    }
    private HashMap<Integer, Integer> hashMap = new HashMap<>();

    public ArrayList<Integer> topView(Tree root) {
        System.gc();
        hashMap.clear();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int leftMin = 0;
        int rightMax = 0;
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            Tree Root = curr.root;
            int x_axis = curr.x_axis;
            if (x_axis < leftMin)
                leftMin = x_axis;
            if (x_axis > rightMax)
                rightMax = x_axis;
            if (!hashMap.containsKey(x_axis))
                hashMap.put(x_axis, Root.data);
            if (Root.left != null)
                q.add(new Pair(Root.left, x_axis - 1));
            if (Root.right != null)
                q.add(new Pair(Root.right, x_axis + 1));
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = leftMin; i <= rightMax; ++i) {
            result.add(hashMap.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        TopViewOfBinaryTree tree = new TopViewOfBinaryTree();
        Tree root = tree.new Tree(1);
        root.left = tree.new Tree(2);
        root.right = tree.new Tree(3);
        root.left.left = tree.new Tree(4);
        root.left.right = tree.new Tree(5);
        root.right.left = tree.new Tree(6);

        ArrayList<Integer> result = tree.topView(root);
        System.out.println("Top View: " + result);
    }
}
