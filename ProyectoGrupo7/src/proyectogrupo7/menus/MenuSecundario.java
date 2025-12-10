/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

import javax.swing.JOptionPane;
import proyectogrupo7.clases.Habitacion;
import proyectogrupo7.clases.Reserva;
import proyectogrupo7.enumeradores.Estados;

/**
 *
 * @author jafet
 */
public class MenuSecundario {
    public void menuCliente () {
       
        int opcion = 0;
        do {
            String[] opciones = {
                "Ver la habitaciones disponibles",
                "Realizar una reservacion",
                "Consultar mis reservaciones",
                "Cancelar las reservaciones",
                "Volver al menú principal"
            };

            opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opcion en el Sistema de Gestion Hotelero",
                "Menu de gestion",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            switch (opcion) {
                case 0: // Ver habitaciones
                    JOptionPane.showMessageDialog(null, "Habitaciones Disponibles");
                    break;

                case 1: // Realizar reservación
                    JOptionPane.showMessageDialog(null, "Realice una reservacion");
                    break;

                case 2: // Consultar reservaciones
                    JOptionPane.showMessageDialog(null, "Consulte sus reservaciones");
                    break;

                case 3: // Cancelar reservación
                    JOptionPane.showMessageDialog(null, "Cancele sus reservaciones");
                    break;
            }
        } while (opcion != 4);
    }
}
