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
    public void menuAdministrador () {
        int opcion = 0;
        do {
            String [] opciones = {"Gestionar las habitaciones", "Gestionar los clientes", "Gestionar las reservas", "Reportes del hotel OPCIONAL", "Volver al menú principal"};
            opcion = JOptionPane.showOptionDialog(null,
            "Seleccione una opcion en el Sistema de Gestion Hotelero",
            "Menu de gestion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
            
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Habitaciones");
                    break;
                
                case 1:
                    JOptionPane.showMessageDialog(null,"Clientes");
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null,"reservaciones");
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,"Reportes");
                    break;    
            }
        } while (opcion != 4);
    }
}
