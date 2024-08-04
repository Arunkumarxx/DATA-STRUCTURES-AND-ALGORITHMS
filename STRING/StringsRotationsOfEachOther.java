package STRING;

public class StringsRotationsOfEachOther {
    public static void main(String[] args) {
        String str1 ="geeksforgeeks";
        String str2 ="forgeeksgeeks";
        System.out.println(areRotations(str1,str2));
    }
    private static boolean areRotations (String s1,String s2) {
        int cnt=0;
        int j=0;
        for(int i=0;i<rotated.length();i++){
            if(j==s2.length())break;
            if(rotated.charAt(i)==s2.charAt(j)){
                cnt++;
                j++;}
        }
        if(cnt==s2.length())return true;
        return false;
    }
}
