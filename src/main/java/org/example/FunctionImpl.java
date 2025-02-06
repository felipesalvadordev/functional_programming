package org.example;

import java.util.function.Function;

public class FunctionImpl {

    public static void test() {
        System.out.println("The length of the string: " + findLength());
    }

    public static int findLength() {
        Function<String, Integer> functionToFindLength = String::length;
        return functionToFindLength.apply("test");
    }
}
