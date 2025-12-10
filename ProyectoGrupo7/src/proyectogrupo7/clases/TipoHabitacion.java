/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogrupo7.clases;
import javax.swing.JOptionPane;
/**
 *
 * @author cerdas
 */
public class TipoHabitacion {

    private String tipo; 
    private double precioPorNoche;
    private int capacidadPersonas;


    public TipoHabitacion(String tipo, double precioPorNoche, int capacidadPersonas) {
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.capacidadPersonas = capacidadPersonas;
    }

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setTipo(String tipo) {
        if (!tipo.isEmpty()) {
            this.tipo = tipo;
        } else {
            JOptionPane.showMessageDialog(null, "El tipo no puede ir vacio");
        }
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        if (precioPorNoche > 0) {
            this.precioPorNoche = precioPorNoche;
        } else {
            JOptionPane.showMessageDialog(null, "El precio debe ser mayor a 0");
        }
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        if (capacidadPersonas > 0) {
            this.capacidadPersonas = capacidadPersonas;
        } else {
            JOptionPane.showMessageDialog(null, "La capacidad debe ser mayor a 0");
        }
    }

    // Métodos
    public void mostrarTipoHabitacion() {
        JOptionPane.showMessageDialog(null, this.toString(), "Tipo de Habitacion", JOptionPane.INFORMATION_MESSAGE);
    }

    // Para ver los datos
    @Override
    public String toString() {
        return "Tipo: " + tipo +
                "\nPrecio por Noche: ₡" + precioPorNoche +
                "\nCapacidad: " + capacidadPersonas + " personas";
    }
}
