package PSPRR.ProcesosPorHilos;

public class EjecucionHilos {
    public static void main(String[] args) {
        hilos hiloivan = new hilos();
        hiloivan.start();
        //hiloivan.run(); //Si usamos run() no se crea un hilo nuevo, se ejecuta en el mismo hilo principal
        for(int i=0;i<100;i++){
            System.out.println("Ejecucion de tarea fuera el hilo numero:"+i);
        }
        
    }
    
}
