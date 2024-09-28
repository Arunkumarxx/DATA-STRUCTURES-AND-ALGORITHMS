package TREE;

public class ZigZagTreeTraversal {
    
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
