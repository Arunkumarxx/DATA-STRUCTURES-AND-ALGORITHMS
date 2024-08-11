package STRING;

public class AnagramSearch {
    public static void main(String[] args) {
        String str ="abc";
        String patt ="bac";
        int PatternHashCode=patt.hashCode();
        if(str.hashCode()==PatternHashCode)
            System.out.println("%b");
    }
}
