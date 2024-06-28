package STRING;

class SubStringAndSubSequence {
    static void SubString(String str) {
        int n=str.length();
        for (int i =0; i<n; i++){
            for (int j=i; j<n; j++){
                for (int k=i; k<=j; k++){
                    System.out.print(str.charAt(k));
                }
                if (i==n-1)
                    break;
                System.out.print(", ");

            }
            System.out.println();
        }
    }
    static void SubSequence(String str) {
        int n=str.length();
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                for (int k=i ;k<j; k++){

                }
            }
        }
    }
    public static void main(String[] args) {
        String str ="geeks";
        SubSequence(str);
    }
}
