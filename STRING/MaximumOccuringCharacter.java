package STRING;

import java.util.Arrays;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String str ="output";
        System.out.println(getMaxOccuringChar(str));
    }
    private static char getMaxOccuringChar(String str){
        int n=str.length();
        int [] arr  =new int[26];
        for(int i=0;i<n; ++i)
            arr[str.charAt(i)-'a']+=1;

        char maxFirstChar='a';
        int max=arr[0];
        for(int i=1; i< arr.length;++i)
        {
            if(arr[i]>max) {
                max = arr[i];
                maxFirstChar=(char)('a'+i);
            }
        }
        return maxFirstChar;
    }
}
