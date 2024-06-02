package BIT_WISE;

public class OneOddOccurring {
    static void OddOccurring(int[] arr) {

        int count = 0;
        int n = arr.length;
        int i;
        for (i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;

            }
            if (count % 2 != 0) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

    static void Xor(int[] arr) {
        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            temp ^= arr[i];
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        OddOccurring(arr);
        Xor(arr);
        System.currentTimeMillis();
    }
}