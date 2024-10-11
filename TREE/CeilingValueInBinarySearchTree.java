package TREE;

public class CeilingValueInBinarySearchTree {
    private Tree root;
    private class Tree {
        int data;
        Tree right,left;
        Tree(int value) {
            this.data=value;
            this.right=this.left=null;
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

    int findCeil(Tree root,int key) {
        if(root==null) return -1;
        if(root.left==null&&root.right==null&&root.data==key)
            return root.data;
        Tree curr=root;
        int minCeil=Integer.MAX_VALUE;
        while(curr!=null) {
            if(curr.data==key)
                return curr.data;
            if(curr.data>key) {
                minCeil=Math.min(minCeil,curr.data);
                curr=curr.left;
            } else if(curr.data<key)
                curr=curr.right;
        }
        return minCeil==Integer.MAX_VALUE?-1:minCeil;
    }

    public static void main(String[] args) {
        CeilingValueInBinarySearchTree tree=new CeilingValueInBinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);

        int key=6;
        System.out.println("Ceiling value of "+key+": "+tree.findCeil(tree.root,key));
    }
}
