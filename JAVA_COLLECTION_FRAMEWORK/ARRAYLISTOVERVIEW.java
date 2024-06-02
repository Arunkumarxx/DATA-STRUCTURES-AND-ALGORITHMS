package JAVA_COLLECTION_FRAMEWORK;

import java.util.ArrayList;

class ARRAYLISTOVERVIEW {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            integerArrayList.add(i);
        }
        System.out.println(integerArrayList);
        integerArrayList.removeIf(x -> x == 4);
        System.out.println(integerArrayList);
        for (int temp : integerArrayList) {
            System.out.print(temp + " ");
        }
        System.out.println("\n");
    }
}
