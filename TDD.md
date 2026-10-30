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
