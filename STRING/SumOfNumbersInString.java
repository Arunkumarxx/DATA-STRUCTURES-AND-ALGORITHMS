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
        int i=0,j=0;
        while(i<n-1)
        {
            if(str.charAt(i)<='9' && str.charAt(i)>='0')
            {
                while(str.charAt(i+1)>='0' && str.charAt(i+1)<='9')
                {
                    stringBuilder.append(str.charAt(i));
                    ++i;

                }

                arrayList.add(Integer.parseInt(stringBuilder.toString()));
                stringBuilder.setLength(1);

                if(!(str.charAt(i+1)>='0' && str.charAt(i+1)<='9'))
                {
                    arrayList.add(Integer.parseInt(String.valueOf(str.charAt(i))));
                    ++i;
                }
                else ++i;


            }
        }
        return 0;
    }
}
