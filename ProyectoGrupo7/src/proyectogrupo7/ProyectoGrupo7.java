/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectogrupo7;

/**
 *
 * @author jafet
 */

import proyectogrupo7.clases.*;
import proyectogrupo7.enumeradores.Estados;
import proyectogrupo7.menus.MenuPrincipal;

public class ProyectoGrupo7 {

    public static void main(String[] args) {

        // Cargar habitaciones iniciales
        SistemaHotel.agregarHabitacion(new Habitacion(101, Estados.INDIVIDUAL));
        SistemaHotel.agregarHabitacion(new Habitacion(102, Estados.DOBLE));
        SistemaHotel.agregarHabitacion(new Habitacion(201, Estados.SUITE));

        MenuPrincipal menu = new MenuPrincipal();
        menu.menuPHotelero();
    }
}
