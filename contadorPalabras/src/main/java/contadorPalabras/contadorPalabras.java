/**
 * Paquete que contiene la clase principal para el conteo de palabras en líneas de texto.
 */
package contadorPalabras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Esta clase {@code contadorPalabras} lee líneas de texto desde la entrada estándar
 * y cuenta el número total de palabras procesadas.
 * <p>
 * Este programa está diseñado para funcionar como parte de una cadena de procesamiento,
 * recibiendo texto desde otro proceso (por ejemplo, {@code lectorTexto}) y mostrando
 * cada línea junto con el número acumulado de palabras.
 * </p>
 *
 * <p><strong>Uso típico:</strong></p>
 * <pre>{@code
 * java -jar lectorTexto.jar | java -jar filtraLineas.jar | java -jar contadorPalabras.jar
 * }</pre>
 *
 * @author Pablo Segura González
 * @version 1.0
 */
public class contadorPalabras {

    /**
     * Método principal que inicia la lectura desde la entrada estándar y cuenta palabras.
     *
     * @param args No se utilizan argumentos en esta implementación.
     */
    public static void main(String[] args) {
        int contador = 0;

        try {
            String linea;
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Lectura línea por línea desde la entrada estándar
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    // Divide la línea en palabras usando espacios como separador
                    String[] palabras = linea.split("\\s+ ");
                    contador += palabras.length;
                }

                // Muestra la línea junto con el número acumulado de palabras
                System.out.println("Linea numero " + contador + " La linea es: " + linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
