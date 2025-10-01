/**
 * Paquete que contiene la clase principal para el filtrado de líneas de texto.
 */
package filtraLineas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * La clase {@code filtraLineas} lee líneas de texto desde la entrada estándar
 * y muestra únicamente aquellas que tienen una longitud igual o superior a un mínimo definido.
 * <p>
 * Este programa está diseñado para funcionar como parte de una cadena de procesamiento,
 * recibiendo texto desde otro proceso (por ejemplo, {@code lectorTexto}) y filtrando
 * las líneas según su número de caracteres.
 * </p>
 *
 * <p><strong>Uso típico:</strong></p>
 * <pre>{@code
 * java -jar lectorTexto.jar | java -jar filtraLineas.jar
 * }</pre>
 *
 * @author Pablo Segura González
 */
public class filtraLineas {

    /**
     * Método principal que inicia la lectura desde la entrada estándar y filtra las líneas
     * que cumplen con el mínimo de caracteres especificado.
     *
     * @param args No se utilizan argumentos en esta implementación.
     */
    public static void main(String[] args) {
        int minCaracteres = 20;

        try {
            String linea = "";
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Lectura línea por línea desde la entrada estándar
            while ((linea = br.readLine()) != null) {
                // Imprime solo las líneas que cumplen con el mínimo de caracteres
                if (linea.length() >= minCaracteres) {
                    System.out.println(linea);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
