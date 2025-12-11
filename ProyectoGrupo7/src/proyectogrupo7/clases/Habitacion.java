/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyectogrupo7.clases;

import proyectogrupo7.enumeradores.Estados;

public class Habitacion {

    private int numero;
    private Estados tipo;
    private boolean disponible = true;

    public Habitacion(int numero, Estados tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() { return numero; }
    public Estados getTipo() { return tipo; }
    public boolean isDisponible() { return disponible; }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String mostrarInfo() {
        return "Hab #" + numero + " | " + tipo + " | Disponible: " + (disponible ? "Sí" : "No");
    }
}
