package PSPRR.EjerciciosPDFT1;

import java.io.IOException;

public class ejercicio4 {

    public static void main(String[] args) {
        try {
            // Comando que se va a ejecutar en el cmd
            System.out.println("Lanzando procesos...");
            //Creamos los tres procesos de ping y la multiplicacion
            ProcessBuilder builder1 = new ProcessBuilder("ping", "-n", "6", "google.com");
            ProcessBuilder builder2 = new ProcessBuilder("ping", "-n", "4", "uniovi.es");
            ProcessBuilder builder3 = new ProcessBuilder("powershell", "-Command", "4000 * 12000");
                //Iniciamos los procesos
            Process proceso1 = builder1.start();
            Process proceso2 = builder2.start();
            Process proceso3 = builder3.start();
            //Mostramos por consola que estamos esperando a que termine el proceso
            System.out.println("Proceso 1: Ping a Google (6 veces)");
            System.out.println("Proceso 2: Ping a Uniovi (4 veces)");
            System.out.println("Proceso 3: 4000 * 12000");
            System.out.println();

            // Esperamos a que terminen los procesos
            proceso1.waitFor();
            proceso2.waitFor();
            proceso3.waitFor();
            // Monitoreamos el estado de los procesos cada 2 segundos
            System.out.println("Monitoreando procesos cada 2 segundos...");
            //Creamos una variable para controlar si hay procesos vivos
            boolean hayProcesosVivos = true;
            //Mientras haya procesos vivos seguimos el bucle
            while (hayProcesosVivos) {
                //Esperamos 2 segundos
                Thread.sleep(2000);
                //Comprobamos si los procesos siguen vivos
                boolean vivo1 = proceso1.isAlive();
                boolean vivo2 = proceso2.isAlive();
                boolean vivo3 = proceso3.isAlive();
                //Mostramos el estado de los procesos por consola   
                System.out.println("Estado de los procesos:");
                System.out.println("   Proceso 1: " + (vivo1 ? "EJECUTÁNDOSE" : "TERMINADO"));
                System.out.println("   Proceso 2:  " + (vivo2 ? "EJECUTÁNDOSE" : "TERMINADO"));
                System.out.println("   Proceso 3:  " + (vivo3 ? "EJECUTÁNDOSE" : "TERMINADO"));
                System.out.println();
                //Si los tres procesos han terminado, salimos del bucle
                if (!vivo1 && !vivo2 && !vivo3) {
                    hayProcesosVivos = false;
                    System.out.println("¡Todos los procesos han terminado!");
                }
            }
            //Mostramos los códigos de salida de los procesos
            System.out.println("----------------------------------------");
            System.out.println("Códigos de salida:");
            System.out.println("   Proceso 1: " + proceso1.exitValue());
            System.out.println("   Proceso 2: " + proceso2.exitValue());
            System.out.println("   Proceso 3: " + proceso3.exitValue());
            System.out.println("----------------------------------------");
            // Capturamos las excepciones
        } catch (IOException e) {
            System.out.println("Error al crear procesos: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Monitoreo interrumpido: " + e.getMessage());
        }
        // Mensaje de fin de programa
        System.out.println("\n Programa terminado");
    }
}
