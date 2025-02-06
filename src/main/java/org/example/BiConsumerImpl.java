package org.example;

import java.util.function.BiConsumer;

public class BiConsumerImpl {
    public static void test() {
        BiConsumer<String, String> concatAndPrint = (str1, str2) -> {
            String result = str1 + " " + str2;
            System.out.println(result);
        };

        // Using the BiConsumer to concatenate and print two strings
        concatAndPrint.accept("Test", "123");
    }
}
