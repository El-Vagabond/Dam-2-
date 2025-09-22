package PSPRR;

import java.io.*;

public class DirFicheros {

    public static void main(String[] args) {
        //Listamos el comando que usar en el cmd
       String cmd ="dir ";
       try{
            //Creamos el proceso
              ProcessBuilder exec = new ProcessBuilder("CMD","/C",cmd);
            //Guardamos la salida y los errores en un fichero
              String rutaFichero ="C:\\Users\\ALUMNOS-FP\\Desktop\\Apuntes\\PSPRR\\Ficheros\\salida.txt";
              String rutaErrores ="C:\\Users\\ALUMNOS-FP\\Desktop\\Apuntes\\PSPRR\\Ficheros\\error.txt";
              //Redireccionamos la salida y los errores
              exec.redirectOutput(new File(rutaFichero));
              exec.redirectError(new File(rutaErrores));
              //Iniciamos el proceso
              exec.start();
       }catch(Exception ex){
        //Mostramos los errores por consola
        ex.printStackTrace();
           }
    }
    
}
