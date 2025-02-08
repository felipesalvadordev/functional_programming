package org.example;

import java.util.function.Function;

public class CurryingImpl {
    //Currying is a mathematical technique of converting a function that takes multiple
    //arguments into a sequence of functions that take a single argument.
    public static void test(){
        Function<Integer, Function<Integer, Integer> > curryMultiply = u -> v -> u * v;
        // Calling Curried Function for Multiplying u & v
        System.out.println("Multiply 2, 3 :" + curryMultiply.apply(2).apply(3));
    }
}
