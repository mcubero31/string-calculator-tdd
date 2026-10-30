package org.example;

public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;
        for (String number : numbers.split(",")) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
