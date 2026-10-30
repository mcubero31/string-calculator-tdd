package org.example;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.startsWith("//")) {
            int headerEnd = numbers.indexOf('\n');
            String delimiter = numbers.substring(2, headerEnd);
            String body = numbers.substring(headerEnd + 1);
            return sum(body, delimiter);
        }
        return sum(numbers, ",");
    }

    private int sum(String numbers, String delimiter) {
        return Arrays.stream(numbers.split(Pattern.quote(delimiter)))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
