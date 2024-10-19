package TREE;

public class BottomViewOfBinaryTree {
    public ArrayList<Integer> bottomView(Tree root) {
        Queue<Pair> q=new LinkedList();
        HashMap<Integer,Integer> hashMap=new HashMap();
        q.add(new Pair(root,0));
        int leftMin=0;
        int rightMax=0;
        while(!q.isEmpty()) {
            Pair curr=q.poll();
            Tree currNode=curr.root;
            int x_axis=curr.x_axis;

            if(x_axis<leftMin)
                leftMin=x_axis;
            if(x_axis>rightMax)
                rightMax=x_axis;

            hashMap.put(x_axis,currNode.data);

            if(currNode.left!=null)
                q.add(new Pair(currNode.left,x_axis-1));
            if(currNode.right!=null)
                q.add(new Pair(currNode.right,x_axis+1));
        }
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=leftMin;i<=rightMax;++i)
            result.add(hashMap.get(i));
        return result;
    }

    class Pair {
        Tree root;
        int x_axis;
        Pair(Tree root,int x_axis) {
            this.root=root;
            this.x_axis=x_axis;
        }
    }

    class Tree {
        int data;
        Tree left,right;
        Tree(int value) {
            this.data=value;
            left=right=null;
        }
    }

    public static void main(String[] args) {

    }

}
