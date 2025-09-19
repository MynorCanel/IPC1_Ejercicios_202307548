/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad7;

/**
 *
 * @author mynor
 */
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Actividad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Libro> Libros = new ArrayList<>(); //Se crea el array
        Libro libro1 = new Libro("Como Programar en Java", "Deitel & Deitel",2008); //Se definen los objetos libro
        Libro libro2 = new Libro("Don quijote de la Mancha", "Miguel de Cervantes Saavedra",1605);
        Libro libro3 = new Libro("Moby Dick", "Herman Melville",1851);
        Libros.add(libro1); //Se agregan los objetos al array
        Libros.add(libro2);
        Libros.add(libro3);
         try{ //Serealizar el array
            FileOutputStream archivo = new FileOutputStream("Libros.ser");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(Libros);
            System.out.println("Lista serializada Correctamente");
        }catch (IOException e){
            System.out.println("el error es: "+ e.toString());
        }
        try{
            FileInputStream archivoD = new FileInputStream ("Libros.ser"); 
            ObjectInputStream entrada = new ObjectInputStream(archivoD);
            ArrayList<Libro> Libros2 = (ArrayList<Libro>) entrada.readObject(); //Se crea un nuevo array donde se guardaran los datos deserealizados
            for (Libro libro : Libros2) { //Se imprime el array
            System.out.println(libro);
            }

        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }   
    
}
