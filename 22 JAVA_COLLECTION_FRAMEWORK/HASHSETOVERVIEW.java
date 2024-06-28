package JAVA_COLLECTION_FRAMEWORK;

import java.util.HashSet;

class HASHSETOVERVIEW {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("arun ");
        stringHashSet.add("kumar");
        stringHashSet.add("T");
        stringHashSet.add("student");
        stringHashSet.add("student");
        stringHashSet.forEach(System.out::println);
    }
}
