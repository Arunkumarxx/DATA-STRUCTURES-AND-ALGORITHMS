package STRING;

class PrintTheFrequencyOfEachCharacterInAlphabeticalOrder {
    static void printFrequencyInAlphabeticalOrder1(String str){
//        String str = "geeksforgeeks";

        for (char Char = 'a'; Char<='z'; Char++){
            int count=0;
            for (int i=0; i<str.length(); i++){
                if(Char == str.charAt(i)){
                    count++;
                }
            }if (count !=0)
                System.out.print(Char+""+count);
        }
    }
    static void printFrequencyInAlphabeticalOrder2(String str) {
        int []alphabeticalArr = new int [26];
        for (int i=0; i<str.length(); i++){
            alphabeticalArr[str.charAt(i)-'a']++;
        }
        for (int i=0; i<alphabeticalArr.length; i++){
            if (alphabeticalArr[i]==0){
                continue;
            }
            System.out.print((char)(i+'a')+""+ alphabeticalArr[i]);
        }
    }
    public static void main(String[] args) {
        String str = "aabbccccddd";
        printFrequencyInAlphabeticalOrder1(str);
        System.out.println();
        printFrequencyInAlphabeticalOrder2(str);

    }
}
