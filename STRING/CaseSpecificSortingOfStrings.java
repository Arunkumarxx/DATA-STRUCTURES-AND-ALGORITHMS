package STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class CaseSpecificSortingOfStrings {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            String[] words = br.readLine().split("\\s+");
            int numTestCases = Integer.parseInt(words[0]);

            for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
                words = br.readLine().split("\\s+");
                int size = Integer.parseInt(words[0]);
                String str = br.readLine();
                String sortedStr = new CaseSpecificSortingOfStrings().caseSort(str);
                out.println(sortedStr);
            }
            out.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    public    String caseSort(String str)
    {
        int n=str.length();
        ArrayList<Character> lowerCase =new ArrayList<>();
        ArrayList<Character> upperCase =new ArrayList<>();
        for(int i=0; i<n;++i)
            if(str.charAt(i)>=97)lowerCase.add(str.charAt(i));
            else upperCase.add(str.charAt(i));
        Collections.sort(lowerCase);
        Collections.sort(upperCase);
        int j=0 ,k=0;
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0; i<n; ++i)
            if(str.charAt(i)<97)
                stringBuilder.append(upperCase.get(j++));
            else stringBuilder.append(lowerCase.get(k++));
        String res=stringBuilder.toString();
        return res;
    }
}
