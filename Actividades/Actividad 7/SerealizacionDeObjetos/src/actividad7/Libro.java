/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad7;

/**
 *
 * @author mynor
 */
import java.io.Serializable;

public class Libro implements Serializable{
    private static final long serialVersionUID = 1L;
    private String titulo;
    private String autor;
    private int anio; //Año


    public Libro(String titulo,String autor, int anio) { //Constructor
       this.titulo=titulo;
       this.autor=autor;
       this.anio=anio;
    }
    
    public String getTitulo(){ //getters y setters (para modificar y poder leer los objetos)
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public String toString() { //Para poder leer el array deseralizado
        return "Libro[" +
                "titulo=" + titulo +
                ", autor=" + autor + 
                ", anio=" + anio +
                ']';
        }
}