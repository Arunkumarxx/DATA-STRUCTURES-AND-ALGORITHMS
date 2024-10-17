package TREE;

public class VerticalOrderPrintElementsInBinaryTree {
    static ArrayList <Integer> verticalOrder(Node Root)
    {
        int leftMin=0;
        int rightMax=0;
        HashMap<Integer,ArrayList<Integer>> hashMap = new HashMap();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        Queue<Pair> queue =new LinkedList<Pair>();
        queue.add(new Pair(Root,0));
        while(!queue.isEmpty())
        {
            Pair curr= queue.poll();
            Node root = curr.root;
            int x_axis= curr.x_axis;

            if(x_axis<leftMin)
                leftMin=x_axis;

            if(x_axis>rightMax)
                rightMax=x_axis;

            if(root.left!=null)
                queue.add(new Pair(root.left,x_axis-1));

            if(root.right!=null)
                queue.add(new Pair(root.right,x_axis+1));

            if(hashMap.containsKey(x_axis))
                hashMap.get(x_axis).add(root.data);

            else
            {
                ArrayList<Integer> res =new ArrayList<Integer>();
                res.add(root.data);
                hashMap.put(x_axis,res);
            }
        }
        while(leftMin<=rightMax)
        {
            ArrayList<Integer> temp =hashMap.get(leftMin);
            for(Integer x:temp)
                ans.add(x);
            ++leftMin;
        }
        return ans;

    }
    static class Pair
    {
        Node root;
        int x_axis;
        Pair(Node root,int axis)
        {
            this.x_axis=axis;
            this.root=root;
        }
    }
}
