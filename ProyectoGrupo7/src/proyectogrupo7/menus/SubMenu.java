/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

import javax.swing.JOptionPane;
import proyectogrupo7.clases.Habitacion;
import proyectogrupo7.clases.Cliente;
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
                    JOptionPane.showMessageDialog(null, "Ver Habitaciones");
                    mostrarHabitaciones();
                    
                    break;
                
                case 1:
                    JOptionPane.showMessageDialog(null,"Agregar Habitaciones");
                    agregarHabitacion();
                    
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null,"Modificar Habitaciones");
                    editarHabitacion();
                    
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
                    String nuevoContactoTexto = JOptionPane.showInputDialog("Nuevo contacto:");
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
        
        Estados sencilla = Estados.INDIVIDUAL;
        Estados doble = Estados.DOBLE;
        Estados triple = Estados.TRIPLE;
        Estados suite = Estados.SUITE;
        
        for (int i = 1; i <= 10; i++) {
            Estados estado;
            double precio;
            int capacidad;
            
            if (i <= 3 ) estado = sencilla;
            else if (i <= 6) estado = doble;
            else if (i <= 8) estado = triple;
            else estado = suite;
            
            MenuPrincipal.habitaciones[MenuPrincipal.cantidadHabitaciones] = new Habitacion(i, estado, precio, capacidad);
            MenuPrincipal.cantidadHabitaciones++;
            
        }
      
    }
    
    public static void mostrarHabitaciones() {
        String infoHab = "Lista de las habitaciones existentes:\n\n";
        
        for (int i = 0; i < MenuPrincipal.cantidadHabitaciones; i++) {
            infoHab += MenuPrincipal.habitaciones[i].toString() + "\n\n";
        }
        
        JOptionPane.showMessageDialog(null, infoHab);
    }
    
    public static void agregarHabitacion() {
        
        String numeroTexto = JOptionPane.showInputDialog("Ingrese el numero de la nueva habitacion");
        int numero = Integer.parseInt(numeroTexto);
                    
        String [] opciones = {"Sencilla", "Doble", "Triple", "Suite"};
        int tipoSelec = JOptionPane.showOptionDialog(null, "Seleccione el tipo de habitacion", ".", 
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        
       Estados estado;
       double precio;
       int capacidad;
        
        if (tipoSelec == 0) {
            estado = Estados.INDIVIDUAL;     
            precio = 10000;
            capacidad = 1;
            
        } else if (tipoSelec == 1) {
            estado = Estados.DOBLE;     
            precio = 15000;
            capacidad = 2;
            
        } else if (tipoSelec == 2) {
            estado = Estados.TRIPLE;     
            precio = 20000;
            capacidad = 3;
            
        } else {
            estado = Estados.SUITE;     
            precio = 35000;
            capacidad = 4;
            
        }
        
        Habitacion nueva = new Habitacion(numero, estado, precio, capacidad);
        MenuPrincipal.habitaciones[MenuPrincipal.cantidadHabitaciones] = nueva;
        MenuPrincipal.cantidadHabitaciones++;
        
        
        
        JOptionPane.showMessageDialog(null, "La Habitacion ha sido agregada:\n" + nueva.toString(),
                                            "Habitacion creada", JOptionPane.INFORMATION_MESSAGE);
                    
    }
   
    public static void editarHabitacion() {
        
        String numeroTexto = JOptionPane.showInputDialog("Ingrese el numero de habitacion que desea editar");
        int numeroBuscar = Integer.parseInt(numeroTexto);
        
        Habitacion encontrada = null;
        
        for (int i = 0; i < MenuPrincipal.cantidadHabitaciones; i++) {
            if (MenuPrincipal.habitaciones[i].getNumero() == numeroBuscar) {
                encontrada = MenuPrincipal.habitaciones[i];
                break;
            }
        }
        
        if (encontrada == null) {
            JOptionPane.showMessageDialog(null, "No existe una habitacion registrada con ese numero");
            return;
        }
        
        String[] opciones = {"Cambiar el tipo de Habitacion", "Cambiar su disponibilidad", "Cambiar el precio", "Volver al Menu"};
        int eleccion = JOptionPane.showOptionDialog(null, "Habitacion encontrada:\n" + encontrada.toString() + "\nSeleccione la informacion que desea editar:" ,
                                                    "Editar Habitacion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones [0]);
        
        if (eleccion == 0) {
            
            String[] tiposDesignar = {"Sencilla", "Doble", "Triple", "Suite"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione la nueva categoria", "Tipos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                                        null, tiposDesignar, tiposDesignar[0]);
            
            Estados nuevoEstado;
            
            if (seleccion == 0) nuevoEstado = Estados.INDIVIDUAL;
            else if (seleccion == 1) nuevoEstado = Estados.DOBLE;
            else if (seleccion == 2) nuevoEstado = Estados.TRIPLE;
            else nuevoEstado = Estados.SUITE;
            
            encontrada.setEstado(nuevoEstado);
            
            JOptionPane.showMessageDialog(null, "Tipo actualizado correctamente");
        }   
        
        else if (eleccion == 1) {
            String[] disp = {"Disponible", "No disponible"}; 
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el estado al que desea actualizar la Habitacion", "Disponibilidad", 
                                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, disp, disp[0]);
            
            if (eleccion == 0) encontrada.setDisponible(true);
            else encontrada.setDisponible(false);
            
            JOptionPane.showMessageDialog(null, "Disponibilidad actualizada correctamente");  
        }
        
        else if (eleccion == 2) {
            
            String nuevoPrecioTexto = JOptionPane.showInputDialog("Precio actual: ₡" + encontrada.getPrecioPorNoche() + "\n Ingrese el nuevo precio de la habitacion:");
            
            double nuevoPrecio = Double.parseDouble(nuevoPrecioTexto);
            
            if (nuevoPrecio <= 0) {
                JOptionPane.showMessageDialog(null, "Se debe asignar un precio, No puede ser gratis");
                return;
            }
            
            encontrada.setPrecioPorNoche(nuevoPrecio);
            
            JOptionPane.showMessageDialog(null, "Precio actualizado de forma correcta");
        }
        
        else {
            return;
        }
        
    }
    
    
}
