/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Vectores
{

    
    String nombreProducto[];
    int cantidadProduto[];
    double precioProducto[];

    public Vectores(String nomProducto1[], int cantidadProducto1[], double precioProducto1[])
    {
        this.nombreProducto = nomProducto1;
        this.cantidadProduto = cantidadProducto1;
        this.precioProducto = precioProducto1;
    }

    public void definirArreglos()
    {
        Scanner sc = new Scanner(System.in);
        int tamanio = 0;
        System.out.println("Cuanto productos desea agregar?");
        tamanio = sc.nextInt();

        nombreProducto = new String[tamanio];
        cantidadProduto = new int[tamanio];
        precioProducto = new double[tamanio];

    }

    public void ingresarDatos(Scanner sc)
    {
        String nom;
        int cantidadProductos = 0, bandera = 0;
        double precio;

        for (int i = 0; i < nombreProducto.length; i++)
        {
            System.out.println("ingresa el nombre del producto");
            nom = sc.next();
            System.out.println("ingresa la cantidad de ese producto");
            cantidadProductos = sc.nextInt();
            System.out.println("ingresa el precio");
            precio = sc.nextDouble();
            nombreProducto[i] = nom;
            cantidadProduto[i] = cantidadProductos;
            precioProducto[i] = precio;
            nom = "";
            cantidadProductos = 0;
            precio = 0.0;

        }

    }

    public void mostrar()
    {
        for (int i = 0; i < nombreProducto.length; i++)
        {
            System.out.println("Nombre del producto " + nombreProducto[i] + " " + " cantidad " + cantidadProduto[i] + " precio " + precioProducto[i]+"\n");
           
        }
    }

}
