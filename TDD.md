# Registro TDD

Los resultados se incorporan después de ejecutar cada fase, antes de su commit.

Preparación: `mvn test`, BUILD SUCCESS, 0 pruebas.

## Iteración 1 — RED

`mvn test`: 2 pruebas, 2 fallos de aserción, 0 errores. Se esperaban 6 y 30;
el código mínimo devolvió 0. BUILD FAILURE, salida 1.
