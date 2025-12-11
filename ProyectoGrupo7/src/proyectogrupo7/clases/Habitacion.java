/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyectogrupo7.clases;

import javax.swing.JOptionPane;
import proyectogrupo7.enumeradores.Estados;

public class Habitacion {
    
    private int numero;
    private Estados estado;
    private double precioPorNoche;
    private int capacidadPersonas;
    private boolean disponible = true;
    
    //Constructores

    public Habitacion(int numero, Estados estado, double precioPorNoche, int capacidadPersonas) {
        this.numero = numero;
        this.estado = estado;
        this.precioPorNoche = precioPorNoche;
        this.capacidadPersonas = capacidadPersonas;
    }
    
    public int getNumero() {
        return numero;
    }

    public Estados getEstado() {
        return estado;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
     public void setEstado(Estados estado) {
        if (estado != null) {
            this.estado = estado;
        } else {
            JOptionPane.showMessageDialog(null, "El tipo no puede ir vacio");
        }
    }
     
    public void setPrecioPorNoche(double precio) {
        if (precio > 0) {
            this.precioPorNoche = precio;
        } else {
            JOptionPane.showMessageDialog(null, "El precio debe ser mayor a 0");
        }
    } 
    
    public void setCapacidadPersonas(int capacidad) {
        if (capacidad > 0) {
            this.capacidadPersonas = capacidad;
        } else {
            JOptionPane.showMessageDialog(null, "La capacidad debe ser mayor a 0");
        }
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, 
                "Habitacion #" + numero +
                "\nTipo: " + estado +
                "\nPrecio por Noche: ₡" + precioPorNoche +
                "\nCapacidad: " + capacidadPersonas + " personas" +
                "\nDisponibilidad: " + (disponible ? "Si" : "No"),
                "Informacion de Habitacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public String toString() {
        return "Hab #" + numero + " | " + estado + " | ₡" + precioPorNoche + " | Cap: "
                + capacidadPersonas + " | Disponible: " + (disponible ? "Si" : "No");
    }
}
