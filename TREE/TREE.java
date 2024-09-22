package TREE;

public class TREE <Secure> {
    private Secure data ;
    TREE(Secure  d ) {
        this.data = d;
    }
    public void setData(Secure  x)
    {
        this.data=x;
    }
    public static void main(String[] args) {
        TREE<Integer> tree =new TREE("s");
        System.out.println(tree.data);
        tree.setData(1023);
        System.out.println(tree.data);
    }
}
