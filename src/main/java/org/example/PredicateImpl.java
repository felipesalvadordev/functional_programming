package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImpl {
    public static void test() {
        System.out.println("Predicate example");
        final List<User> users = Arrays.asList(
                new User("Test 1", Gender.MALE, 1000),
                new User("Test 2", Gender.MALE, 18000),
                new User("Test 3", Gender.FEMALE, 2400)
        );

        final Double sumLimitCardsMaleUsers = sumLimitCards(users, (User user)
                -> user.gender == Gender.MALE);
        final Double sumLimitCardsFemaleUsers = sumLimitCards(users, User::isFemale);

        System.out.println(sumLimitCardsMaleUsers);
        System.out.println(sumLimitCardsFemaleUsers);
    }

    public static Double sumLimitCards(List<User> users, Predicate<User> filter) {
        return users.parallelStream()
                .filter(filter)
                .mapToDouble((User user) -> user.cardLimit)
                .sum();
    }

    public enum Gender {MALE, FEMALE}

    public static class User {
        public final String name;
        public final Gender gender;
        public final Double cardLimit;

        public User(String name, Gender gender, double cardLimit) {
            this.name = name;
            this.gender = gender;
            this.cardLimit = cardLimit;
        }

        public static boolean isFemale(User user) {
            return user.gender == Gender.FEMALE;
        }
    }
}
