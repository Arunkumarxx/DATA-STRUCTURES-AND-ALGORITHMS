package RECURSION;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.*;

public class PowerSetUsingRecursion {
    static String  call(String str) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<String> sortedArrayList =RecursionPowerSet(str,"",stringArrayList);
        Collections.sort(sortedArrayList);
        sortedArrayList.remove(0);
        String res = sortedArrayList.toString();
        return  res;
    }
    static ArrayList<String> RecursionPowerSet (String str,String ans,ArrayList<String>strings) {
        if (str.length()==0){
            strings.add(ans);
            return strings;
        }
        RecursionPowerSet(str.substring(1),ans+str.charAt(0),strings);
        RecursionPowerSet(str.substring(1),ans,strings);
        return strings;
    }
    public static void main(String[] args) {
        String s= "abc";
        System.out.println(call(s));

    }
}
