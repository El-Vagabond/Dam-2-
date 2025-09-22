package PSPRR;

import java.io.InputStream;

public class procesos {

    public static void main(String[] args) {
        //Listamos el comando que usar en el cmd
        String cmd = "dir ";
        try {
            //Creamos el proceso
            Process exec = new ProcessBuilder("CMD", "/C", cmd).start();
            //Abrimos el canal de lectura
            InputStream i = exec.getInputStream();
            int num = 0;
            //Leemos la salida del proceso  
           num=i.read();
            while (num  != -1) {
                // Mostramos la salida por consola
                System.out.print((char) num);
                //Leemos el siguiente byte y lo mostramos hasta que acabe el bucle
                num = i.read();
            }
            //Cerramos el canal
            int valorExit = 0;
            //Esperamos a que el proceso termine
            valorExit = exec.waitFor();
            if (valorExit != 0) {
                //Mostramos el error por consola
                System.out.println("Programa no finalizado correctamente" + valorExit);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
}