package STRING;

import java.util.LinkedList;

class FindIThIndexCharacterInABinaryStringObtainedAfterNIterations {
    static LinkedList<String> StringArrayList = new LinkedList<>();

    static void BinaryToDecimal(int n) {
        if (n == 0) {
            StringArrayList.add("0");
            return;
        }
        if (n == 1) {
            StringArrayList.add("1");
            return;
        }
        BinaryToDecimal(n / 2);
        StringArrayList.add(String.valueOf(n % 2));
    }

    static void Iteration(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String tempOne : StringArrayList) {
                stringBuilder.append(tempOne.equals("0") ? "01" : "10");
            }
            StringArrayList.clear();
            for (char tempTwo : stringBuilder.toString().toCharArray()) {
                StringArrayList.add(String.valueOf(tempTwo));

            }
        }
    }
    public static void main(String[] args) {
        int m = 5;
        int n = 2;
        int i = 3;
        BinaryToDecimal(m);
        Iteration(n);
        String str = "";
        for (Object temp : StringArrayList) {
            str += (temp.toString());
        }
        System.out.println(str.charAt(i));

    }
}
