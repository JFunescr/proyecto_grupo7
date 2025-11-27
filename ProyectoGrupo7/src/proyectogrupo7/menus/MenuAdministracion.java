/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

import javax.swing.JOptionPane;

/**
 *
 * @author jafet
 */
public class MenuAdministracion {
    private SubMenu gestion;
    
    public MenuAdministracion() {
        this.gestion = new SubMenu();
        
    }
    
    
    public void menuAdministrador () {
        int opcion = 0;
        do {
            String [] opciones = {"Gestionar las habitaciones", "Gestionar los clientes", "Gestionar las reservas", "Reportes del hotel OPCIONAL", "Volver al menú principal"};
            opcion = JOptionPane.showOptionDialog(null,
            "Seleccione una opcion en el Sistema de Gestion Hotelero",
            "Menu de gestion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
            
            switch (opcion) {
                case 0:
                    gestion.menuHabitacion();
                    break;
                
                case 1:
                    gestion.menuCliente();
                    break;
                    
                case 2:
                    gestion.menuReserva();
                    break;
                    
                case 3:
                    gestion.menuReporte();
                    break;    
            }
        } while (opcion != 4);
    }
}
