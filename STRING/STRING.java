package STRING;
class  STRING {
    private static boolean [] freq =new boolean [52];
    String removeDuplicates(String str) {
        int n=str.length();
        StringBuilder res =new StringBuilder();
        for(int i=0; i<n;++i)
        {
            char c=str.charAt(i);
            if(c>='a') {
                if(freq[c-'a']==false)
                    res.append(c);
                freq[c-'a']=true;
            }
            else if(c<='Z')
            {
                if(freq[c-'A'+26]==false)
                    res.append(c);
                freq[c-'A'+26]=true;
            }

        }
        return res.toString();
    }
    public static void main(String[] args) {

    }
}