package STRING;

public class StringRotatedByTwoPlaces {
    public static void main(String[] args) {
        String s1 = "amazon";
        String s2 = "azonam";
        System.out.println(isRotatedByTwoPlaces(s1,s2));
    }
    private static boolean isRotatedByTwoPlaces(String s1,String s2) {
        StringBuilder stringBuilder =new StringBuilder(s1);
        stringBuilder.delete(0,2);
        stringBuilder.append(s1.charAt(0));
        stringBuilder.append(s1.charAt(1));
        if(stringBuilder.equals(s2))
            return true;
        System.out.println(stringBuilder);
        return false;
    }
}
