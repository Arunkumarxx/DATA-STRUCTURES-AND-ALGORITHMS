package BIT_WISE;

import java.util.HashSet;

public class TwoOddOccuring {
    static void TwoOdd(int[] arr) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                integerHashSet.add(arr[i]);
                System.out.print(arr[i] + " ");
            }
        }


        integerHashSet.forEach(x -> System.out.print(x + " "));
    }

    static void method() {

    }

    static void TwoOddUsingBit(int[] arr) {
        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            temp ^= arr[i];
        }
        System.out.println(temp);
    }

    static void TwoOdds(int[] arr) {
        int n = arr.length;
        int x = arr[0];
        for (int i = 1; i < n; i++) {
            x ^= arr[i];
        }
        int k = 0;
        k = (x & (~(x - 1)));//right most bit set
        int res1 = 0, res2 = 0;
        for (int i = 0; i < n; i++) {
            if ((k & arr[i]) != 0)
                res1 = res1 ^ arr[i];

            else res2 ^= arr[i];
        }
        System.out.println(res1 + " " + res2);
    }

    public static void main(String[] args) {
//                  1,2,2,3,3,4,4,5
        int[] arr = {7, 7, 7, 2, 4, 2, 6, 6};
        TwoOdds(arr);
        //5 0000000000000101
        //6 0000000000000110
        //3 0000000000000011

    }
}
