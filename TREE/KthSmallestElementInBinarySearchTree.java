package TREE;

public class KthSmallestElementInBinarySearchTree {
    private Tree root;

    private class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            this.left=this.right=null;
        }
    }

    private void insert(int key) {
        if(root==null) {
            root=new Tree(key);
            return;
        }
        Tree curr=root;
        Tree parent=null;
        while(curr!=null) {
            parent=curr;
            if(key<curr.data)
                curr=curr.left;
            else if(key>curr.data)
                curr=curr.right;
            else return;
        }
        if(parent!=null&&key<parent.data)
            parent.left=new Tree(key);
        else if(parent!=null&&key>parent.data)
            parent.right=new Tree(key);
    }

    public int kthSmallest(Tree root,int k) {
        inOrderTraversal(root,k);
        return ans;
    }

    int ans=-1;
    int count=0;

    private void inOrderTraversal(Tree root,int k) {
        if(root==null)
            return;
        inOrderTraversal(root.left,k);
        ++count;
        if(count==k) {
            ans=root.data;
            return;
        }
        inOrderTraversal(root.right,k);
    }

    public static void main(String[] args) {
        KthSmallestElementInBinarySearchTree tree=new KthSmallestElementInBinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);

        int k=3;
        System.out.println("The "+k+"rd smallest element is: "+tree.kthSmallest(tree.root,k));
    }
}
