package TREE;

public class ConvertLevelOrderTraversalToBinarySearchTree {

    public static void main(String[] args) {

    }

}

class GFG
{
    class NodeRange {
        Node node;
        int min,max;
        NodeRange(Node node,int min,int max) {
            this.node=node;
            this.min=min;
            this.max=max;
        }
    }
    public Node constructBST(int[] arr)
    {
        if(arr.length==0) return null;
        Node root=new Node(arr[0]);
        Queue<NodeRange> queue=new LinkedList<>();
        queue.add(new NodeRange(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        int i=1;
        while(!queue.isEmpty()&&i<arr.length) {
            NodeRange curr=queue.poll();
            if(i<arr.length&&arr[i]>curr.min&&arr[i]<curr.node.data) {
                curr.node.left=new Node(arr[i]);
                queue.add(new NodeRange(curr.node.left,curr.min,curr.node.data));
                i++;
            }
            if(i<arr.length&&arr[i]>curr.node.data&&arr[i]<curr.max) {
                curr.node.right=new Node(arr[i]);
                queue.add(new NodeRange(curr.node.right,curr.node.data,curr.max));
                i++;
            }
        }
        return root;
    }
}