package I_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class CheckIfBothOfTreeAreSame {
    private Tree root1,root2;

    private class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            this.left=this.right=null;
        }
    }

    private void insert(Tree root,int value) {
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
   private boolean isIdentical(Tree root1,Tree root2) {
        if (root1==null&&root2==null)
            return true;
        if (root1==null||root2==null||root1.data!=root2.data)
            return false;

        return isIdentical(root1.left,root2.left)&&isIdentical(root1.right,root2.right);
    }

    public static void main(String[] args) {
        CheckIfBothOfTreeAreSame treeChecker=new CheckIfBothOfTreeAreSame();

        treeChecker.root1=treeChecker.new Tree(1);
        treeChecker.insert(treeChecker.root1,2);
        treeChecker.insert(treeChecker.root1,3);
        treeChecker.insert(treeChecker.root1,4);
        treeChecker.insert(treeChecker.root1,5);

        treeChecker.root2=treeChecker.new Tree(1);
        treeChecker.insert(treeChecker.root2,2);
        treeChecker.insert(treeChecker.root2,3);
        treeChecker.insert(treeChecker.root2,4);
        treeChecker.insert(treeChecker.root2,5);

        System.out.println("Are both trees identical "+treeChecker.isIdentical(treeChecker.root1,treeChecker.root2));
    }
}
