package TREE;

public class MaximumWidthOfTree {

    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;
        Tree(int data)
        {
            this.data=data;
            this.left=right=null;
        }
    }

    private void insert(int value)
    {
        root=addNode(root,value);
    }
    private Tree addNode(Tree root,int data)
    {
        if(root==null)
        {
            root=new Tree(data);
            return root;
        }
        if(data<root.data)
            root.left=addNode(root.left,data);
        else if(data>root.data)
            root.right=addNode(root.right,data);
        return root;
    }
    private void print()
    {
        inOrderTraversal(root);
    }
    int getMaxWidth(Node root) {
        // Your code here
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int max=0;
        while(!queue.isEmpty())
        {
            int currLevelSize=queue.size();
            if(currLevelSize>max) max=currLevelSize;
            for(int i=0;i<currLevelSize;++i)
            {
                Node curr=queue.poll();
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }

        }
        return max;
    }
    private void inOrderTraversal(Tree root)
    {
        if(root==null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {

    }

}
