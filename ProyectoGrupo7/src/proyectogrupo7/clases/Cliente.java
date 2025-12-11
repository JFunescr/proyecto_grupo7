/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.clases;

/**
 *
 * @author jafet
 */

public class Cliente {
    
    public String nombre;
    public String cedula;
    public String telefono;

    public Cliente(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    
     public String getNombre() {
        return nombre;
    }
     
    public String getCedula() {
        return cedula;
    } 
    
    public String getTelefono() {
        return telefono;
    }
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "Informacion del Cliente\n" +
                "\nNombre del Cliente: " + nombre +
                "\nNumero de Cedula: " + cedula +
                "\nNumero de Telefono: " + telefono;
    }        
}
