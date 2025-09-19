/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad7.pkg2;

/**
 *
 * @author mynor
 */
public class MensajeThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<3;i++) {
            System.out.println("Este es un mensaje desde un hilo");
            try {
                Thread.sleep(2000); //2 segundos
            } catch (InterruptedException e) {
                System.out.println("ERROR:El hilo fue interrumpido");
            }
        }
    }

    public static void main(String[] args) {
        MensajeThread hilo = new MensajeThread();
        hilo.start(); // Se inicia el hilo en main
    }
}

