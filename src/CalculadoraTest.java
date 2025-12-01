package src;

/**
 * Clase de prueba mínima para verificar la funcionalidad de Calculadora.
 * (Recordatorio: Ejecutar con -ea para activar 'assert': java -ea src.CalculadoraTest)
 */
public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Ejecutando pruebas mínimas...");

        // Prueba de Suma: 10 + 5 = 15
        int resultadoSuma = calculadora.suma(10, 5);
        assert resultadoSuma == 15 : "Error en suma(10, 5). Esperado 15."

        // Prueba de Resta: 10 - 5 = 5
        int resultadoResta = calculadora.resta(10, 5);
        assert resultadoResta == 5 : "Error en resta(10, 5). Esperado 5.";

        System.out.println("Pruebas finalizadas. Si no hay mensajes de error, las aserciones pasaron.");
    }
}
