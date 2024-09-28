package TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class LevelOrderLineByLineTraversal {
    private Tree root;

    private class Tree {
        int data;
        Tree left,right;

        Tree(int data) {
            this.data=data;
            this.left=this.right=null;
        }
    }

    private void insert(int value) {
        root=addNode(root,value);
    }

    private Tree addNode(Tree root,int data) {
        if(root==null) {
            root=new Tree(data);
            return root;
        }
        if(data<root.data)
            root.left=addNode(root.left,data);
        else if(data>root.data)
            root.right=addNode(root.right,data);
        return root;
    }

    private void print() {
        InOrderTraversal(root);
    }

    private void InOrderTraversal(Tree root) {
        if(root==null)
            return;
        InOrderTraversal(root.left);
        System.out.print(root.data+" ");
        InOrderTraversal(root.right);
    }


    public ArrayList<ArrayList<Integer>> levelOrderLineByLineUsingQueue() {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(root==null) return res;

        Queue<Tree> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize=queue.size();
            ArrayList<Integer> currentLevel=new ArrayList<>();

            for(int i=0;i<levelSize;i++) {
                Tree currentNode=queue.poll();
                currentLevel.add(currentNode.data);

                if(currentNode.left!=null) {
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null) {
                    queue.add(currentNode.right);
                }
            }

            res.add(currentLevel);
        }
        return res;
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree=new LevelOrderTraversal();
        Random random=new Random();

        // Insert random values into the tree
        for(int i=0;i<10;++i) {
            tree.insert(random.nextInt(0,9));
        }

        // Iterative Level Order Traversal using Queue
        ArrayList<ArrayList<Integer>> queueOutput=tree.levelOrderUsingQueue();
        for(ArrayList<Integer> level:queueOutput) {
            for(Integer value:level) {
                System.out.print(value+" ");
            }
            System.out.println();  // Newline after each level
        }
    }
}
