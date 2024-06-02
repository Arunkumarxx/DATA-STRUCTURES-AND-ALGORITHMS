package STRING;

 class CheckIfAllBitsCanBeMadeSameBySingleFlip {
     public static void main(String[] args) {
         String str = "101";
         int ZeroCount = 0;
         int OnesCount = 0;
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i)=='0') {
                 ZeroCount++;
             } else if (str.charAt(i) == '1') {
                 OnesCount++;
             }
         }
         if ((ZeroCount == 1 | OnesCount == 1)) {
             System.out.println("Yes");
         } else System.out.println("No");
     }
}
