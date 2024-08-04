package STRING;

public class StringsRotationsOfEachOther {
    public static void main(String[] args) {
        String str1 ="geeksforgeeks";
        String str2 ="forgeeksgeeks";
        int unit=5;
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=unit;i<str1.length(); ++i)
            stringBuilder.append(str1.charAt(i));
        for(int i=0; i<unit; ++i)
            stringBuilder.append(str1.charAt(i));
        String result=String.valueOf(stringBuilder);
        System.out.println(result==str2);
    }
}
