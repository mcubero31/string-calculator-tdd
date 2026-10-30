package org.example;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) {
        String delimiter = ",";
        if (numbers.startsWith("//")) {
            int headerEnd = numbers.indexOf('\n');
            delimiter = numbers.substring(2, headerEnd);
            numbers = numbers.substring(headerEnd + 1);
        }
        return Arrays.stream(numbers.split(Pattern.quote(delimiter)))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
