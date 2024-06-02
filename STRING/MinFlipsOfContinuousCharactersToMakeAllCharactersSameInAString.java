package STRING;
 class MinFlipsOfContinuousCharactersToMakeAllCharactersSameInAString {
     public static void main(String[] args) {
         String binaryString = "10111";
         int ZerosCount = 0;
         int OnesCount = 0;
         for (int i = 0; i < binaryString.length(); i++) {
             if (i == binaryString.length() - 1) {
                 if (binaryString.charAt(i) == '1') {
                     OnesCount += 1;
                     break;
                 }
                 if (binaryString.charAt(i) == '0') {
                     ZerosCount += 0;
                     break;
                 }
             }
             if (binaryString.charAt(i) == '0' && binaryString.charAt(i + 1) == '1') {
                 ZerosCount += 1;
             }
             if (binaryString.charAt(i) == '1' && binaryString.charAt(i + 1) == '0') {
                 OnesCount += 1;
             }
         }
         System.out.println(Math.min(ZerosCount, OnesCount));
     }
}
