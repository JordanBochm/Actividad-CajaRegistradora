/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author HP
 */
public class FrameTickets extends javax.swing.JFrame
{

    String s;

    /**
     * Creates new form Ticket
     */
    public FrameTickets(String s)
    {
        this.s = s;
        creaComp();

    }

    private void creaComp()
    {

        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTextArea txProd = new JTextArea();
        JPanel jPanel2 = new JPanel();
        JLabel logo = new JLabel();
        JLabel jordi = new JLabel();
        JLabel codigoDeBarras = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jordi Shop");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 310, 30));

        jLabel2.setText("Av. Prolongacion del Potrero San Mateo Atenco");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 280, 30));

        jLabel3.setText("Numero: 722 722 5477");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("!Gracias por su compra!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 240, 50));

        jScrollPane1.setBorder(null);

        txProd.setEditable(false);
        txProd.setColumns(20);
        txProd.setRows(5);
        txProd.setBorder(null);

        jScrollPane1.setViewportView(txProd);

        txProd.setText(s);
        txProd.setBorder(null);
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 420, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        codigoDeBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/9185570.png"))); // NOI18N
        jPanel1.add(codigoDeBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 190, 40));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LogoTiendaJordi.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 110));

        jordi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LetrasJordi1.png"))); // NOI18N
        jPanel1.add(jordi, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 80, 60));

        pack();
    }

    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {

            }
        });
    }
}
