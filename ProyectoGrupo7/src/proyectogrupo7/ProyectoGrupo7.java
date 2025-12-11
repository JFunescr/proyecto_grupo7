/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectogrupo7;

import proyectogrupo7.clases.Habitacion;
import proyectogrupo7.clases.SistemaHotel;
import proyectogrupo7.enumeradores.Estados;
import proyectogrupo7.menus.MenuPrincipal;

/**
 *
 * @author jafet
 */
public class ProyectoGrupo7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Cargar habitaciones iniciales
        SistemaHotel.agregarHabitacion(new Habitacion(101, Estados.INDIVIDUAL));
        SistemaHotel.agregarHabitacion(new Habitacion(102, Estados.DOBLE));
        SistemaHotel.agregarHabitacion(new Habitacion(201, Estados.SUITE));

         //Ejecucion del menu principal
        MenuPrincipal menu = new MenuPrincipal();
        menu.menuPHotelero();
    }
    
}
