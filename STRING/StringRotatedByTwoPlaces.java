package STRING;

public class StringRotatedByTwoPlaces {
    public static void main(String[] args) {
        String s1 = "amazon";
        String s2 = "azonam";
        System.out.println(s1.charAt(0)==s2.charAt(s2.length()-2) &&( s1.charAt(1)==s2.charAt(s2.length()-1)));
        
    }
}
