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
        for(int i=-1; i<n;)
        {
            do {
                ++i;
            }
            while(str.charAt(i)<='9' && str.charAt(i)>='0');
            {
                stringBuilder.append(str.charAt(i));

            }
            arrayList.add(Integer.parseInt(stringBuilder.toString()));
            stringBuilder.setLength(0);
        }
        return 0;
    }
}
