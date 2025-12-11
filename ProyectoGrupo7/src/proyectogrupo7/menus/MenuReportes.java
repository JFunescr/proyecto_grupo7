/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.menus;

/**
 *
 * @author cerdas
 */

import javax.swing.JOptionPane;
import proyectogrupo7.clases.*;

public class MenuReportes {

    public void menuReportes() {

        int opcion;

        do {

            String[] opciones = {
                "Habitaciones disponibles",
                "Reservas activas",
                "Ingresos totales",
                "Volver"
            };

            opcion = JOptionPane.showOptionDialog(
                null,
                "Reporte del hotel",
                "Reportes",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            switch (opcion) {
                case 0: habitacionesDisponibles(); break;
                case 1: reservasActivas(); break;
                case 2: ingresos(); break;
            }

        } while (opcion != 3);
    }

    private void habitacionesDisponibles() {
        String texto = "Habitaciones disponibles:\n\n";

        for (Habitacion h : SistemaHotel.habitaciones) {
            if (h != null && h.isDisponible()) {
                texto += h.toString()+ "\n";
            }
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    private void reservasActivas() {
        String texto = "Reservas activas:\n\n";

        for (Reserva r : SistemaHotel.reservas) {
            if (r != null && r.isActiva()) {
                texto += r.mostrarReserva() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    private void ingresos() {
        double total = 0;

        for (Reserva r : SistemaHotel.reservas) {
            if (r != null) total += r.getMonto();
        }

        JOptionPane.showMessageDialog(null, "Ingresos totales: ₡" + total);
    }
}
