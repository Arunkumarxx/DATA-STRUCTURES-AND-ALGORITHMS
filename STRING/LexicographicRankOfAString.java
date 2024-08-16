package STRING;

import java.util.Iterator;
import java.util.TreeSet;

public class LexicographicRankOfAString {
    static TreeSet<String> treeSet =new TreeSet<>();
    public static void main(String[] args) {
        String str ="abc";
        treeSet.clear();
        permutations(str,"");
        int k=1;
        Iterator<String> itr =treeSet.iterator();
        System.out.println(treeSet);
        while(itr.hasNext())
        {
            if(itr.next().equals(str))
            {
                treeSet.clear();
                System.out.println(k%1000000007);
                break;
            }
            ++k;
        }
    }
    private static void permutations(String str,String prefix){
        if(str.length()==0)
            treeSet.add(prefix);
        else {
            for (int i = 0; i < str.length(); ++i) {
                String string = str.substring(0, i) + str.substring(i + 1);
                permutations(string,prefix+str.charAt(i));
            }
        }
    }
}
