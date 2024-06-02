package JAVA_COLLECTION_FRAMEWORK;

import java.util.TreeSet;

class TREESETOVERVIEW {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("For");
        treeSet.add("Geeks");
        treeSet.add("Very helpful");
        treeSet.add("Is");
        for (String s : treeSet) {
            System.out.println(s);


        }
    }
}
