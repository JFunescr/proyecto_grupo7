/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.clases;

public class Reserva {

    private Cliente cliente;
    private Habitacion habitacion;
    private String fechaEntrada;
    private String fechaSalida;
    private double monto;
    private boolean activa;

    public Reserva(Cliente cliente, Habitacion habitacion,
                   String fechaEntrada, String fechaSalida, double monto) {

        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.monto = monto;
        this.activa = true;
    }

    public Cliente getCliente() { return cliente; }
    public Habitacion getHabitacion() { return habitacion; }
    public double getMonto() { return monto; }
    public boolean isActiva() { return activa; }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    
    public void cancelar() {
        this.activa = false;
        habitacion.setDisponible(true);
    }

    public String mostrarReserva() {
        return "Cliente: " + cliente.getNombre() +
               " | Habitación: #" + habitacion.getNumero() +
               " | Desde " + fechaEntrada + " hasta " + fechaSalida +
               " | Monto: " + monto +
               " | Estado: " + (activa ? "Activa" : "Cancelada");
    }
}
