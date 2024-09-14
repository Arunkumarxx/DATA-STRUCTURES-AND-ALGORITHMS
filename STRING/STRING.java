package STRING;
class  STRING {
    private static boolean [] seen =new boolean [52];
    String removeDuplicates(String str) {
        int n=str.length();
        StringBuilder res =new StringBuilder();
        for(int i=0; i<n;++i)
        {
            char c=str.charAt(i);
            if(c>='a') {
                if(seen[c-'a']==false)
                    res.append(c);
                seen[c-'a']=true;
            }
            else if(c<='Z')
            {
                if(seen[c-'A'+26]==false)
                    res.append(c);
                seen[c-'A'+26]=true;
            }

        }
        seen =new boolean[52];
        return res.toString();
    }
    public static void main(String[] args) {
        STRING obj =new STRING();
        System.out.println(obj.removeDuplicates("geekforgeeks"));
        System.out.println(obj.removeDuplicates("gee"));
    }
}