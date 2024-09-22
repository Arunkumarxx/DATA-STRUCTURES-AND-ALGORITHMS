package TREE;

public class TREE <Secure> {
    private Secure data ;
    TREE(Secure d)
    {
     this.data=d;
    }
    public static void main(String[] args) {
        TREE tree =new TREE(1);
        System.out.println(tree.data);

    }

}
