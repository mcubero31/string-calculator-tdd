# Registro TDD

Los resultados se incorporan después de ejecutar cada fase, antes de su commit.

Preparación: `mvn test`, BUILD SUCCESS, 0 pruebas.

## Iteración 1 — RED

`mvn test`: 2 pruebas, 2 fallos de aserción, 0 errores. Se esperaban 6 y 30;
el código mínimo devolvió 0. BUILD FAILURE, salida 1.

## Iteración 1 — GREEN

`mvn test`: 2 pruebas, 0 fallos, 0 errores. BUILD SUCCESS, salida 0.
Se implementa la suma mediante separación por comas y acumulación.

## Iteración 1 — REFACTOR

Se sustituye el acumulador mutable por una secuencia de conversión y suma.
`mvn test`: 2 pruebas, 0 fallos, 0 errores. BUILD SUCCESS, salida 0.

## Iteración 2 — RED

`mvn test`: 4 pruebas, 0 fallos de aserción, 2 errores `NumberFormatException`.
Los dos casos de comas pasan; los dos nuevos fallan porque todavía se interpreta
la cabecera como un número. BUILD FAILURE, salida 1.

## Iteración 2 — GREEN

Se extraen la cabecera y el cuerpo y se usa `Pattern.quote` para el delimitador literal.
`mvn test`: 4 pruebas, 0 fallos, 0 errores. BUILD SUCCESS, salida 0.

## Iteración 2 — REFACTOR

`add` interpreta la cabecera y delega en `sum`, que separa, convierte y suma.
Se evita reasignar los parámetros y se comparte el cálculo entre ambos formatos.
`mvn test`: 4 pruebas, 0 fallos, 0 errores. BUILD SUCCESS, salida 0.

## Verificación final

`mvn clean test`: 4 pruebas, 0 fallos, 0 errores, 0 omitidas. BUILD SUCCESS, salida 0.
Entorno real: OpenJDK 27.0.1.0.3, Maven 3.9.8, JUnit 5.11.4, Surefire 3.5.2.
Maven muestra avisos sobre APIs internas en Java 27; no impiden compilar ni ejecutar las pruebas.
