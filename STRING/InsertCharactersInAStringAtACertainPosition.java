package STRING;

class InsertCharactersInAStringAtACertainPosition {
    static String  InsertCharInString1(String str,int [] arr) {
        //O(n^2)
        //O(n)
        int n=str.length();
        String ans="";
        for (int i =0; i<n; i++){
            String t="";
            for (int j=0;j<arr.length;j++){
                if (i==arr[j]) {
                    t = "*";
                    break;
                }
                if (i!=arr[j]){
                    t="";
                }
            }
            ans+=t+str.charAt(i);
        }
        return ans;
    }
    static void InsertCharInString2(String str,int []arr) {
//O(n)
//O(n)
       String ans="";
       int c=0;
       for (int i=0; i<str.length(); i++){
           if (c<arr.length && i==arr[c]){
               ans+="*";
               c++;
           }
           ans+=str.charAt(i);
       }
        for (int i =0; i<ans.length(); i++){
            System.out.print(ans.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int []arr ={1,5,7,9};
//       String ans= InsertCharInString1(str,arr);
//        System.out.println(ans);
       InsertCharInString2(str,arr);

    }
}
