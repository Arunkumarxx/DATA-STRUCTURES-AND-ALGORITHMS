package JAVA_COLLECTION_FRAMEWORK;

import java.util.Collections;
import java.util.Vector;

class VectorClassAndMethods extends Vector<Integer> {
    static Vector vector = new Vector();

    static void adding() {
        vector.add(1);
        vector.add(2);
        vector.add("geeks");
        vector.add("forgeeks");
        vector.add(3);
        System.out.println(vector);
    }

    static void setMethod() {
        vector.clear();
        vector.add(12);
        vector.add(23);
        vector.add(22);
        vector.add(10);
        vector.add(20);
        System.out.println("Vector :" + vector);
        vector.set(0, 20);
        System.out.println(vector);
    }

    static void removing() {
        vector.clear();
        vector.add(1);
        vector.add(2);
        vector.add("Geeks");
        vector.add("forGeeks");
        vector.add(4);
        vector.remove((Object) 2);
        System.out.println(vector);
    }

    static void addElement() {
        vector.addElement("welcome");
        System.out.println(vector);
        System.out.println(vector.capacity());
        String[] arr = new String[vector.size()];
        System.out.println(vector.size());
        vector.copyInto(arr);
        for (String str : arr) {
            System.out.println(str);
        }
        System.out.println(vector);
        Collections.replaceAll(vector, "welcome", "we");
        System.out.println(vector);
    }

    static void getMethod() {
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i));
        }
        for (Object i : vector) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        adding();
        setMethod();
        removing();
        getMethod();
        addElement();
    }
}
