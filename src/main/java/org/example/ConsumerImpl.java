package org.example;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerImpl {
    public static void test() {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);

        Consumer<Integer> consumer = (num) -> System.out.println("The number is " + num);

        for (Integer num : number) {
            consumer.accept(num);
        }
    }
}
