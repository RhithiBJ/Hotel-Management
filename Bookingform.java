import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import java.util.*;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gurua
 */
public class Bookingform extends javax.swing.JFrame{
    /**
     * Creates new form Bookingform
     */
    public Bookingform() {
        
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
            JOptionPane.showMessageDialog(null,"Connected");        
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
          JOptionPane.showMessageDialog(null,"Not Connected");
        }

    }
    public Bookingform(String msg){
        initComponents();
        login1.setText(msg);
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        login1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("YOUR BOOKING DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 440, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setText("Checkin");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setText("Checkout");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 20));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel6.setText("Roomtype");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, -1));

        c1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "Luxury", "Suite", "Normal with AC", "Normal with Non AC" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 220, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel7.setText("Cotsize");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 110, -1));
        jLabel7.getAccessibleContext().setAccessibleName("");

        jComboBox2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "Single ", "Double", " " }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 160, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel8.setText("Roomcount");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, -1));

        c3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 160, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 160, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 160, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel9.setText("Amenities");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setText("Games");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel11.setText("Food");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        t1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 522, 630, 40));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jButton1.setLabel("BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, -1, 40));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 50, 50));
        getContentPane().add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 16, 250, 40));

        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setLabel(" view the room types");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 160, 30));

        jButton4.setForeground(new java.awt.Color(255, 0, 51));
        jButton4.setLabel(" Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 532, 70, 30));

        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setLabel("view the amenities");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 390, 130, -1));

        jButton5.setForeground(new java.awt.Color(255, 0, 51));
        jButton5.setLabel("view the games");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, 140, -1));

        t3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 640, 40));

        t4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 640, 40));

        jButton6.setText("click to go to next page");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 260, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 320, 40));
        jLabel13.getAccessibleContext().setAccessibleName("jLabel3");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setText("book id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 120, 40));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 250, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jLabel13.setText("");
        if(t3.getText().equals("")){
            jLabel13.setText("*fill the requried fields");
        }
        if(t1.getText().equals("")){
             jLabel13.setText("*fill the requried fields");
        }
        if(t4.getText().equals("")){
             jLabel13.setText("*fill the requried fields");
        }
        try 
        {
            //jLabel13.setText("");
            int flag=0;
            //int count=0;
          // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
            Statement stmt = con.createStatement(); 
            // Inserting data in database       
            String q1 = "insert into book values('"+login1.getText()+"','"+c1.getItemAt(c1.getSelectedIndex())+"','"+c3.getItemAt(c3.getSelectedIndex())+"','"+t4.getText()+"','"+t3.getText()+"','"+t1.getText()+"')";
            //String q2 = "UPDATE roomavailability SET Reserved = '" + c3.getItemAt(c3.getSelectedIndex()) + "' WHERE Roomtype = '" +c1.getItemAt(c1.getSelectedIndex()) + "'";
            //String q3="UPDATE roomavailability SET availability = 'avail' WHERE Roomtype='"+c1.getItemAt(c1.getSelectedIndex())+"'";
            stmt.executeUpdate(q1);
            ResultSet rs=stmt.executeQuery("SELECT * from `roomavailability`");
            while(rs.next())
            {
                if(!rs.getString(2).equals(rs.getString(3)) && rs.getInt(3)< rs.getInt(2))
                {
                   if(rs.getString(1).equals(c1.getItemAt(c1.getSelectedIndex())))
                    {
                    int res=rs.getInt(3)+Integer.valueOf(c3.getItemAt(c3.getSelectedIndex()));
                    String q2="UPDATE roomavailability SET Reserved='"+res+"' WHERE Roomtype='"+c1.getItemAt(c1.getSelectedIndex())+"'";
                    Statement stmt3=con.createStatement();
                    stmt3.executeUpdate(q2);
                    int avail=rs.getInt(2)-res;
                    String q3="UPDATE roomavailability SET Available='"+avail+"' WHERE Roomtype='"+c1.getItemAt(c1.getSelectedIndex())+"'";
                    Statement stmt2=con.createStatement();
                    stmt2.executeUpdate(q3);
                    
                     JOptionPane.showMessageDialog(null,"Updated");
                    
                     } 
                   flag=1;
                }
                
                if(flag==0)
                {
                    JOptionPane.showMessageDialog(null,"All Rooms are reserved"); 
                    //jLabel13.setText("");
                    
                }
                /*if(rs.getString(1).equals(c1.getItemAt(c1.getSelectedIndex())))
                {
                    int res=rs.getInt(3)+Integer.valueOf(c3.getItemAt(c3.getSelectedIndex()));
                    String q2="UPDATE roomavailability SET Reserved='"+res+"' WHERE Roomtype='"+c1.getItemAt(c1.getSelectedIndex())+"'";
                    Statement stmt3=con.createStatement();
                    stmt3.executeUpdate(q2);
                    int avail=rs.getInt(2)-res;
                    String q3="UPDATE roomavailability SET Available='"+avail+"' WHERE Roomtype='"+c1.getItemAt(c1.getSelectedIndex())+"'";
                    Statement stmt2=con.createStatement();
                    stmt2.executeUpdate(q3);
                }*/
            }
            //JOptionPane.showMessageDialog(null,"Inserted");
            //stmt.executeUpdate(q2);
            //JOptionPane.showMessageDialog(null,"Updated");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         /*try 
        {
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
            Statement stmt = con.createStatement(); 
            // Inserting data in database       
                     
            String q2 = "UPDATE roomavailability set Reserved = '" + c3.getItemAt(c3.getSelectedIndex()) + "' WHERE Room type = '" +c1.getItemAt(c1.getSelectedIndex()) + "'";
            stmt.executeUpdate(q2);
            JOptionPane.showMessageDialog(null,"Updated");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Roomtype().setVisible(true);
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Food().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Amenities().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Games().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       // new Payment().setVisible(true);
        Payment p=new Payment();
        p.setVisible(true);
        p.t1.setText(login1.getText());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

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
            java.util.logging.Logger.getLogger(Bookingform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookingform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookingform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookingform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> 
        {
            new Bookingform().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel login1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
