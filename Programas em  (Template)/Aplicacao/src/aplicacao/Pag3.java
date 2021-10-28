/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.girardi
 */
public class Pag3 extends javax.swing.JPanel {

    /**
     * Creates new form Pag3
     */
    public Pag3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OrdNum = new javax.swing.JTextField();
        CustName = new javax.swing.JTextField();
        EmpName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("N˚ do Pedido:");

        jLabel2.setText("Nome do cliente:");

        jLabel3.setText("Colaborador:");

        OrdNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdNumActionPerformed(evt);
            }
        });

        EmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpNameActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gerar PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(110, 110, 110)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrdNum, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(OrdNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String url = "jdbc:mysql://localhost:3306/SalesOrdersExample";
            String user = "root";
            String pass = "1001";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT orders.OrderNumber, employees.EmployeeID, employees.EmpFirstName, employees.EmpLastName, customers.CustomerID, customers.CustFirstName, customers.CustLastName\n"
                    + "FROM orders\n"
                    + "join customers\n"
                    + "ON orders.CustomerID = customers.CustomerID\n"
                    + "join employees\n"
                    + "ON orders.EmployeeID = employees.EmployeeID\n"
                    + "join order_details\n"
                    + "ON orders.OrderNumber = order_details.OrderNumber\n"
                    + "where orders.OrderNumber = " + OrdNum.getText() + "";
            
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {
                CustName.setText(rs.getString(3) + " " + rs.getString(4));
                EmpName.setText(rs.getString(6) + " " + rs.getString(7));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {

            path = j.getSelectedFile().getPath();
        }
        try {
            String url = "jdbc:mysql://localhost:3306/SalesOrdersExample";
            String user = "root";
            String pass = "1001";
            String infor = "";
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT orders.OrderNumber, employees.EmployeeID, employees.EmpFirstName, employees.EmpLastName, customers.CustomerID, customers.CustFirstName, customers.CustLastName\n"
                    + "FROM orders\n"
                    + "join customers\n"
                    + "ON orders.CustomerID = customers.CustomerID\n"
                    + "join employees\n"
                    + "ON orders.EmployeeID = employees.EmployeeID\n"
                    + "join order_details\n"
                    + "ON orders.OrderNumber = order_details.OrderNumber\n"
                    + "where orders.OrderNumber = " + OrdNum.getText() + "";

            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {
                infor = rs.getString(1);
            }
            String file_name = path + "\\" + CustName.getText() + EmpName.getText() + ".pdf";

            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(file_name));
            doc.open();
            Paragraph pa = new Paragraph(infor);
            doc.add(pa);
            doc.close();
            System.out.println("Save complete");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void OrdNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrdNumActionPerformed

    private void EmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustName;
    private javax.swing.JTextField EmpName;
    private javax.swing.JTextField OrdNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
