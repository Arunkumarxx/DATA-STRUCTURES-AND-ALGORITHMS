package TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeABinaryTree {
    private TreeNode root;

    private class TreeNode {
        int data;
        TreeNode left,right;
        TreeNode(int value) {
            this.data=value;
            this.left=this.right=null;
        }
    }

    private ArrayList<Integer> serialize(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(root==null)
            return res;

        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);

        while(!q.isEmpty()) {
            TreeNode curr=q.poll();
            if(curr!=null) {
                res.add(curr.data);
                q.add(curr.left);
                q.add(curr.right);
            } else {
                res.add(null);
            }
        }
        return res;
    }

    private TreeNode deSerialize(ArrayList<Integer> A) {
        if(A.isEmpty()||A.get(0)==null)
            return null;

        TreeNode root=new TreeNode(A.get(0));
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);

        int index=1;
        while(!q.isEmpty()&&index<A.size()) {
            TreeNode curr=q.poll();

            if(index<A.size()&&A.get(index)!=null) {
                curr.left=new TreeNode(A.get(index));
                q.add(curr.left);
            }
            index++;

            if(index<A.size()&&A.get(index)!=null) {
                curr.right=new TreeNode(A.get(index));
                q.add(curr.right);
            }
            index++;
        }

        return root;
    }

    private void insert(int value) {
        if(root==null) {
            root=new TreeNode(value);
            return;
        }
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode curr=q.poll();
            if(curr.left==null) {
                curr.left=new TreeNode(value);
                return;
            } else {
                q.add(curr.left);
            }
            if(curr.right==null) {
                curr.right=new TreeNode(value);
                return;
            } else {
                q.add(curr.right);
            }
        }
    }

    private void printLevelOrder() {
        if(root==null) return;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        SerializeAndDeserializeABinaryTree tree=new SerializeAndDeserializeABinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        ArrayList<Integer> serialized=tree.serialize(tree.root);
        System.out.println("Serialized tree: "+serialized);

        TreeNode deserialized=tree.deSerialize(serialized);
        System.out.println("Deserialized tree: ");
        tree.root=deserialized;
        tree.printLevelOrder();
    }
}
