package STRING;

import java.util.Arrays;
import java.util.Collection;

class SortStringOfCharacters {
    static void sortString(char[] arr) {
        int charmax[]  =new int[26];
        int n= arr.length;
        for (char temp:arr){
            charmax[temp-'a']++;
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
     public static void main(String[] args) {
         String str ="bbccdefbbaa";
         char [] arr = str.toCharArray();
         Arrays.sort(arr);
         int n= arr.length;
         for (int i=0; i<n; i++){
             System.out.print(arr[i]+"");
         }
         System.out.println();
         sortString(arr);
     }
}
