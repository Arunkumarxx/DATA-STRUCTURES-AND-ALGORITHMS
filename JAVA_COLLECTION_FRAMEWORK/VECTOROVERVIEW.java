package JAVA_COLLECTION_FRAMEWORK;

import java.util.Vector;

class VECTOROVERVIEW {
    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>();
        for (int i = 1; i <= 5; i++) {
            integerVector.add(i);
        }
        System.out.println(integerVector);
        integerVector.remove(3);
        System.out.println(integerVector);
        for (int tem : integerVector) {
            System.out.print(tem + " ");

        }
    }
}

