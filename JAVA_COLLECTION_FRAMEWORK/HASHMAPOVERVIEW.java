package JAVA_COLLECTION_FRAMEWORK;

import java.util.HashMap;

class HASHMAPOVERVIEW {
    public static void main(String[] args) {
        HashMap<Integer, String> integerHashMap = new HashMap();
        integerHashMap.put(1, "Geeks");
        integerHashMap.put(3, "For");
        integerHashMap.put(2, "Geeks");
        System.out.println("Value for 1 is " + integerHashMap.get(1));
        integerHashMap.forEach((x, y) -> System.out.println(x + " " + y));
        System.out.println();
    }
}
