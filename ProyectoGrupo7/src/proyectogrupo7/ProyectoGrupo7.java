/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectogrupo7;

import proyectogrupo7.menus.MenuPrincipal;
import proyectogrupo7.menus.SubMenu;

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
        SubMenu.creacionHabitaciones();
         //Ejecucion del menu principal
        MenuPrincipal menu = new MenuPrincipal();
        menu.menuPHotelero();
    }
    
}
