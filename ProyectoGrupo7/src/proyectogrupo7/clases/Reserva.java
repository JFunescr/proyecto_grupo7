/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.clases;

/**
 *
 * @author cerdas
 */

public class Reserva {

    private String nombreCliente;
    private int numeroHabitacion;

    public Reserva(String nombreCliente, int numeroHabitacion) {
        this.nombreCliente = nombreCliente;
        this.numeroHabitacion = numeroHabitacion;
    }

    public String mostrarReserva() {
        return "Cliente: " + nombreCliente + " | Habitación: " + numeroHabitacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }
}
