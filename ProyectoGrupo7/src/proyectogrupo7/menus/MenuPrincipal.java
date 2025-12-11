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

public class MenuPrincipal {
    
    private MenuSecundario menuSecundario = new MenuSecundario();
    private MenuReportes reportes = new MenuReportes();

    public void menuPHotelero() {

        int opcion;

        do {
            String[] opciones = {
                "Cliente",
                "Reportes",
                "Salir"
            };

            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Sistema Hotelero",
                    "Menú Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (opcion) {
                case 0:
                    menuSecundario.menuCliente();
                    break;

                case 1:
                    reportes.menuReportes();
                    break;
            }

        } while (opcion != 2);
    }
}
