package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SupplierImpl {
    private static final Map<String, Supplier<String>> registry = new HashMap<>();
    static {
        registerCar("sedan", () -> "Civic");
        registerCar("suv", () -> "Corolla Cross");
    }

    public static void test() {
        var sedanReturned = getCarNameByType("sedan");
        System.out.println(sedanReturned + " returned for sedan type");

        var suvReturned = getCarNameByType("suv");
        System.out.println(suvReturned + " returned for suv type");
    }

    public static void registerCar(String type, Supplier<String> supplier) {
        registry.put(type, supplier);
    }

    public static String getCarNameByType(String type) {
        Supplier<String> carSupplier = registry.get(type);
        if (carSupplier != null)
            return carSupplier.get();

        throw new IllegalArgumentException("");
    }
}
