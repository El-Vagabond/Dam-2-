package PSPRR;

import java.io.InputStream;
import java.io.OutputStream;

public class CambiarFecha {

    public static void main(String[] args) {
        //Listamos el comando que usar en el cmd
        String cmd="date";
        try{
            //Creamos el proceso
            Process exec = new ProcessBuilder("CMD", "/C", cmd).start();
            //Abrimos el canal de escritura
            OutputStream prg = exec.getOutputStream();
            //Escribimos la nueva fecha
            String newDate ="20-03-2020";
            //Escribimos la nueva fecha en el proceso
            prg.write(newDate.getBytes());
            //Vaciamos el buffer
            prg.flush();
            
            //Abrimos el canal de lectura   
            InputStream i = exec.getInputStream();
            //Leemos la salida del proceso
            int num = 0;
            num=i.read();
            while (num  != -1) {
                // Mostramos la salida por consola
                System.out.print((char) num);
                //Leemos el siguiente byte y lo mostramos hasta que acabe el bucle
                num = i.read();
            }
            //Cerramos los canales
            i.close();
            prg.close();
            //Esperamos a que el proceso termine
            int valorExit = 0;
            //Guardamos el valor de salida
            valorExit = exec.waitFor();
            if (valorExit != 0) {
                //Mostramos el error por consola
                System.out.println("Programa no finalizado correctame ,valor de salida" + valorExit);
            }

        }catch(Exception ex){
            
            ex.printStackTrace();

        }
    
}}
