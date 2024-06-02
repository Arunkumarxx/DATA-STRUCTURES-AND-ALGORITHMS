package ARRAYS;

import java.util.Scanner;

public class GeekAndNew {
    static boolean StringCheck(String str) {
        int n=str.length();
        boolean valid=true;

        for (int i=0; i<n; i++)
        {
            int x=str.charAt(i);
            if(x<64)
            {
                valid=false;
                break;
            }
            else valid=true;
        }
        return valid;
    }
    static boolean PasswordCheck(String str) {
        boolean numeric=false;
        boolean lowercase=false;
        boolean uppercase=false;

        for (int i=0; i<str.length(); i++)
        {
            int x=str.charAt(i);
            if(x>=48 && x<=57)
                numeric=true;
            if(x>=97 && x<=122)
                lowercase=true;
            if(x>=65 && x<=90)
                uppercase=true;
        }
        if(numeric==true && lowercase==true&& uppercase==true)
            return true;
        else return false;
    }
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int T=scan.nextInt();
        for (int i=0 ;i<T;i++)
        {
            String string =scan.next();
            if (PasswordCheck(string)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }

    }
}
