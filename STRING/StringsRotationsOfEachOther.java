package STRING;

public class StringsRotationsOfEachOther {
    public static void main(String[] args) {
        String str1 ="geeksforgeeks";
        String str2 ="forgeeksgeeks";
        long time1s = System.nanoTime();
        String rotated  =str1+str1;
        int j=0;
        int count=0;
        for(int i=0; i<rotated.length(); ++i)
        {
            if(j==str2.length()) break;
            if(rotated.charAt(i)==str2.charAt(j))
            {
                ++count;
                ++j;
            }
        }
        if(count==str2.length())
            System.out.println("true");;
        System.out.println("false");
        long time1e = System.nanoTime();
        System.out.println((time1e-time1s)/1_000_000.0+"ms");
    }
    private static boolean areRotations (String s1,String s2) {

    }
}
