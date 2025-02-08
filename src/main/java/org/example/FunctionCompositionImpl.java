package org.example;

import java.util.function.Function;

public class FunctionCompositionImpl {

    public static void test(){
        Function<Double, Double> discountPremium = price -> price * 0.8;
        Function<Double, String> showDiscountedPrice = price -> String.format("Discounted Price : %s ", price);

        //To apply the functions in the order they are defined, from left to right, use the andThen method
        Function<Double, String> getDiscountedPriceTagAndThenImpl = discountPremium.andThen(showDiscountedPrice);
        String discountedPrice = getDiscountedPriceTagAndThenImpl.apply(100.0);
        System.out.println(discountedPrice);

        //Use compose when you want to apply the functions in the opposite order
        Function<Double, String> getDiscountedPriceComposeImpl = showDiscountedPrice.compose(discountPremium);
        discountedPrice = getDiscountedPriceComposeImpl.apply(100.0);
        System.out.println(discountedPrice);
    }
}
