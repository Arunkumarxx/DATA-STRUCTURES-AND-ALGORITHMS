package JAVA_COLLECTION_FRAMEWORK;

import java.util.*;
import java.util.stream.Collectors;

class mapMethod {
    static void map() {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List square =
                number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);

    }
}

class filterMethod {
    static void filter() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        List<Integer> integerList1 = integerList.stream().filter(x -> x > 2).collect(Collectors.toList());
        System.out.println(integerList1);
    }
}

class sortedMethod {
    static void sort() {
        List<Integer> integerList = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 10);
        List<Integer> integerList1 =
                integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(integerList1);
    }
}

class collectMethod {
    static void collect() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Set<Integer> integerSet =
                integerList.stream().map(x -> x * 10).collect(Collectors.toSet());
        Set<Integer> treeset = new TreeSet<>(integerSet);
        Iterator iterator = treeset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


        }
    }
}

class forEachMethod {
    static void foreach() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 4, 5, 6);
        integerList.stream().map(x -> x * x).forEach(System.out::println);
    }
}

class reduceMethod {
    static void reduce() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int result = integerList.stream().reduce(0, (x, y) -> x + y);
        System.out.println(result);
    }
}

class STREAMAPIOVERVIEW {
    public static void main(String[] args) {
        mapMethod.map();
        filterMethod.filter();
        sortedMethod.sort();
        collectMethod.collect();
        forEachMethod.foreach();
        reduceMethod.reduce();
    }
}

