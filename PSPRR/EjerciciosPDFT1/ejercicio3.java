package PSPRR.EjerciciosPDFT1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ejercicio3 {

    public static void main(String[] args) throws IOException {
        //Pedimos dos numeros por teclado que usaremos en el comando de powershell
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Indica el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Indica el segundo numero");
        int num2 = teclado.nextInt();
        //Ejecutamos el comando de powershell para sumar los dos numeros
        try {
            //Comando para
            String resultado = num1 + "+" + num2;
            ProcessBuilder calcu = new ProcessBuilder("powershell.exe", "-Command", resultado);
            Process proceso = calcu.start();
            BufferedReader lector = new BufferedReader(
                    new InputStreamReader(proceso.getInputStream()));

            String resupower = lector.readLine();
            lector.close();

            int codigoSalida = proceso.waitFor();

            System.out.println("Proceso terminado con código: " + codigoSalida);
            // Comprobamos si el proceso se ha ejecutado correctamente
            if (codigoSalida == 0) {
                System.out.println("La suma de "+num1+"+"+num2+" es: "+resupower);
                System.out.println("El proceso se ejecutó correctamente");
            } else {
                System.out.println("El proceso terminó con errores");
            }
        } catch (IOException ex) {
            System.out.println("Error al crear el proceso: " + ex.getMessage());
        } catch (InterruptedException ex) {
            System.out.println("El proceso fue interrumpido: " + ex.getMessage());
        }
        teclado.close();
        System.out.println("\n Programa terminado");

    }
}
