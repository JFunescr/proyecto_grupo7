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
public class MenuSecundario {
    public void menuCliente () {
        int opcion = 0;
        do {
            String [] opciones = {"Ver la habitaciones diponibles", "Realizar una reservacion", "Consultar mis reservaciones", "Cancerlar las reservaciones", "Volver al menú principal"};
            opcion = JOptionPane.showOptionDialog(null,
            "Seleccione una opcion en el Sistema de Gestion Hotelero",
            "Menu de gestion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
            
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Habitaciones Disponibles");
                    break;
                
                case 1:
                    JOptionPane.showMessageDialog(null,"Realize una reservacion");
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null,"Consulte sus reservaciones");
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,"Cancele sus reservaciones");
                    break;    
            }
        } while (opcion != 4);
    }
}
