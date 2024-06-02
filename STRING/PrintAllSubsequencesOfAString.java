package STRING;

import java.util.Stack;
class PrintAllSubsequencesOfAString {
    static void PrintAllSubsequencesOfaString(String str, Stack<String> vec, int i, int n) {
        if (i == n) {
            vec.stream().forEach(x -> System.out.print(x));
            System.out.println();
            return;
        }
        vec.add(str.charAt(i) + "");
        PrintAllSubsequencesOfaString(str, vec, i + 1, n);
        vec.pop();
        PrintAllSubsequencesOfaString(str, vec, i + 1, n);
    }

    public static void main(String[] args) {
        String subSeqString = "abcd";
        int n = subSeqString.length();
        Stack<String> stringVector = new Stack<>();
        PrintAllSubsequencesOfaString(subSeqString, stringVector, 0, n);
    }
}


