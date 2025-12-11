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
<<<<<<< HEAD
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
=======
    private String cedula;
    private String telefono;

    public Cliente(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getCedula() { return cedula; }
    public String getTelefono() { return telefono; }

    @Override
    public String toString() {
        return nombre + " (Cédula: " + cedula + ")";
>>>>>>> dfb929657b8f37f88ae87ba7923821475b9e2fdf
    }
}


