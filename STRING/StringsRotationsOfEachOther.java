package STRING;

public class StringsRotationsOfEachOther {
    public static void main(String[] args) {
        String str1 ="geeksforgeeks";
        String str2 ="forgeeksgeeks";





        
        long time1s = System.nanoTime();
        System.out.println(areRotations(str1,str2));
        long time1e = System.nanoTime();
        System.out.println((time1e-time1s)/1_000_000.0+"ms");
    }
    private static boolean areRotations (String s1,String s2) {
        String rotated  =s1+s1;
        int j=0;
        int count=0;
        for(int i=0; i<rotated.length(); ++i)
        {
            if(j==s2.length()) break;
            if(rotated.charAt(i)==s2.charAt(j))
            {
                ++count;
                ++j;
            }
        }
        if(count==s2.length())
            return true;
        return false;
    }
}
