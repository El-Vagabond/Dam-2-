package PSPRR.EjerciciosPDFT1;

import java.io.IOException;

public class ejercicioping {
 public static void main(String[] args) {
        try {
            //comando que se va a ejecutar en el cmd
            ProcessBuilder builder = new ProcessBuilder("ping", "-n", "3", "google.com");
            //Lo que mostramos por consola
            System.out.println("Lanzando proceso ping...");
            //Iniciamos el proceso
            Process proceso = builder.start();
            //Mostramos por consola que estamos esperando a que termine el proceso
            System.out.println("Esperando a que termine el proceso...");
            //Esperamos a que el proceso termine y guardamos el valor de salida
            int codigoSalida = proceso.waitFor();
            //Mostramos el valor de salida por consola
            System.out.println("Proceso terminado con código: " + codigoSalida);
            //Comprobamos si el proceso se ha ejecutado correctamente
            if (codigoSalida == 0) {
                System.out.println("El proceso se ejecutó correctamente");
            } else {
                System.out.println("El proceso terminó con errores");
            }
            //Capturamos las excepciones
        } catch (IOException ex) {
            System.out.println("Error al crear el proceso: " + ex.getMessage());
        } catch (InterruptedException ex) {
            System.out.println("El proceso fue interrumpido: " + ex.getMessage());
        }
        
        System.out.println("\n Programa terminado");
    }
    
}
