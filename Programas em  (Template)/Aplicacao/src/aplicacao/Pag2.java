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
public class Pag2 extends javax.swing.JPanel {

    /**
     * Creates new form Pag2
     */
    public Pag2() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VendID = new javax.swing.JTextField();
        VendName = new javax.swing.JTextField();
        VendNum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("ID do Vendedor:");

        jLabel2.setText("Nome e endereço:");

        jLabel3.setText("Telefone:");

        VendID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendIDActionPerformed(evt);
            }
        });

        VendNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendNumActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VendNum, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(VendName)
                            .addComponent(VendID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(VendID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VendName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(VendNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String url = "jdbc:mysql://localhost:3306/SalesOrdersExample";
            String user ="root";
            String pass = "1001";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT * FROM vendors WHERE VendorID = '"+VendID.getText()+"'";
            ResultSet rs = stmt.executeQuery(Query);
            while(rs.next()){
                VendName.setText(rs.getString(2) + " " + rs.getString(3));
                VendNum.setText(rs.getString(8) + " " + rs.getString(9));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if(x == JFileChooser.APPROVE_OPTION){

            path = j.getSelectedFile().getPath();
        }
        try {
            String url = "jdbc:mysql://localhost:3306/SalesOrdersExample";
            String user ="root";
            String pass = "1001";
            String infor = "";
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            String Query = "SELECT \n"
            +"          CONCAT('O Vendedor ID ',\n"
            +"                    vendors.VendorID,\n"
            +"                    ' nome: ',\n"
            +"                    vendors.VendName,\n"
            +"                     ' ',\n"
            +"                    'mora no endereço: ',\n"
            +"                    Vendors.VendStreetAddress,\n"
            +"                    ' Realizou a venda Total: $ ',\n "
            +"                   SUM(product_vendors.WholesalePrice)) AS Relatorio\n"
            +   "FROM\n"
            +"   vendors\n"
            +"       JOIN\n"
            +" product_vendors ON vendors.VendorID = product_vendors.VendorID\n"
            +"WHERE\n "
            +"     product_vendors.VendorID = '" + VendID.getText()+"';";

            ResultSet rs = stmt.executeQuery(Query);
            while(rs.next()){
                infor = rs.getString(1);
            }
            String file_name = path + "\\" + VendID.getText()+VendName.getText()+".pdf";

            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(file_name));
            doc.open();
            Paragraph pa = new Paragraph (infor);
            doc.add(pa);
            doc.close();
            System.out.println("Save complete");

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void VendNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendNumActionPerformed

    private void VendIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VendID;
    private javax.swing.JTextField VendName;
    private javax.swing.JTextField VendNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
