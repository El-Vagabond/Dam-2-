package PSPRR;

import java.io.InputStream;

public class procesos {

    public static void main(String[] args) {

        String cmd = "dir /s";
        try {
            Process exec = new ProcessBuilder("CMD", "/C", cmd).start();
            InputStream i = exec.getInputStream();
            int num = 0;
           num=i.read();
            while (num  != -1) {
                System.out.print((char) num);
                num = i.read();
            }
            int valorExit = 0;
            valorExit = exec.waitFor();
            if (valorExit != 0) {
                System.out.println("Programa no finalizado correctamente" + valorExit);
            }
        } catch (Exception ex) {

        }

    }
}