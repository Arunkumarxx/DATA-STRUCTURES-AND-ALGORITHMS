package TREE;

public class TopViewOfBinaryTree {
    public static void main(String[] args) {

    }
}

static HashMap <Integer,Integer> hashMap = new HashMap();

static ArrayList<Integer> topView(Node root) {
    System.gc();
    hashMap.clear();
    Queue<Pair> q =new LinkedList();
    q.add(new Pair(root,0));
    int leftMin=0;
    int rightMax=0;
    while(!q.isEmpty())
    {
        Pair curr=q.poll();
        Node Root=curr.root;
        int x_axis=curr.x_axis;

        if(x_axis<leftMin)
            leftMin=x_axis;

        if(x_axis>rightMax)
            rightMax=x_axis;

        if(!hashMap.containsKey(x_axis))
            hashMap.put(x_axis,Root.data);

        if(Root.left!=null)
            q.add(new Pair(Root.left,x_axis-1));
        if(Root.right!=null)
            q.add(new Pair(Root.right,x_axis+1));
    }
    ArrayList<Integer> result =new ArrayList<Integer>();
    for(int i=leftMin;i<=rightMax;++i)
    {
        result.add(hashMap.get(i));
    }
    return result;
}
static class Pair
{
    Node root;
    int x_axis;
    Pair(Node root,int x_axis)
    {
        this.root=root;
        this.x_axis=x_axis;
    }
}