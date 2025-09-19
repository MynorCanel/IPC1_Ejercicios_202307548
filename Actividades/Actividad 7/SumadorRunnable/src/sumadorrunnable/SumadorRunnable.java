/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadorrunnable;

/**
 *
 * @author mynor
 */

public class SumadorRunnable implements Runnable {
     @Override
    public void run() {
        int total; total=0;
        for (int i=1;i<11;i++){
            total=total+i;
            System.out.println("Sumando: " + i);
        try {
                Thread.sleep(500); //2 seg
            } catch (InterruptedException e) {
                System.out.println("ERROR:El hilo fue interrumpido");
            }
        }
        System.out.println("El total de la suma es: " + total);
    }
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SumadorRunnable sumador = new SumadorRunnable();
        Thread hilo = new Thread(sumador); //Se pasa la clase a hilo
        hilo.start(); // Inicia el hilo, ejecuta run()
    }
}

