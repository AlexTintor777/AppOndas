/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudio1;

import Modelo.Usuario;
import Screens.*;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author alexa
 */
public class Parte2 extends javax.swing.JFrame {

    Color azul;
    Usuario us;
    public Parte2(Usuario usuario) {
        initComponents();
        us = usuario;
        azul = new Color(137,179,199);
        initStyles();
    }

    private Parte2() {
        initComponents();
         initStyles();
    }
    
    public JPanel getFondo(){
        return fondo;
    }
    
    private void initStyles(){
        d1.setVisible(false);
        d2.setVisible(false);
        d3.setVisible(false);
        d31.setVisible(false);
        d4.setVisible(false);
        d41.setVisible(false);
        d5.setVisible(false);
        d51.setVisible(false);
        d6.setVisible(false);
        d61.setVisible(false);
        d7.setVisible(false);
    }
    
    private void changeFondo(JPanel fondos){   
        fondo.setSize(1351,810);
        fondos.setLocation(0,0);
        
        fondo.removeAll();
        fondo.setLayout(new java.awt.BorderLayout());
        fondo.add(fondos, BorderLayout.CENTER);
        fondo.revalidate();
        fondo.repaint();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fondo = new Vista.PanelRound();
        jButton1 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        d51 = new javax.swing.JLabel();
        panelRound14 = new Vista.PanelRound();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d31 = new javax.swing.JLabel();
        d41 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        d61 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(172, 202, 216));

        jPanel1.setBackground(new java.awt.Color(172, 202, 216));

        fondo.setBackground(new java.awt.Color(237, 237, 237));
        fondo.setPreferredSize(new java.awt.Dimension(1351, 810));
        fondo.setRoundBottomLeft(100);
        fondo.setRoundBottomRight(100);
        fondo.setRoundTopLeft(100);
        fondo.setRoundTopRight(100);
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Siguiente");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 720, 140, 50));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setText("Ondas");
        fondo.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, 60, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setText("Una onda se compone de :");
        fondo.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 320, 40));

        d51.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d51.setText("Se representa con la letra f.");
        fondo.add(d51, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 950, 30));

        panelRound14.setBackground(new java.awt.Color(172, 202, 216));
        panelRound14.setRoundBottomLeft(100);
        panelRound14.setRoundBottomRight(100);
        panelRound14.setRoundTopLeft(100);
        panelRound14.setRoundTopRight(100);
        panelRound14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("2. Partes de una onda");
        panelRound14.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 50));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        panelRound14.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 630, 40));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        panelRound14.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 320, 40));

        fondo.add(panelRound14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 400, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("1. Cresta");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 310, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("2. Valle");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 310, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("3. Período");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 310, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("4. Amplitud");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 390, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("5. Frecuencia");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 330, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("6. Longitud de onda");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 330, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("7. Ciclo");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 330, 40));

        d1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d1.setText("Es el punto máximo en la ondulación");
        fondo.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 680, 60));

        d2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d2.setText("Es el punto más bajo de una onda (lo contrario de la cresta).");
        fondo.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 680, 60));

        d4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d4.setText("Representa la variación máxima del desplazamiento, la distancia vertical entre la ");
        fondo.add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 950, 60));

        d3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d3.setText("Es el tiempo que demora la onda en ir desde una cresta hasta la siguiente, o sea, ");
        fondo.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 950, 60));

        d31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d31.setText("o sea, en repetirse. Se representa con la letra T.");
        fondo.add(d31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 950, 30));

        d41.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d41.setText("cresta y el punto medio de la onda. Se representa con la letra A.");
        fondo.add(d41, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 950, 30));

        d7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d7.setText("Es la ondulación completa, de principio a fin.");
        fondo.add(d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 950, 30));

        d5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d5.setText("Es el número de veces que la onda se repite en una unidad determinada de tiempo. ");
        fondo.add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 950, 30));

        d6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d6.setText("Es la distancia entre dos crestas consecutivas de la ondulación. ");
        fondo.add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 800, 30));

        d61.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d61.setText("Se representa con el símbolo λ (Lambda).");
        fondo.add(d61, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 950, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Atras");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 720, 140, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1363, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Parte3 p2 = new Parte3(us);
       changeFondo(p2.getFondo());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

            if(d1.isVisible()){
                d1.setVisible(false); 
            }else{
                d1.setVisible(true); 
            }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setForeground(azul);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setForeground(azul);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(azul);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setForeground(azul);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(d5.isVisible()){
                d5.setVisible(false); 
                d51.setVisible(false); 
            }else{
                d5.setVisible(true); 
                d51.setVisible(true); 
            }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(azul);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setForeground(azul);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setForeground(azul);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
       jLabel5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
       jLabel9.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(d2.isVisible()){
                d2.setVisible(false); 
            }else{
                d2.setVisible(true); 
            }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(d3.isVisible()){
                d3.setVisible(false); 
                d31.setVisible(false); 
            }else{
                d3.setVisible(true); 
                d31.setVisible(true); 
            }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if(d4.isVisible()){
                d4.setVisible(false); 
                d41.setVisible(false); 
            }else{
                d4.setVisible(true); 
                d41.setVisible(true); 
            }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if(d6.isVisible()){
                d6.setVisible(false); 
                d61.setVisible(false); 
            }else{
                d6.setVisible(true); 
                d61.setVisible(true); 
            }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if(d7.isVisible()){
                d7.setVisible(false); 
            }else{
                d7.setVisible(true); 
            }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Parte1 p1 = new Parte1(us);
        changeFondo(p1.getFondo());
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Parte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parte2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d31;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d41;
    private javax.swing.JLabel d5;
    private javax.swing.JLabel d51;
    private javax.swing.JLabel d6;
    private javax.swing.JLabel d61;
    private javax.swing.JLabel d7;
    private Vista.PanelRound fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private Vista.PanelRound panelRound14;
    // End of variables declaration//GEN-END:variables
}
