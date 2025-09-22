package PSPRR.ProcesosPorHilos;

public class hilos extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Ejecucion de tarea en el hilo numero:"+i);
        }
    }
    
}
