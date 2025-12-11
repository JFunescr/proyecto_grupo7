/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

import javax.swing.JOptionPane;
import proyectogrupo7.clases.Cliente;
import proyectogrupo7.clases.Habitacion;
import proyectogrupo7.clases.Reserva;
import proyectogrupo7.clases.SistemaHotel;

/**
 *
 * @author cerdas
 */
public class MenuSecundario {

    // ------------------------------------------------------------
    // 1. MENU DEL CLIENTE
    // ------------------------------------------------------------
    public void menuCliente() {

        int opcion;

        do {
            String[] opciones = {
                "Ver habitaciones disponibles",
                "Realizar una reservación",
                "Consultar mis reservaciones",
                "Cancelar una reservación",
                "Volver"
            };

            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción",
                    "Menú del Cliente",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcion) {
                case 0:
                    mostrarHabitacionesDisponibles();
                    break;

                case 1:
                    realizarReservacion();
                    break;

                case 2:
                    consultarReservasCliente();
                    break;

                case 3:
                    cancelarReservacion();
                    break;
            }
        } while (opcion != 4);
    }
    // ------------------------------------------------------------
    // 1. MOSTRAR HABITACIONES DISPONIBLES
    // ------------------------------------------------------------
    private void mostrarHabitacionesDisponibles() {

        String texto = "Habitaciones disponibles:\n\n";

        for (Habitacion h : SistemaHotel.habitaciones) {
            if (h != null && h.isDisponible()) {
                texto += "Hab #" + h.getNumero()
                      + " | Tipo: " + h.getEstado()
                      + " | Disponible: Sí\n";
            }
        }

        JOptionPane.showMessageDialog(null, texto);
    }

    // ------------------------------------------------------------
    // 2. REALIZAR RESERVACIÓN
    // ------------------------------------------------------------
    private void realizarReservacion() {

        String nombre = JOptionPane.showInputDialog("Nombre del cliente:");
        if (nombre == null || nombre.trim().equals("")) return;

        String cedula = JOptionPane.showInputDialog("Cédula:");
        if (cedula == null || cedula.trim().equals("")) return;

        String telefono = JOptionPane.showInputDialog("Teléfono:");
        if (telefono == null || telefono.trim().equals("")) return;

        Cliente cliente = new Cliente(nombre, cedula, telefono);

        String numeroHabStr = JOptionPane.showInputDialog("Número de habitación a reservar:");
        if (numeroHabStr == null) return;

        int numHab;
        try {
            numHab = Integer.parseInt(numeroHabStr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Número inválido.");
            return;
        }

        Habitacion hab = buscarHabitacion(numHab);

        if (hab == null) {
            JOptionPane.showMessageDialog(null, "La habitación no existe.");
            return;
        }

        if (!hab.isDisponible()) {
            JOptionPane.showMessageDialog(null, "La habitación está ocupada.");
            return;
        }

        String fechaEntrada = JOptionPane.showInputDialog("Fecha de entrada (dd/mm/aaaa):");
        if (fechaEntrada == null) return;

        String fechaSalida = JOptionPane.showInputDialog("Fecha de salida (dd/mm/aaaa):");
        if (fechaSalida == null) return;

        // monto fijo simple
        double monto = 35000;

        Reserva reserva = new Reserva(cliente, hab, fechaEntrada, fechaSalida, monto);

        SistemaHotel.agregarReserva(reserva);

        hab.setDisponible(false);

        JOptionPane.showMessageDialog(null, "Reservación completada.");
    }

    private Habitacion buscarHabitacion(int numero) {
        for (Habitacion h : SistemaHotel.habitaciones) {
            if (h != null && h.getNumero() == numero) {
                return h;
            }
        }
        return null;
    }

    // ------------------------------------------------------------
    // 3. CONSULTAR RESERVACIONES DEL CLIENTE
    // ------------------------------------------------------------
    private void consultarReservasCliente() {

        String ced = JOptionPane.showInputDialog("Digite su cédula:");
        if (ced == null) return;

        String texto = "Reservaciones activas:\n\n";
        boolean encontro = false;

        for (Reserva r : SistemaHotel.reservas) {
            if (r != null && r.isActiva()) {

                if (r.getCliente().getCedula().equals(ced)) {

                    texto += "Hab #" + r.getHabitacion().getNumero()
                           + " | Desde: " + r.mostrarReserva() + "\n";
                    encontro = true;
                }
            }
        }

        if (!encontro) {
            texto = "No tiene reservaciones activas.";
        }

        JOptionPane.showMessageDialog(null, texto);
    }

    // ------------------------------------------------------------
    // 4. CANCELAR RESERVACIÓN
    // ------------------------------------------------------------
    private void cancelarReservacion() {

        String ced = JOptionPane.showInputDialog("Digite su cédula:");
        if (ced == null) return;

        String numHabStr = JOptionPane.showInputDialog("Número de habitación que desea cancelar:");
        if (numHabStr == null) return;

        int numHab;

        try {
            numHab = Integer.parseInt(numHabStr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Número inválido.");
            return;
        }

        for (Reserva r : SistemaHotel.reservas) {

            if (r != null && r.isActiva()
                    && r.getCliente().getCedula().equals(ced)
                    && r.getHabitacion().getNumero() == numHab) {

                r.cancelar();
                JOptionPane.showMessageDialog(null, "Reserva cancelada.");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "No existe una reserva activa para esa habitación.");
    }
}
