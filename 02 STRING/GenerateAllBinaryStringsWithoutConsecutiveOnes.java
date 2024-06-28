package STRING;

public class GenerateAllBinaryStringsWithoutConsecutiveOnes {
    static String toString(char[] chars) {
        String str = new String(chars);
        return str;
    }

    static void Recursion(char[] charsArray, int k, int trace) {
        if (trace == k) {
            System.out.print(toString(charsArray) + " ");
            return;
        }
        if (charsArray[trace - 1] == '0') {
            charsArray[trace] = '0';
            Recursion(charsArray, k, trace + 1);
            charsArray[trace] = '1';
            Recursion(charsArray, k, trace + 1);
        }
        if (charsArray[trace - 1] == '1') {
            charsArray[trace] = '0';
            Recursion(charsArray, k, trace + 1);
        }

    }

    static void funcaller(int k) {
        if (k <= 0) {

        }
        char[] charsArray = new char[k];
        charsArray[0] = '0';
        Recursion(charsArray, k, 1);
        charsArray[0] = '1';
        Recursion(charsArray, k, 1);

    }

    static void RecursionTwo(String word, int k) {
        if (word.length() == k) {
            System.out.print(word + " ");
        } else if (word.charAt(word.length() - 1) == '1') {
            RecursionTwo(word + '0', k);
        } else {
            RecursionTwo(word + '0', k);
            RecursionTwo(word + '1', k);
        }

    }

    static void funCallerTwo(int k) {
        String wordZero = "";
        wordZero += '0';
        RecursionTwo(wordZero, k);
        String wordOne = "";
        wordOne += '1';
        RecursionTwo(wordOne, k);
    }

    public static void main(String[] args) {
        int k = 3;
//        funcaller(k);
        funCallerTwo(k);
    }
}

