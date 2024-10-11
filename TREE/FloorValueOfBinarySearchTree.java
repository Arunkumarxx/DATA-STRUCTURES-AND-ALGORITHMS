package TREE;

public class FloorValueOfBinarySearchTree {
    int floor(Node root, int key) {
        // code here.
        int max=Integer.MIN_VALUE;
        Node curr=root;
        while(curr!=null)
        {
            if(curr.data==key)
                return curr.data;
            if(curr.data<key)
            {
                max=Math.max(curr.data,max);
                curr=curr.right;
            }
            else if(curr.data>key)
                curr=curr.left;
        }
        return  max==Integer.MIN_VALUE ?-1:max;
    }
    public static void main(String[] args) {

    }

}
