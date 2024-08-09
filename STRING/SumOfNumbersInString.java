package STRING;

import java.util.ArrayList;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        String str ="1abc23";
        System.out.println(findSum(str));
    }
    private static long findSum(String str)
    {
        ArrayList<Integer> arrayList =new ArrayList<>();
        int n=str.length();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<n; ++i)
        {
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9')
                stringBuilder.append(ch);
            else {
                
                arrayList.add(Integer.parseInt(stringBuilder.toString()));
                stringBuilder.setLength(0);
            }
        }
        if(stringBuilder.length()>0)
            arrayList.add(Integer.parseInt(stringBuilder.toString()));
        System.out.println(arrayList);
        return 0;
    }
}
