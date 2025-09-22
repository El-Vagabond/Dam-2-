package PSPRR.ProcesosPorHilos;

public class EjecucionHilos2 {
    public static void main(String[] args) {
        Hilos2 hiloivan = new Hilos2();
        Thread t= new Thread(hiloivan);
        t.start();

       
        
        for(int i=0;i<100;i++){
            System.out.println("Fuera del Hilo:"+i);
        }

        Hilos2 hiloluis = new Hilos2();
        Thread l= new Thread(hiloluis);
        l.start();

         for(int i=0;i<100;i++){
            System.out.println("FH:"+i);
        }

         Hilos2 hiloloredo = new Hilos2();
        Thread lo= new Thread(hiloluis);
        lo.start();

         for(int i=0;i<100;i++){
            System.out.println("Fuera H:"+i);
        }

    }
}
