/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

import javax.swing.JOptionPane;
import proyectogrupo7.clases.TipoHabitacion;
import proyectogrupo7.clases.Habitacion;
import proyectogrupo7.clases.Cliente;

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
                    mostrarHabitaciones();
                    
                    break;
                
                case 1:
                    JOptionPane.showMessageDialog(null,"Agregar Habitaciones");
                    agregarHabitacion();
                    
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
        
        Cliente[] clientes = new Cliente[30];
        int cantidadClientes = 0;

        int opcion = 0;
        do {
            String [] opciones = {"Ver lista de clientes", "Registrar nuevos clientes", "Modificar datos de los clientes", "Eliminar cliente", "Volver al Menú Administracion"};
            opcion = JOptionPane.showOptionDialog(null,
            "Seleccione una opcion en el Sistema de Gestion Hotelero",
            "Menu de gestion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
            
            //Aquí van las funciones de cada opcion se pueden agregar aquí 

            switch (opcion) {
                case 0: // Ver lista
                    if (cantidadClientes == 0) {
                        JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
                    } else {
                        String texto = "Lista de clientes:\n\n";
                        for (int i = 0; i < cantidadClientes; i++) {
                            texto += clientes[i].toString() + "\n\n";
                        }
                        JOptionPane.showMessageDialog(null, texto);
                    }
                    break;

                case 1: // Registrar
                    if (cantidadClientes >= clientes.length) {
                        JOptionPane.showMessageDialog(null, "Capacidad llena.");
                        break;
                    }

                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String cedulaTexto = JOptionPane.showInputDialog("Cédula:");
                    String contactoTexto = JOptionPane.showInputDialog("Contacto:");

                    if (nombre == null || nombre.equals("") || cedulaTexto == null || cedulaTexto.equals("") ||contactoTexto == null ||
                        contactoTexto.equals("")) {
                        JOptionPane.showMessageDialog(null, "Datos inválidos.");
                        break;
                    }

                    int cedula = Integer.parseInt(cedulaTexto);
                    int contacto = Integer.parseInt(contactoTexto);

                    clientes[cantidadClientes] = new Cliente(nombre, cedula, contacto);
                    cantidadClientes++;
                    JOptionPane.showMessageDialog(null, "Cliente registrado.");
                    break;

                case 2: // Modificar
                    String cedulaModTexto = JOptionPane.showInputDialog("Cédula del cliente a modificar:");
                    int cedulaMod = Integer.parseInt(cedulaModTexto);

                    int indice = -1;
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].getCedula() == cedulaMod) {
                            indice = i;
                        }
                    }

                    if (indice == -1) {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                        break;
                    }

                    String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:");
                    String nuevoContactoTexto = JOptionPane.showInputDialog("Nuevo contacto:");
                    int nuevoContacto = Integer.parseInt(nuevoContactoTexto);

                    clientes[indice].setNombre(nuevoNombre);
                    clientes[indice].setContacto(nuevoContacto);

                    JOptionPane.showMessageDialog(null, "Cliente modificado.");
                    break;

                case 3: // Eliminar
                    String cedulaEliminarTexto = JOptionPane.showInputDialog("Cédula del cliente a eliminar:");
                    int cedulaEliminar = Integer.parseInt(cedulaEliminarTexto);

                    int pos = -1;
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].getCedula() == cedulaEliminar) {
                            pos = i;
                        }
                    }
                    if (pos == -1) {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                        break;
                    }
                    for (int i = pos; i < cantidadClientes - 1; i++) {
                        clientes[i] = clientes[i + 1];
                    }
                    clientes[cantidadClientes - 1] = null;
                    cantidadClientes--;

                    JOptionPane.showMessageDialog(null, "Cliente eliminado.");
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
        
        if (MenuPrincipal.cantidadHabitaciones > 0) {
            return;
        }
        
        TipoHabitacion sencilla = new TipoHabitacion("Sencilla", 10000, 1);
        TipoHabitacion doble = new TipoHabitacion("Doble", 15000, 2);
        TipoHabitacion triple = new TipoHabitacion("Triple", 20000, 3);
        TipoHabitacion suite = new TipoHabitacion("Suite", 35000, 4);
        
        for (int i = 1; i <= 10; i++) {
            TipoHabitacion tipoDesignado;
            
            if (i <= 3 ) tipoDesignado = sencilla;
            else if (i <= 6) tipoDesignado = doble;
            else if (i <= 8) tipoDesignado = triple;
            else tipoDesignado = suite;
            
            MenuPrincipal.habitaciones[MenuPrincipal.cantidadHabitaciones] = new Habitacion(i, tipoDesignado);
            MenuPrincipal.cantidadHabitaciones++;
            
        }
      
    }
    
    public static void mostrarHabitaciones() {
        String infoHab = "Lista de las habitaciones existentes:\n\n";
        
        for (int i = 0; i < MenuPrincipal.cantidadHabitaciones; i++) {
            infoHab += MenuPrincipal.habitaciones[i].mostrarInfo() + "\n\n";
        }
        
        JOptionPane.showMessageDialog(null, infoHab);
    }
    
    public static void agregarHabitacion() {
        
        String numeroTexto = JOptionPane.showInputDialog("Ingrese el numero de la nueva habitacion");
        int numero = Integer.parseInt(numeroTexto);
                    
        String [] opciones = {"Sencilla", "Doble", "Triple", "Suite"};
        int tipoSelec = JOptionPane.showOptionDialog(null, "Seleccione el tipo de habitacion", ".", 
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        
        TipoHabitacion tipo;
        
        if (tipoSelec == 0) {
            tipo = new TipoHabitacion("Sencilla", 10000, 1);           
        } else if (tipoSelec == 1) {
            tipo = new TipoHabitacion("Doble", 15000, 2);
        } else if (tipoSelec == 2) {
            tipo = new TipoHabitacion("Triple", 20000, 3);
        } else {
            tipo = new TipoHabitacion("Suite", 35000, 4);
        }
        
        Habitacion nueva = new Habitacion(numero, tipo);
        MenuPrincipal.habitaciones[MenuPrincipal.cantidadHabitaciones] = nueva;
        MenuPrincipal.cantidadHabitaciones++;
        
        
        
        JOptionPane.showMessageDialog(null, "La Habitacion ha sido agregada:\n" + nueva.mostrarInfo(),
                                            "Habitacion creada", JOptionPane.INFORMATION_MESSAGE);
                    
    }
    
}
