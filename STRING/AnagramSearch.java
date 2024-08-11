package STRING;

public class AnagramSearch {
    public static void main(String[] args) {
        String str ="abc";
        String patt ="bca";
        System.out.println("%b",str.hashCode()==patt.hashCode());
    }
}
