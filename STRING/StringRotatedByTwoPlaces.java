package STRING;

public class StringRotatedByTwoPlaces {
    public static void main(String[] args) {
        String s1 = "amazon";
        String s2 = "azonam";
        StringBuilder stringBuilder =new StringBuilder(s1);
        stringBuilder.delete(0,1);
        System.out.println(stringBuilder);
    }
}
