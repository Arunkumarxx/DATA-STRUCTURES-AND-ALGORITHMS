package RECURSION;

import java.util.ArrayList;

public class PossibleWordsFromPhoneDigits {
    static String keypad [] ={" "," ","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

    static ArrayList<String> StorePossibleWords(String str, String ans, ArrayList<String> stringL) {

        if ( str.length()==0){

            stringL.add(ans);

            return stringL;
        }
        String key = keypad[str.charAt(0)-48];

        for(int i=0; i<key.length(); i++)
            StorePossibleWords( str.substring(1) ,ans+key.charAt(i) ,stringL);
        return stringL;
    }
    static ArrayList <String> possibleWords(int a[], int N)
    {
        String str="";
        for(int temp:a)
            str+=temp+"";
        ArrayList<String> ArrayList= new ArrayList();
        ArrayList=StorePossibleWords(str,"",new ArrayList<>());
        return ArrayList;
    }

    public static void main(String[] args) {
        int arr[]  = {2345};
        int n= arr.length;
        System.out.println(possibleWords(arr,n));
    }
}