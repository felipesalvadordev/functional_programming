package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateImpl {
    public static void test (){
        List<User> users = new ArrayList<>();
        users.add(new User("Ana", 18, "Brazil"));
        users.add(new User("Carlos", 30, "Portugal"));
        users.add(new User("Eva", 21, "Brazil"));
        users.add(new User("Miguel", 35, "Spain"));
        users.add(new User("Paula", 17, "Brazil"));

        Predicate<User> olderThant21 = p -> p.age >= 20;
        System.out.println("Number of users older than 20: " + users.stream().filter(olderThant21).count());

        BiPredicate<Integer, String> olderThant20FromBrazil = (age, country) -> age >= 20 && "Brazil".equals(country);
        System.out.println("Number of users older than 20 from Brazil: " +
                users.stream().filter(p -> olderThant20FromBrazil.test(p.age, p.country)).count());
    }

    public record User(String name, int age, String country) {
    }
}


