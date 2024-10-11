package TREE;

public class FloorValueOfBinarySearchTree {
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

    int floor(Tree root,int key) {
        int max=Integer.MIN_VALUE;
        Tree curr=root;
        while(curr!=null) {
            if(curr.data==key)
                return curr.data;
            if(curr.data<key) {
                max=Math.max(curr.data,max);
                curr=curr.right;
            } else if(curr.data>key)
                curr=curr.left;
        }
        return max==Integer.MIN_VALUE?-1:max;
    }

    public static void main(String[] args) {
        FloorValueOfBinarySearchTree tree=new FloorValueOfBinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);

        int key=6;
        System.out.println("Floor value of "+key+": "+tree.floor(tree.root,key));
    }
}
