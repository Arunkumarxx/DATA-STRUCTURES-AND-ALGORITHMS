package STRING;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.stream.Stream;

class DifferentMethodsToReverseAString {
   static void  DifferentMethodsToReverseAString1(String s) {
       //brute force using reversal algorithm
       char[] arr = s.toCharArray();
       int start=0,end=s.length()-1;
       while (start <= end){
           char temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
       for (int i=0; i< arr.length; i++){
           System.out.print(arr[i]+"");
       }
   }
   static void  DifferentMethodsToReverseAString2(String s) {
       char []arr = s.toCharArray();
       for (int i= arr.length-1; i>=0; i--){
           System.out.print(arr[i]+"");
       }

    }
    public static void main(String[] args) {
       String str = "arun";
        DifferentMethodsToReverseAString2(str);
    }
}
