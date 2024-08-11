package STRING;

public class AnagramSearch {
    public static void main(String[] args) {
        String str ="bca";
        String patt ="bca";
        boolean x=str.hashCode()==patt.hashCode();
        System.out.println(x);
    }
}
