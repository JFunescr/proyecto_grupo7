/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.clases;


public class Habitacion {

    private int numero;
    private TipoHabitacion tipo;
    private boolean disponible;

    // Constructor
    public Habitacion(int numero, TipoHabitacion tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true; // Todas inician disponibles
    }

    // Getters
    public int getNumero() { return numero; }
    public TipoHabitacion getTipo() { return tipo; }
    public boolean isDisponible() { return disponible; }

    // Setters
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
     
    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }
    
    // Mostrar información
    public String mostrarInfo() {
        return "Hab #" + numero + " | Tipo: " + tipo + " | Disponible: " + (disponible ? "Sí" : "No");
    }
}
