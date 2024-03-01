/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Validaciones;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class CajaRegistradora extends JFrame
{

    JLabel tituloVentana;
    JLabel nombreProducto;
    JLabel cantidadProductos;
    JLabel precioProductos;
    JButton agregar;
    JButton finalizar;
    JTextField nomProductos;
    JTextField cantidadField;
    JTextField productosField;
    ArrayList<Producto> productosLista;
    String nombreProducto1;
    String desp;

    public CajaRegistradora()
    {

        setTitle("Caja Registradora");
        setLayout(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color color = Color.decode("#4169E1");
        getContentPane().setBackground(color);
        setLocationRelativeTo(null);
        componentes();
        setVisible(true);
        setResizable(false); //no maximinar la pantalla 
//        Componentes();
        productosLista = new ArrayList<>();
    }

    public void componentes()
    {
        Font font = new Font("Arial", Font.BOLD, 16);
        tituloVentana = new JLabel("Por favor, ingrese los datos correspondientes");
        tituloVentana.setFont(font);
        tituloVentana.setBounds(10, 0, 350, 50);
        add(tituloVentana);

        nombreProducto = new JLabel("Nombre Producto");
        Font fontNomProducto = new Font("Arial", Font.BOLD, 14);
        nombreProducto.setFont(fontNomProducto);
        Color colorHexadecimal = Color.decode("#D3D3D3");
        nombreProducto.setForeground(colorHexadecimal);
        nombreProducto.setBounds(100, 60, 130, 50);
        add(nombreProducto);

        nomProductos = new JTextField("");
        nomProductos.setBounds(230, 70, 95, 30);
        add(nomProductos);
        nomProductos.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                Validaciones.validaAlfabeticos(evt, 15, nomProductos.getText());
            }
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                if (evt.getKeyChar() == '\n')
                {
                    cantidadField.requestFocus();
                }
            }
        });

        cantidadProductos = new JLabel("Cantidad");
        Font fontCantidad = new Font("Arial", Font.BOLD, 14);
        cantidadProductos.setFont(fontCantidad);
        Color colorHexadecimal1 = Color.decode("#D3D3D3");
        cantidadProductos.setForeground(colorHexadecimal);
        cantidadProductos.setBounds(100, 100, 130, 50);
        add(cantidadProductos);

        cantidadField = new JTextField("");
        cantidadField.setBounds(175, 110, 95, 30);
        add(cantidadField);

        cantidadField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                Validaciones.validaEntero(evt, 6, cantidadField.getText());
            }
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                if (evt.getKeyChar() == '\n')
                {
                    productosField.requestFocus();
                }
            }
        });
        
        precioProductos = new JLabel("Precio del producto");
        Font fontPrecio = new Font("Arial", Font.BOLD, 14);
        precioProductos.setFont(fontPrecio);
        Color colorHexadecimal2 = Color.decode("#D3D3D3");
        precioProductos.setForeground(colorHexadecimal);
        precioProductos.setBounds(100, 140, 160, 50);
        add(precioProductos);

        
        
        productosField = new JTextField("");
        productosField.setBounds(250, 150, 95, 30);
        add(productosField);
     

        productosField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                Validaciones.validaFlotantes(evt, 15, productosField.getText());
            }
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                if (evt.getKeyChar() == '\n')
                {
                    agregar.requestFocus();
                }
            }
        });

        agregar = new JButton("Agregar");
        agregar.setBounds(25, 250, 100, 50);

        nombreProducto1 = agregar.getText();
        agregar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
//                if  validar si todos los campos estan llenos
                if (nomProductos.getText().isEmpty() || cantidadField.getText().isEmpty() || productosField.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Favor de ingresar datos correctos");
                } else
                {
                    guardarProducto();
                }

                for (Producto producto : productosLista)
                {
                    System.out.println(producto);
                }
            }
        });
        add(agregar);

        finalizar = new JButton("Terminar");
        finalizar.setBounds(250, 250, 100, 50);
        add(finalizar);
        finalizar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                desp = desp();

                JFrame f = new FrameTickets(desp);
                f.setVisible(true);
                f.setLocationRelativeTo(null);
                f.setResizable(false);
//                System.out.println(desp());
            }
        });

//        add(agregar);
//        agregar = new JButton("Agregar");
//        agregar.setBounds(300, 200, 100, 100);
//        agregar.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
////                OtroFrame f = new OtroFrame();
//////                f.setVisible(true);
//            }
//        });
//        add(agregar);
    }

    public void guardarProducto()
    {
        if (!nombreProducto1.isEmpty())
        {

            Producto producto = new Producto(nomProductos.getText(), Integer.parseInt(cantidadField.getText()), Double.parseDouble(productosField.getText()));
            productosLista.add(producto);
        }

    }

    public String desp()
    {
        String s = "Producto\tCantidad\tPrecio unitario\tPrecio total\n";
        double res = 0;
        for (int i = 0; i < productosLista.size(); i++)
        {

            s += productosLista.get(i).getNombre() + "\t"
                    + productosLista.get(i).getCantidad() + "\t"
                    + productosLista.get(i).getPrecio() + "\t"
                    + (productosLista.get(i).getCantidad() * productosLista.get(i).getPrecio())
                    + "\n\n\n";
            res += (productosLista.get(i).getCantidad() * productosLista.get(i).getPrecio());
        }
        s += "Importe Total\t\t\t" + "$"+res;
        return s;
    }

}
