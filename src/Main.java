package src;

/**
 * Clase principal mínima para demostrar el uso de Calculadora.
 */
public class Main {

    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();

        System.out.println("--- Ejecución mínima de la Calculadora ---");

        // Suma de ejemplo
        int resultadoSuma = miCalculadora.suma(20, 10);
        System.out.println("Resultado de Suma (20 + 10): " + resultadoSuma);

        // Resta de ejemplo
        int resultadoResta = miCalculadora.resta(20, 10);
        System.out.println("Resultado de Resta (20 - 10): " + resultadoResta);
    }
}
