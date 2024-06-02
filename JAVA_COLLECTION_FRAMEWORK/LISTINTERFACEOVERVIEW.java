package JAVA_COLLECTION_FRAMEWORK;

import java.util.Set;
import java.util.TreeSet;

class LISTINTERFACEOVERVIEW {
    public static void main(String[] args) {
        Set<Integer> integerListInterface = new TreeSet<>();// red black tree\
        integerListInterface.add(12);
        for (Integer integer : integerListInterface) {
            int result = integer.intValue();
            System.out.println(result);
        }
    }
}
/*
The api has basic set of interfaces like collection,set ,list map all the classes array list linked list vector etc that implements vector have some common
recuces programming effort programmer dones't have to woory about the desgin of collection but reather than he can focus on its best use in his programming . therefore the basic concept of object orineted programming
abstraction has been succcessfully implemented
increases programm speed and quality
of code which desrdves more than anything of the code which is more than any other
 */
// TODO: 24-11-2023