package STRING;

class ProgramToPrintAllSubstringsOfAGivenString {
    static void ProgramToPrintAllSubStringsOfAGivenString(String str) {
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j <= str.length() - 1; j++) {
                temp += str.charAt(j);
                System.out.println(temp);
            }
        }
    }
    public static void main(String[] args) {
        String string = "abcd";
        ProgramToPrintAllSubStringsOfAGivenString(string);
    }
}
