package TREE;

public class TREE <Secure> {
    private Secure data ;
    TREE(Secure d)
    {
     this.data=d;
    }
    public static void main(String[] args) {
        TREE<Integer> tree =new TREE<String>("s");
        System.out.println(tree.data);
    }

}
