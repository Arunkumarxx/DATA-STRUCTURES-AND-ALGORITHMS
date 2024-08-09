package STRING;

import java.util.ArrayList;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        String str ="1abc23a10";
        System.out.println(findSum(str));
    }
    private static long findSum(String str)
    {
        int n=str.length();
        int sum=0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<n; ++i)
        {
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9')
                stringBuilder.append(ch);
            else {
                if(stringBuilder.length()>0) {
                    sum += Integer.parseInt(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
            }
        }
        if(stringBuilder.length()>0)
            sum+=Integer.parseInt(stringBuilder.toString());
        return sum;
    }
}
