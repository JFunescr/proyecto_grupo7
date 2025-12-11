/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

import javax.swing.JOptionPane;
import proyectogrupo7.clases.Habitacion;
import proyectogrupo7.menus.SubMenu;
/**
 *
 * @author jafet
 */
public class MenuPrincipal {
    private MenuSecundario gestion;
    private MenuAdministracion gestion2;
    
    
    public MenuPrincipal() {
        this.gestion = new MenuSecundario();
        this.gestion2 = new MenuAdministracion();
    }
    public static Habitacion[] habitaciones = new Habitacion[30];
    public static int cantidadHabitaciones = 0;  
    
    
    //Menu principal del hotel
    public void menuPHotelero () {
        SubMenu.creacionHabitaciones();
        int opcion = 0;
        do {
            String [] opciones = {"Ingresar como Cliente", "Ingresar como Administracion", "Salir del sistema"};
            opcion = JOptionPane.showOptionDialog(null,
            "Seleccione una opcion en el Sistema de Gestion Hotelero",
            "Menu de gestion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
            
            //Division de los menus, Aquí no se agrega nada, solo falta agregar la validacion de cliente y de administrador
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Bienvenido al menu de Cliente");
                    gestion.menuCliente();
                    break;
                
                case 1:
                    JOptionPane.showMessageDialog(null,"Bienvenido al menu de Administracion");
                    gestion2.menuAdministrador();
                    break;    
            }
        
        } while (opcion != 2);
        
    }
    
    
    
}
