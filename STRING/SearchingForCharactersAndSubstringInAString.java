package STRING;
class SearchingForCharactersAndSubstringInAString {
    public static void main(String[] args) {
        String str = "GeeksforGeeks is a computer science portal";
        System.out.println("first occurence of char 's' is found at :"+str.indexOf('s'));
        System.out.println("last occurence of char 's' is found at :"+str.lastIndexOf('s'));
        System.out.println("first occurence of char 's' after index 10 :"+str.indexOf('s',10));
        System.out.println("last occurence of char 's' after index 20 is :"+str.indexOf('s',20));
        System.out.println("charcter at location 20:"+str.charAt(2));
        //
        System.out.println();
        System.out.println("software".contains("s"));
        System.out.println("apple".startsWith("a"));
        System.out.println("apple".endsWith("e"));
    }
}
