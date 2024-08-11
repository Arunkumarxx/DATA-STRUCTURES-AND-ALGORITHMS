package STRING;

public class StringRotatedByTwoPlaces {
    public static void main(String[] args) {
        String s1 = "amazon";
        String s2 = "azonam";
        System.out.println(isRotatedByTwoPlaces(s1,s2));
    }
    private static boolean isRotatedByTwoPlaces(String s1,String s2) {
        String conditionOne = s1.substring(2)+s1.substring(0,2);
        String conditionTwo = s1.substring(s1.length()-2)+s1.substring(0,s1.length()-2);
        if(s2.equals(conditionOne) || s2.equals(conditionTwo))
            return true;
        return false;
    }
}
