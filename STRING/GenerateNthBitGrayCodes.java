package STRING;

class GenerateNthBitGrayCodes {
    static String bianryString = "";

    static void BinaryToGrayCode(String binary) {
        String grayCode = "";
        grayCode += binary.charAt(0);
        for (int i = 0; i < binary.length() - 1; i++) {
//            grayCode+=(binary.charAt(i)^binary.charAt(i+1));
            grayCode += (binary.charAt(i) ^ binary.charAt(i + 1));
        }
        System.out.println(grayCode);
    }

    static void AddAndPrint(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            bianryString += String.valueOf(arr[i]);
//            System.out.print(arr[i]+"");
        }
        BinaryToGrayCode(bianryString);
//       String code= BinaryToGrayCode(bianryString);
//        System.out.print(code+" ");
        bianryString = "";
//        System.out.print(" ");
    }

    static void ZeroToNAllPossibleBinaryString(int n, int[] arr, int i) {
        if (i == n) {
            AddAndPrint(n, arr);
            return;
        }
        arr[i] = 0;
        ZeroToNAllPossibleBinaryString(n, arr, i + 1);
        arr[i] = 1;
        ZeroToNAllPossibleBinaryString(n, arr, i + 1);
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr = new int[n];
        ZeroToNAllPossibleBinaryString(n, arr, 0);

    }
}
