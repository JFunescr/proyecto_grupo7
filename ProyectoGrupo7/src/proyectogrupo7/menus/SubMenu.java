/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

import javax.swing.JOptionPane;
import proyectogrupo7.clases.TipoHabitacion;
import proyectogrupo7.clases.Habitacion;

/**
 *
 * @author jafet
 */
public class SubMenu {
    
    
    
    public void menuHabitacion () {
        int opcion = 0;
        do {
            String [] opciones = {"Ver todas la habitaciones", "Agregar habitaciones nuevas", "Modificar las habitaciones existentes", "Eliminar una habitacion", "Volver al Menú Administracion"};
            opcion = JOptionPane.showOptionDialog(null,
            "Seleccione una opcion en el Sistema de Gestion Hotelero",
            "Menu de gestion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
            
            //Aquí van las funciones de cada opcion se pueden agregar aquí 
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Ver Habitaciones");
                    creacionHabitaciones();
                    
                    break;
                
                case 1:
                    JOptionPane.showMessageDialog(null,"Agrgar Habitaciones");
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null,"Modificar Habitaciones");
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,"Eliminar Habitacion");
                    break;    
            }
        } while (opcion != 4);
    }
    
    public void menuCliente () {
        int opcion = 0;
        do {
            String [] opciones = {"Ver lista de clientes", "Registrar nuevos clientes", "Modificar datos de los clientes", "Eliminar cliente", "Volver al Menú Administracion"};
            opcion = JOptionPane.showOptionDialog(null,
            "Seleccione una opcion en el Sistema de Gestion Hotelero",
            "Menu de gestion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
            
            //Aquí van las funciones de cada opcion se pueden agregar aquí 
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Ver Clientes");
                    break;
                
                case 1:
                    JOptionPane.showMessageDialog(null,"Registrar Cliente");
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null,"Modificar Datos de los Clientes");
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,"Eliminar Cliente");
                    break;    
            }
        } while (opcion != 4);
    }
    
    public void menuReserva () {
        int opcion = 0;
        do {
            String [] opciones = {"Ver Todas las Reservas", "Buscar Reserva por Cliente", "Cancelar Reserva", "Volver al Menú Administracion"};
            opcion = JOptionPane.showOptionDialog(null,
            "Seleccione una opcion en el Sistema de Gestion Hotelero",
            "Menu de gestion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
            
            //Aquí van las funciones de cada opcion se pueden agregar aquí
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Ver Todas las Reservas");
                    break;
                
                case 1:
                    JOptionPane.showMessageDialog(null,"Buscar Reserva por Cliente");
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null,"Cancelar Reserva");
                    break;
                    
            }
        } while (opcion != 3);
    }
    
    public void menuReporte () {
        int opcion = 0;
        do {
            String [] opciones = {"Ocupacion del Hotel", "Habitaciones Disponibles", "Reservas Activas", "Volver al Menú Administracion"};
            opcion = JOptionPane.showOptionDialog(null,
            "Seleccione una opcion en el Sistema de Gestion Hotelero",
            "Menu de gestion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
            
            //Aquí van las funciones de cada opcion se pueden agregar aquí 
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Ocupacion del Hotel");
                    break;
                
                case 1:
                    JOptionPane.showMessageDialog(null,"Habitaciones Disponibles");
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null,"Reservas Activas");
                    break;
                    
            }
        } while (opcion != 3);
    }
    
    public static void creacionHabitaciones() {
        
        TipoHabitacion sencilla = new TipoHabitacion("Sencilla", 10000, 1);
        TipoHabitacion doble = new TipoHabitacion("Doble", 15000, 2);
        TipoHabitacion triple = new TipoHabitacion("Triple", 20000, 3);
        TipoHabitacion suite = new TipoHabitacion("Suite", 35000, 4);
        
        String habInfo = "Lista de habitaciones:\n\n";
        
        for (int i = 1; i <= 20; i++) {
            TipoHabitacion tipoDesignado;
            
            if (i >= 1 && i <= 5) {
                tipoDesignado = sencilla;
            } else if (i >= 6 && i <= 10) {
                tipoDesignado = doble;
            } else if (i >= 11 && i <= 15) {
                tipoDesignado = triple;
            } else {
                tipoDesignado = suite;
            }
            
            Habitacion hab = new Habitacion(i, tipoDesignado);
            
            habInfo += hab.mostrarInfo() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, habInfo, "Habitaciones", JOptionPane.INFORMATION_MESSAGE);
    }
    
       
}
