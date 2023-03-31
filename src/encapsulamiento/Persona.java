/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *Esta clase representa una persona
 * dentro del sistema
 * @author Estudiante Hansel Consilla de la Cruz
 */
public class Persona {
    
    private String Nombre;
    private String Dni;
    private double Peso;
    
   
    public String getNombre(){
     return this.Nombre;
    }
     /**
      * Esta funciona permite encapsular el nombre 
      * de la persona
      * @param nombre Este es el valor del nuevo nombre
      */
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
     
    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    
}
 

