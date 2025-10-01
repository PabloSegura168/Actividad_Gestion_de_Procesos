/**
 * Paquete que contiene la clase principal para la lectura de archivos de texto.
 */
package lectorTexto;

import java.io.*;

/**
 * La clase {@code lectorTexto} lee el contenido de un archivo de texto línea por línea
 * y lo imprime.
 * <p>
 * Este programa está diseñado para ser usado en combinación con otros procesos
 * que puedan recibir su salida como entrada, por ejemplo, mediante tuberías.
 * </p>
 *
 * <p><strong>Uso típico:</strong></p>
 * <pre>{@code
 * java -jar lectorTexto.jar | java -jar filtraLineas.jar
 * }</pre>
 *
 * @author Pablo Segura González
 */
public class lectorTexto {

    /**
     * Método principal que inicia la lectura del archivo y escribe su contenido
     * en la salida estándar.
     *
     * @param args No se utilizan argumentos en esta implementación.
     * @throws FileNotFoundException Si el archivo especificado no se encuentra.
     */
    public static void main(String[] args) throws FileNotFoundException {

        // Archivo de entrada
        File archivo = new File("./ficheros/entrada.txt");

        // Lectores para leer el archivo línea por línea
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        // Escritores para enviar la salida al flujo estándar
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);

        try {
            String linea;

            // Lectura línea por línea y escritura en la salida estándar
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine(); // Añade salto de línea
            }

            // Asegura que todo el contenido se envíe
            bw.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
