package TREE;

public class PairSumInBinarySearchTree {

    public static void main(String[] args) {

    }

}
static List<Integer> ele =new ArrayList();
static boolean findPair(Node root, int target)
{
    ele.clear();
    inOrderTraversal(root);
    int start=0 ,end =ele.size()-1;
    while(start<end)
    {
        int sum=ele.get(start)+ele.get(end);
        if(sum==target)
            return true;
        else if(sum<target)
            ++start;
        else end--;
    }
    return false;
}
static void inOrderTraversal(Node root)
{
    if(root==null)
        return;
    inOrderTraversal(root.left);
    ele.add(root.data);
    inOrderTraversal(root.right);
}