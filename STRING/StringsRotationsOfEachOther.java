package STRING;

public class StringsRotationsOfEachOther {
    public static void main(String[] args) {
        String str1 ="geeksforgeeks";
        String str2 ="forgeeksgeeks";
        int unit=5;
        StringBuilder reversed =new StringBuilder();
        for(int i=unit;i<str1.length(); ++i)
            reversed.append(str1.charAt(i));
        for(int i=0; i<unit; ++i)
            reversed.append(str1.charAt(i));

        String res=reversed.toString();
        System.out.println(res==reversed);
    }
}
