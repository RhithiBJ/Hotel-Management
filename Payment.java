
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gurua
 */
public class Payment extends javax.swing.JFrame {

   
    private static Object JTable2;


   

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        //DefaultTableModel mod =(DefaultTableModel)jTable2.getModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Login_Id", "Room type", "Room count", "Amenities", "Games", "Food"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowHeight(100);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 40, 613, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setLabel("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 12, 140, -1));
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 51, 190, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login_Id");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 53, 83, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Roomtype");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 107, 90, -1));
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 107, 190, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Room count");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 160, 110, -1));
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 160, 190, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amenities");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 218, 110, -1));
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 216, 190, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Games");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 276, 110, -1));
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 274, 190, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Food");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 338, 110, -1));
        jPanel2.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 336, 190, -1));

        jButton2.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("VIEW BILL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 412, 146, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1041, 12, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\gurua\\OneDrive\\Pictures\\e7.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 700));

        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try
        {
            DefaultTableModel d=(DefaultTableModel)jTable2.getModel();
            int c=d.getRowCount();
            int j;
            for(j=c-1;j>=0;j--)
            {
                d.removeRow(j);
            }
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
        Statement stmt = con.createStatement();
        String sq1="select * from book";
        ResultSet rs= stmt.executeQuery(sq1);
        while(rs.next()){
            if(rs.getString(1).equals(t1.getText()))
            {
            String id=rs.getString("Loginid");
            String type=rs.getString("roomtype");
            String rcount=String.valueOf(rs.getInt("roomcount"));
            String amenities=rs.getString("amenities");
            String games=rs.getString("games");
            String food=rs.getString("food");
            
            String tbdata[]={id,type,rcount,amenities,games,food};
            DefaultTableModel tblModel=(DefaultTableModel)jTable2.getModel();
            tblModel.addRow(tbdata);
            }
        }
        con.close();
        }
        catch(Exception e)
        {
        
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row=jTable2.getSelectedRow();
        DefaultTableModel  model=(DefaultTableModel)jTable2.getModel();
        t1.setText(model.getValueAt(row,0).toString());
        t2.setText(model.getValueAt(row,1).toString());
        t3.setText(model.getValueAt(row,2).toString());
        t4.setText(model.getValueAt(row,3).toString());
        t5.setText(model.getValueAt(row,4).toString());
        t6.setText(model.getValueAt(row,5).toString());
        /*String msg=t1.getText();
        new Bill(msg).setVisible(true);
        setVisible(false);
        String msg2=t2.getText();
        new Bill(msg2).setVisible(true);
        setVisible(false);
        String msg3=t3.getText();
        new Bill(msg3).setVisible(true);
        setVisible(false);
        String msg4=t4.getText();
        new Bill(msg4).setVisible(true);
        setVisible(false);
        String msg5=t5.getText();
        new Bill(msg5).setVisible(true);
        setVisible(false);
        String msg6=t6.getText();
        new Bill(msg6).setVisible(true);
        setVisible(false);*/
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        /*new Bill().setVisible(true);
        Bill b=new Bill();
        b.id.setText(t1.getText());
        b.rt.setText(t2.getText());
        b.rc.setText(t3.getText());
        b.am.setText(t4.getText());
        b.gm.setText(t5.getText());
        b.fd.setText(t6.getText());
        b.jLabel7.setText(t6.getText());*/
        String msg=t1.getText();
        
        String msg2=t2.getText();
        
        String msg3=t3.getText();
        
        String msg4=t4.getText();
        
        String msg5=t5.getText();
        
        String msg6=t6.getText();
        new Bill(msg,msg2,Integer.valueOf(msg3),msg4,msg5,msg6).setVisible(true);
        setVisible(false);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Payment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private static javax.swing.JTable jTable2;
    public javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
