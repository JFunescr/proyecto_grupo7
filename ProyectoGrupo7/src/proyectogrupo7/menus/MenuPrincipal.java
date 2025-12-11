/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

import javax.swing.JOptionPane;
import proyectogrupo7.clases.Cliente;

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
<<<<<<< HEAD
                    JOptionPane.showMessageDialog(null, "Bienvenido al menu de Cliente");
                    
                    Cliente cliente = null;
                    
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre completo");
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero de cédula"));
                    int contacto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero de contacto"));

                    cliente = new Cliente(nombre, cedula, contacto);
                    JOptionPane.showMessageDialog(null, cliente);

                    gestion.menuCliente();
=======
                    menuSecundario.menuCliente();
>>>>>>> dfb929657b8f37f88ae87ba7923821475b9e2fdf
                    break;

                case 1:
                    reportes.menuReportes();
                    break;
            }

        } while (opcion != 2);
    }
}
