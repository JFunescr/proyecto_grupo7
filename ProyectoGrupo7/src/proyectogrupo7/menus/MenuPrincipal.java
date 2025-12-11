/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

import javax.swing.JOptionPane;
import proyectogrupo7.clases.Cliente;
import proyectogrupo7.clases.Habitacion;
import proyectogrupo7.menus.SubMenu;
/**
 *
 * @author jafet
 */
public class MenuPrincipal {
    
    private MenuSecundario menuSecundario = new MenuSecundario();
    private MenuAdministracion menuAdministracion = new MenuAdministracion();
    private MenuReportes reportes = new MenuReportes();
    
    public static Habitacion[] habitaciones = new Habitacion[30];
    public static int cantidadHabitaciones = 0;  
    
    
    //Menu principal del hotel
    public void menuPHotelero () {
        
        //Creacion habitaciones al iniciar el sistema
        SubMenu.creacionHabitaciones();
        int opcion = 0;
        do {
            String [] opciones = {"Menu Cliente", "Menu Administracion", "Reportes", "Salir del sistema"};
            opcion = JOptionPane.showOptionDialog(null,
            "Sistema de Gestion Hotelero",
            "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
        
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Bienvenido al menu de Cliente");
                    
                    Cliente cliente = null;
                    
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre completo");
                    String cedula = JOptionPane.showInputDialog(null, "Ingrese su numero de cédula");
                    String contacto = JOptionPane.showInputDialog(null, "Ingrese su numero de contacto");

                    cliente = new Cliente(nombre, cedula, contacto);
                    JOptionPane.showMessageDialog(null, cliente);
                    menuSecundario.menuCliente();
                    break;
                
                case 1:
                    menuAdministracion.menuAdministrador();
                    break;
                    
                case 2:
                    reportes.menuReportes();
                    break;
            }
        } while (opcion != 3);
    }    
}    