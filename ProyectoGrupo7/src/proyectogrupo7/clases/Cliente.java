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
    
    private String nombre;
    private int cedula;
    private int contacto;

    public Cliente(String nombre, int cedula, int contacto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Información del Cliente:\n" +
               "Nombre del Cliente: " + nombre +
               "\nNúmero de Cédula: " + cedula +
               "\nNúmero de Contacto: " + contacto;
    }
}


