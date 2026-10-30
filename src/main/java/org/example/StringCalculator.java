package org.example;

import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) {
        return Arrays.stream(numbers.split(","))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
