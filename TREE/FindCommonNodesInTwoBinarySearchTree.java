package TREE;

public class FindCommonNodesInTwoBinarySearchTree {

    public static void main(String[] args) {

    }

}
static HashMap<Integer,Integer> freq = new HashMap();

public static ArrayList<Integer> findCommon(Node root1,Node root2)
{
    freq.clear();
    preOrderTraversal(root1);
    ArrayList<Integer> result =new ArrayList<Integer>();
    preOrderTraversal(root2,result);
    Collections.sort(result);
    return result;
}
private static void preOrderTraversal(Node root)
{
    if(root==null)
        return;
    freq.put(root.data,1);
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);
}
private static void preOrderTraversal(Node root,ArrayList<Integer> result)
{
    if(root==null)
        return;
    if(freq.containsKey(root.data))
        result.add(root.data);
    preOrderTraversal(root.left,result);
    preOrderTraversal(root.right,result);
}