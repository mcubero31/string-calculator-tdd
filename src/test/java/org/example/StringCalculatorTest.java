package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
    @Test
    void sumaConDelimitadorDeUnCaracter() {
        StringCalculator calculator = new StringCalculator();

        int result = calculator.add("//;\n1;2;3");

        assertEquals(6, result);
    }

    @Test
    void sumaConDelimitadorDeVariosCaracteres() {
        StringCalculator calculator = new StringCalculator();

        int result = calculator.add("//::\n3::4::20::1::2");

        assertEquals(30, result);
    }

    @Test
    void sumaTresNumerosSeparadosPorComas() {
        StringCalculator calculator = new StringCalculator();

        int result = calculator.add("1,2,3");

        assertEquals(6, result);
    }

    @Test
    void sumaCincoNumerosSeparadosPorComas() {
        StringCalculator calculator = new StringCalculator();

        int result = calculator.add("3,4,20,1,2");

        assertEquals(30, result);
    }
}
