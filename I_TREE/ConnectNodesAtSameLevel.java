package TREE;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel {
    Tree root;

    private class Tree {
        int data;
        Tree left, right;
        Tree(int data) {
            this.data=data;
            this.left=this.right=null;
        }
    }

    private void insert(int data) {
        if (root==null) {
            root=new Tree(data);
            return;
        }
        Queue<Tree> q=new LinkedList<Tree>();
        q.add(root);
        while (!q.isEmpty()) {
            Tree curr=q.poll();
            if (curr.left==null) {
                curr.left=new Tree(data);
                return;
            } else {
                q.add(curr.left);
            }
            if (curr.right==null) {
                curr.right=new Tree(data);
                return;
            } else {
                q.add(curr.right);
            }
        }
    }

    public void printLevelOrder() {
        if (root==null) return;
        Queue<Tree> q=new LinkedList<Tree>();
        q.add(root);
        while (!q.isEmpty()) {
            Tree curr=q.poll();
            System.out.print(curr.data+" ");
            if (curr.left!=null)
                q.add(curr.left);
            if (curr.right!=null)
                q.add(curr.right);
        }
    }

    public void connect(Tree root) {
        if(root == null) return;
        Queue<Tree> q = new LinkedList<Tree>();
        q.add(root);

        while(!q.isEmpty()) {
            Tree prev=null;
            int size = q.size();
            for(int i = 0; i < size; ++i) {
                Tree curr = q.poll();
                if(prev != null)
                    prev.right = curr;
                prev = curr;
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        ConnectNodesAtSameLevel tree = new ConnectNodesAtSameLevel();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.connect(tree.root);
        tree.printLevelOrder();
    }
}
