package PSPRR.EjerciciosPDFT1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicioping2 {
    public static void main(String[] args) {
        try {
            // comando que se va a ejecutar en el cmd
            ProcessBuilder builder = new ProcessBuilder("ping", "-n", "3", "google.com");
            // Iniciamos el proceso
            Process proceso = builder.start();
            // Esperamos a que el proceso termine y guardamos el valor de salida
            int codigoSalida = proceso.waitFor();
    
            try (BufferedReader mensaje = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
                    BufferedReader error = new BufferedReader(new InputStreamReader(proceso.getErrorStream()))) {
                String linea;
                System.out.println("Salida del proceso:");
                while ((linea = mensaje.readLine()) != null) {
                    System.out.println(linea);
                }
                System.out.println("Errores del proceso (si los hay):");
                while ((linea = error.readLine()) != null) {
                    System.out.println(linea);
                }

            }

            System.out.println("Proceso terminado con código: " + codigoSalida);
            // Comprobamos si el proceso se ha ejecutado correctamente
            if (codigoSalida == 0) {
                System.out.println("El proceso se ejecutó correctamente");
            } else {
                System.out.println("El proceso terminó con errores");
            }
            // Capturamos las excepciones
        } catch (IOException ex) {
            System.out.println("Error al crear el proceso: " + ex.getMessage());
        } catch (InterruptedException ex) {
            System.out.println("El proceso fue interrumpido: " + ex.getMessage());
        }

        System.out.println("\n Programa terminado");
    }

}
