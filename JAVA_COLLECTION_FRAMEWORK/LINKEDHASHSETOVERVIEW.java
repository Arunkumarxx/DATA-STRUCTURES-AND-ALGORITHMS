package JAVA_COLLECTION_FRAMEWORK;

import java.util.LinkedHashSet;

class LINKEDHASHSETOVERVIEW {
    public static void main(String[] args) {
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("Geeks");
        stringLinkedHashSet.add("For ");
        stringLinkedHashSet.add("Is ");
        stringLinkedHashSet.add("Very helpful");
        stringLinkedHashSet.forEach(System.out::println);

    }
}