package TREE;

public class ZigZagTreeTraversal {
    private Tree root;
    private class Tree
    {
        int data;
        Tree left;
        Tree right;

        Tree(int value)
        {
            this.data=value;
            this.left=null;
            this.right=null;
        }
    }
    private void insert(int value)
    {
        root=addNode(root,value);;
    }
    private Tree addNode(Tree root ,int value)
    {
        if(root==null)
        {
            root=new Tree(value);
            return root;
        }
        if(value< root.data)
            root.left=addNode(root.left,value);
        if(value>root.data)
            root.right=addNode(root.right,value);
        return root;
    }
    private void print()
    {
        InOrderTraversal(root);
    }
    private void InOrderTraversal(Tree node)
    {
        if(node!=null)
        {
            InOrderTraversal(node.left);
            System.out.print(node.data+" ");
            InOrderTraversal(node.right);
        }
    }
    ArrayList<Integer> zigZagTraversal(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> res =new ArrayList();
        q.add(root);
        while(!q.isEmpty())
        {
            ArrayList<Integer> temp =new ArrayList<Integer>();
            int level=q.size();
            for(int i=0;i<level;++i)
            {
                Node curr=q.poll();temp.add(curr.data);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            res.add(temp);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < res.size(); i++) {
            ArrayList<Integer> level = res.get(i);
            if (i % 2 == 0)
                result.addAll(level);
            else
                for (int j = level.size() - 1; j >= 0; --j)
                    result.add(level.get(j));
        }
        return result;
    }


    public static void main(String[] args) {

    }

}
