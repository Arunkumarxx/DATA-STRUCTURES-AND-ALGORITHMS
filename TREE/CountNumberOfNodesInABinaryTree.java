package I_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class CountNumberOfNodesInABinaryTree {
    private Tree root;

    private class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            this.left=this.right=null;
        }
    }

    private void insert(int value) {
        if (root==null) {
            root=new Tree(value);
            return;
        }
        Queue<Tree> q=new LinkedList<Tree>();
        q.add(root);
        while (!q.isEmpty()) {
            Tree curr=q.poll();
            if (curr.left==null) {
                curr.left=new Tree(value);
                return;
            } else {
                q.add(curr.left);
            }
            if (curr.right==null) {
                curr.right=new Tree(value);
                return;
            } else {
                q.add(curr.right);
            }
        }
    }

    public static int countNodes(Tree root) {
        Tree lnode=root;
        Tree rnode=root;
        int l=0;
        int r=0;
        while(lnode!=null) {
            ++l;
            lnode=lnode.left;
        }
        while(rnode!=null) {
            ++r;
            rnode=rnode.right;
        }
        int res=0;
        if(l!=r) {
            Queue<Tree> q =new LinkedList<Tree>();
            q.add(root);
            while(!q.isEmpty()) {
                int size=q.size();
                res+=size;
                for(int i=0;i<size;++i) {
                    Tree curr=q.poll();
                    if(curr.left!=null)
                        q.add(curr.left);
                    if(curr.right!=null)
                        q.add(curr.right);
                }
            }
        } else res=(int)Math.pow(2,l)-1;
        return res;
    }

    public static void main(String[] args) {
        CountNumberOfNodesInABinaryTree tree=new CountNumberOfNodesInABinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        System.out.println("Number of nodes in the tree: "+CountNumberOfNodesInABinaryTree.countNodes(tree.root));
    }
}
