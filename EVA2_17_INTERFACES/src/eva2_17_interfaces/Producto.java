/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_17_interfaces;

/**
 *
 * @author invitado
 */
public abstract class Producto {
    private double precio;
    private String nombre;

    public double getPrecio() {
        return precio;
    }

    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
