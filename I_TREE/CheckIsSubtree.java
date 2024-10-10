package I_TREE;

public class CheckIsSubtree {
    private Tree root;
    private class Tree {
        int data;
        Tree left;
        Tree right;
        Tree(int value) {
            this.data=value;
            this.left=this.right=null;
        }
    }

    private void insert(int data) {
        root=addNode(root,data);
    }
    private Tree addNode(Tree root,int value) {
        if(root==null) {
            root=new Tree(value);
            return root;
        }
        if(value<root.data)
            root.left=addNode(root.left,value);
        else if(value>root.data)
            root.right=addNode(root.right,value);
        return root;
    }
    private void print() {
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Tree root) {
        if(root==null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    private static boolean isSubtree(Tree root1,Tree root2) {
        return treeTraversal(root1,root2);
    }
    private static boolean treeTraversal(Tree root1,Tree root2) {
        if(root1==null)
            return false;
        if(root1.data==root2.data)
            if(subTreeTraversal(root1,root2))
                return true;
        return treeTraversal(root1.left,root2)||treeTraversal(root1.right,root2);
    }

    private static boolean subTreeTraversal(Tree root1,Tree root2){
        if(root2==null)
            return true;
        if(root1==null||root1.data!=root2.data)
            return false;
        return subTreeTraversal(root1.left,root2.left)&&subTreeTraversal(root1.right,root2.right);
    }
    public static void main(String[] args) {
        CheckIsSubtree tree=new CheckIsSubtree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.print();

        CheckIsSubtree subtree=new CheckIsSubtree();
        subtree.insert(5);
        subtree.insert(3);
        subtree.insert(7);

        System.out.println("\nIs subtree: "+isSubtree(tree.root,subtree.root));
    }
}
