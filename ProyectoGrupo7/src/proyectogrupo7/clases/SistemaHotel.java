/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.clases;

import javax.swing.JOptionPane;
import proyectogrupo7.enumeradores.Estados;
import proyectogrupo7.menus.MenuPrincipal;

/**
 *
 * @author cerdas
 */

public class SistemaHotel {
    public static Reserva[] reservas = new Reserva[50];
    public static int contRes = 0;
    
    public static void mostrarHabitaciones() {
        String infoHab = "Lista de las habitaciones existentes:\n\n";
        
        for (int i = 0; i < MenuPrincipal.cantidadHabitaciones; i++) {
            infoHab += MenuPrincipal.habitaciones[i].toString() + "\n\n";
        }
        
        JOptionPane.showMessageDialog(null, infoHab);
    }
    
    public static void habitacionesDisponibles() {
        String texto = "Habitaciones disponibles:\n\n";
        boolean hay = false;
        
        for (int i = 0; i < MenuPrincipal.cantidadHabitaciones; i++) {
            Habitacion h = MenuPrincipal.habitaciones[i];
            
            if (h != null && h.isDisponible()) {
                texto += "Hab #" + h.getNumero()
                      + " | Tipo: " + h.getEstado()
                      + " | Disponible: Si\n";
                hay = true;
            }
        }
        
        if (!hay) {
            texto += "No hay habitaciones disponibles";
        }
        JOptionPane.showMessageDialog(null, texto);
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
            
            String[] tiposDesignar = {"Individual", "Doble", "Triple", "Suite"};
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
            
            if (seleccion == 0) encontrada.setDisponible(true);
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
        
        
    public static void eliminarHabitacion() {
            
        String numeroTexto = JOptionPane.showInputDialog("Ingrese el numero de la habitacion que desea eliminar");
            
        if (numeroTexto == null || numeroTexto.equals("")) {
            JOptionPane.showMessageDialog(null, "Numero de habitacion invalido");
            return;
        }
        
        int numeroEliminar = Integer.parseInt(numeroTexto);
        int pos = -1;
        
        for (int i = 0; i < MenuPrincipal.cantidadHabitaciones; i++) {
            if (MenuPrincipal.habitaciones[i].getNumero() == numeroEliminar) {
                pos = i;
                break;
            }
        }
        
        if (pos == -1) {
            JOptionPane.showMessageDialog(null, "No se encontró una habitacion con ese numero de identificacion");
            return;
        }
        
        for (int i = pos; i < MenuPrincipal.cantidadHabitaciones - 1; i++) {
            MenuPrincipal.habitaciones[i] = MenuPrincipal.habitaciones[i + 1];
        } 
        
        MenuPrincipal.habitaciones[MenuPrincipal.cantidadHabitaciones - 1] = null;
        MenuPrincipal.cantidadHabitaciones--;
        
        JOptionPane.showMessageDialog(null, "Habitacion eliminada correctamente");
        
    }

    public static void agregarReserva(Reserva r) {
        reservas[contRes++] = r;
    }
}
