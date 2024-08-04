package STRING;

public class StringsRotationsOfEachOther {
    public static void main(String[] args) {
        String str1 ="geeksforgeeks";
        String str2 ="forgeeksgeeks";
        System.out.println(areRotations(str1,str2));
    }
    private static boolean areRotations (String s1,String s2) {
        if(s1.length() !=s2.length())
            return false;
        String rotated =s1+s1;
        int k=0;
        for(int i=0; i<rotated.length(); ++i)
        {
            
        }

        return false;
    }
}
