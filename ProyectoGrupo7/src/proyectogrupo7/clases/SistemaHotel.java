/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.clases;

/**
 *
 * @author cerdas
 */

public class SistemaHotel {

    public static Habitacion[] habitaciones = new Habitacion[20];
    public static Reserva[] reservas = new Reserva[50];
    public static int contHab = 0;
    public static int contRes = 0;

    public static void agregarHabitacion(Habitacion h) {
        habitaciones[contHab++] = h;
    }

    public static void agregarReserva(Reserva r) {
        reservas[contRes++] = r;
    }
}
