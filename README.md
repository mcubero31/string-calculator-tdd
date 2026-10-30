# String Calculator TDD

Práctica de suma de números mediante ciclos RED → GREEN → REFACTOR.

## Herramientas

Java 27 (versión instalada), Maven 3.9.8, JUnit 5 y Git. Se conserva el código inicial de IntelliJ.

## Iteraciones

1. Comas: `add("1,2,3") = 6` y `add("3,4,20,1,2") = 30`.
2. Cabecera `//delimitador\n`: `add("//;\n1;2;3") = 6` y
   `add("//::\n3::4::20::1::2") = 30`. Conserva la suma con comas.

## Estructura y ejecución

- `src/main/java/org/example/StringCalculator.java`: calculadora.
- `src/test/java/org/example/StringCalculatorTest.java`: pruebas independientes.
- `pom.xml`: compilación y dependencias.
- `TDD.md`: resultados reales de cada fase.

Ejecutar `mvn test`; para verificar desde cero, `mvn clean test`.

## Metodología

RED añade pruebas y verifica su fallo por comportamiento pendiente. GREEN implementa
lo necesario para pasarlas. REFACTOR mejora la estructura manteniendo las pruebas verdes.
Cada fase se ejecuta y registra antes de su commit, precedida por un commit de preparación.

Verificación final realizada: `mvn clean test`, **4 pruebas correctas**, sin fallos,
errores ni pruebas omitidas. Los resultados de RED y de cada fase posterior están en `TDD.md`.
