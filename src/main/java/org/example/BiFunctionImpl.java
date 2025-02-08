package org.example;

import java.util.function.BiFunction;

public class BiFunctionImpl {

    public static void test() {

        System.out.println("Bifunction example");
        // BiFunction to add 2 numbers
        BiFunction<Integer, Integer, Integer> add = Integer::sum;

        // Implement add using apply()
        System.out.println("Sum 2+3 = " + add.apply(2, 3));

        // BiFunction to multiply 2 numbers
        // T: denotes the type of the first argument to the function
        // U: denotes the type of the second argument to the function
        // R: denotes the return type of the function
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Implement add using apply()
        System.out.println("Multiply 2*3 = " + multiply.apply(2, 3));
    }
}
