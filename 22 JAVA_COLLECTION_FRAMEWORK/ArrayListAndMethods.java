package JAVA_COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Spliterator;

class JavaArrayListExampleOne {
    JavaArrayListExampleOne() {
        int n = 5;
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2);
        ArrayList<Integer> integerArrayList1 = new ArrayList<>();
        System.out.println("Array 1 :" + integerArrayList);
        System.out.println("Array 2 :" + integerArrayList1);
        for (int i = 1; i <= n; i++) {
            integerArrayList.add(i);
            integerArrayList1.add(i);
        }
        System.out.println("Array 1 :" + integerArrayList);
        System.out.println("Array 2 :" + integerArrayList1);

    }
}

class ArrayListInJavaMethods {
    ArrayListInJavaMethods() {
        System.out.println();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList1 = new ArrayList<>();
        integerArrayList1.add(10);
        integerArrayList1.add(23);
        integerArrayList.add(0, 100);
        integerArrayList.add(2);
        integerArrayList.addAll(integerArrayList1);
        integerArrayList.addAll(3, integerArrayList1);
        System.out.println(integerArrayList);
        integerArrayList1.clear();
        ArrayList<Integer> integerArrayList2 = (ArrayList<Integer>) integerArrayList.clone();
        System.out.println(integerArrayList2);
        System.out.println(integerArrayList.containsAll(integerArrayList1));
        integerArrayList.clear();
        integerArrayList.ensureCapacity(3);
        integerArrayList.add(12);
        integerArrayList.add(2323);
        integerArrayList.forEach(System.out::println);
        System.out.println(integerArrayList.get(1));
        System.out.println(integerArrayList.indexOf(23232));
        System.out.println(integerArrayList.isEmpty());
        System.out.println(integerArrayList.lastIndexOf(12));
        ListIterator<Integer> integerListIterator = integerArrayList.listIterator();
        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next());
        }
        integerArrayList.remove((Object) 12);
        System.out.println(integerArrayList);
        integerArrayList.removeIf(x -> x == 2323);
        System.out.println(integerArrayList);
        integerArrayList.add(100);
        integerArrayList.add(200);
        integerArrayList.add(300);
        integerArrayList.add(400);
        System.out.println(integerArrayList);
        integerArrayList.set(0, 12);
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.size());
        ArrayList<Integer> integerArrayList3 = new ArrayList<>();
        integerArrayList3.add(232);
        integerArrayList3.add(2);
        integerArrayList3.add(2323);
        Spliterator<Integer> integerSpliterator = integerArrayList3.spliterator();
        integerSpliterator.forEachRemaining(System.out::println);
        System.out.println(integerSpliterator.getExactSizeIfKnown());
        integerArrayList.add(100);
        System.out.println(integerArrayList.subList(1, 2));
        System.out.println(integerArrayList.size());
        integerArrayList.trimToSize();
        System.out.println(integerArrayList);
        Collections.sort(integerArrayList);
        System.out.println(integerArrayList);
    }
}

class ArrayListAndMethods {
    public static void main(String[] args) {
        JavaArrayListExampleOne javaArrayListExampleOne = new JavaArrayListExampleOne();
        ArrayListInJavaMethods arrayListInJavaMethods = new ArrayListInJavaMethods();
    }
}