package TREE;

public class CeilingValueInBinarySearchTree {
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        if(root.left==null && root.right==null && root.data==key)
            return root.data;
        Node curr=root;
        int minCeil=Integer.MAX_VALUE;
        while(curr!=null)
        {
            if(curr.data==key)
                return curr.data;
            if(curr.data>key)
            {
                minCeil=Math.min(minCeil,curr.data);
                curr=curr.left;
            }
            else if(curr.data<key)
                curr=curr.right;
        }
        return minCeil==Integer.MAX_VALUE?-1:minCeil;
    }
    public static void main(String[] args) {

    }
}
