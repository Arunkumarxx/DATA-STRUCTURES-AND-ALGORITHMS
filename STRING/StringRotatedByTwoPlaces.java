package STRING;

public class StringRotatedByTwoPlaces {
    public static void main(String[] args) {
        String s1 = "amazon";
        String s2 = "azonam";
        StringBuilder stringBuilder =new StringBuilder(s1);
        stringBuilder.delete(1,2);
        System.out.println(stringBuilder);
    }
}
