package TREE;

public class LowestCommonAncestorInABinarySearchTree {
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

   private Tree LCA(Tree root,int n1,int n2) {
        while(root!=null) {
            if(n1<root.data&&n2<root.data)
                root=root.left;
            else if(n1>root.data&&n2>root.data)
                root=root.right;
            else return root;
        }
        return null;
    }

    public static void main(String[] args) {
        LowestCommonAncestorInABinarySearchTree tree=new LowestCommonAncestorInABinarySearchTree();
        tree.insert(20);
        tree.insert(8);
        tree.insert(22);
        tree.insert(4);
        tree.insert(12);
        tree.insert(10);
        tree.insert(14);

        int n1=10,n2=14;
        Tree t=tree.LCA(tree.root,n1,n2);
        if(t!=null) System.out.println("LCA of "+n1+" and "+n2+" is "+t.data);
        else System.out.println("LCA does not exist");
    }
}
