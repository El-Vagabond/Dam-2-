package PSPRR.EjerciciosPDFT1;

public class ejercicio5 {

    public class hilo extends Thread {
        private int inicio, fin;

        public hilo(int inicio, int fin) {
            this.inicio = inicio;
            this.fin = fin;
        }

        @Override
        public void run() {
            for (int i = inicio - 1; i <= fin; i++) {
                System.out.println("Solo contará desde " + inicio + " hasta el numero " + fin + ": " + i);
                // Creamos una pausa de 500ms
                try {
                    Thread.sleep(1000);
                    System.out.println("Pausa del hilo" + this.getName());
                    Thread.sleep(1000);
                    System.out.println("Pausa del hilo" + this.getName());
                } catch (InterruptedException e) {
                    System.out.println("Error en la pausa: " + e.getMessage());
                }
            }
        }

    }

    // Creamos 3 hilos que cuenten hasta 5, 10 y 15
    public static void main(String[] args) {
        hilo hilo1 = new ejercicio5().new hilo(1, 5);
        hilo hilo2 = new ejercicio5().new hilo(6, 10);
        hilo hilo3 = new ejercicio5().new hilo(11, 15);
        // Iniciamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        // Esperamos a que los hilos terminen
        try {
            Thread.sleep(500);
            System.out.println("He realizado una pausa en el hilo principal");
        } catch (InterruptedException e) {
            System.out.println("Error en la pausa: " + e.getMessage());

        }

    }

}
