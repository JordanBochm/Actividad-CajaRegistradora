/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author HP
 */
public class Producto
{
    String nombre;
    int cantidad;
    double precio;

    public Producto(String nombre, int cantidad, double precio)
    {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    
    
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
}
