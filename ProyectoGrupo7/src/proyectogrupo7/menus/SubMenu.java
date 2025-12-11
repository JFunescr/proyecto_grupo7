/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

import javax.swing.JOptionPane;
import proyectogrupo7.clases.Habitacion;
import proyectogrupo7.clases.Cliente;
import proyectogrupo7.clases.SistemaHotel;
import proyectogrupo7.enumeradores.Estados;

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
                    SistemaHotel.mostrarHabitaciones();
                    break;
                
                case 1:
                    SistemaHotel.agregarHabitacion();
                    break;
                    
                case 2:
                    SistemaHotel.editarHabitacion();
                    
                    break;
                    
                case 3:
                    SistemaHotel.eliminarHabitacion();
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
                    String contactoTexto = JOptionPane.showInputDialog("Telefono:");

                    if (nombre == null || nombre.equals("") || cedulaTexto == null || cedulaTexto.equals("") ||contactoTexto == null ||
                        contactoTexto.equals("")) {
                        JOptionPane.showMessageDialog(null, "Datos inválidos.");
                        break;
                    }

                    clientes[cantidadClientes] = new Cliente(nombre, cedulaTexto, contactoTexto);
                    cantidadClientes++;
                    JOptionPane.showMessageDialog(null, "Cliente registrado.");
                    break;

                case 2: // Modificar
                    String cedulaModTexto = JOptionPane.showInputDialog("Cédula del cliente a modificar:");
                    String cedulaMod = cedulaModTexto;

                    int indice = -1;
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].getCedula().equals(cedulaMod)) {
                            indice = i;
                        }
                    }

                    if (indice == -1) {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                        break;
                    }

                    String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:");
                    String nuevoContactoTexto = JOptionPane.showInputDialog("Nuevo Telefono:");
                    int nuevoContacto = Integer.parseInt(nuevoContactoTexto);

                    clientes[indice].setNombre(nuevoNombre);
                    clientes[indice].setTelefono(nuevoContactoTexto);

                    JOptionPane.showMessageDialog(null, "Cliente modificado.");
                    break;

                case 3: // Eliminar
                    String cedulaEliminarTexto = JOptionPane.showInputDialog("Cédula del cliente a eliminar:");
                    String cedulaEliminar = cedulaEliminarTexto;

                    int pos = -1;
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].getCedula().equals(cedulaEliminar)) {
                            pos = i;
                            break;
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
        
        Estados individual = Estados.INDIVIDUAL;
        Estados doble = Estados.DOBLE;
        Estados triple = Estados.TRIPLE;
        Estados suite = Estados.SUITE;
        
        for (int i = 1; i <= 10; i++) {
            Estados estado;
            double precio;
            int capacidad;
            
            if (i <= 3 ) {
                estado = individual;
                precio = 10000;
                capacidad = 1;
            } else if (i <= 6) {
                estado = doble;
                precio = 15000;
                capacidad = 2;
            } else if (i <= 8) {
                estado = triple;
                precio = 20000;
                capacidad = 3;
            } else {
                estado = suite;
                precio = 35000;
                capacidad = 4;
            }
            
            MenuPrincipal.habitaciones[MenuPrincipal.cantidadHabitaciones] = new Habitacion(i, estado, precio, capacidad);
            MenuPrincipal.cantidadHabitaciones++;
            
        }
      
    }
    
    
    
}
    

