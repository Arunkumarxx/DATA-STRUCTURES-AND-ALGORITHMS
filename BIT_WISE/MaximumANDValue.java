package BIT_WISE;

public class MaximumANDValue {
    static void MaximumANDValueCall(int[] n) {
        int value = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if ((n[i] != n[j])) {
                    if ((n[i] & n[j]) > value) {
                        value = (n[i] & n[j]);
                    }

                }
            }
        }
        System.out.println(value);
    }

    static int CheckBits(int[] arr, int setBit) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((setBit & arr[i]) == setBit) {
                count++;
            }
        }
        return count;
    }

    static void MaximumAndValueOfArrayElementsBitwise(int[] arr) {
        int setBit = 1;
        int value = 0;
        for (int bit = 31; bit >= 0; bit--) {
            setBit = (1 << bit) | value;
            int count = CheckBits(arr, setBit);
            if (count >= 2) {
                value |= setBit;

            }
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        int[] arr = {16, 9, 6, 13};
        MaximumAndValueOfArrayElementsBitwise(arr);
        /*
| Decimal | Binary   |
| 16      | 10000    |
| 9       | 01001    |
| 6       | 00110    |
| 13      | 01101    |
  9       | 01001
         */
    }
}