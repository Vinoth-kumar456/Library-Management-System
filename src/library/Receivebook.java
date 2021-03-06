package library;

/*
 * ReceiveBook.java
 *
 * Created on August 19, 2012, 11:12 PM
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author  Administrator
 */
public class Receivebook extends javax.swing.JFrame {
    
    /** Creates new form ReceiveBook */
    public Receivebook() {
        initComponents();
           this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
     
        this.setTitle("Receive Book");
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        details = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        CmdReset = new javax.swing.JButton();
        receivebook = new javax.swing.JButton();
        CmdClose = new javax.swing.JButton();
        book = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LblBookID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Receive Book");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("Member ID :");

        details.setText("Details");
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });

        jLabel2.setText("Name :");

        name.setEditable(false);

        CmdReset.setText("Reset");
        CmdReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdResetActionPerformed(evt);
            }
        });

        receivebook.setText("Receive Book");
        receivebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receivebookActionPerformed(evt);
            }
        });

        CmdClose.setText("Close");
        CmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCloseActionPerformed(evt);
            }
        });

        book.setEditable(false);

        jLabel4.setText("Book :");

        LblBookID.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        LblBookID.setForeground(java.awt.Color.lightGray);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(65, 71, Short.MAX_VALUE)
                        .addComponent(CmdReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(receivebook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmdClose))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblBookID)
                            .addComponent(book, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(details, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(details))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(53, 53, 53)
                .addComponent(LblBookID)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdReset)
                    .addComponent(receivebook)
                    .addComponent(CmdClose))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
        
        
        try{ 
            Mainclass mc=new Mainclass();
            
             //open connection
            Connection connection;
            connection=DriverManager.getConnection(mc.mydb,mc.uname,mc.upass);
            String str="";
            str="select member,book from transactions where memid =? ";
            PreparedStatement pst=connection.prepareStatement(str);
            pst.setString(1,id.getText());
           

           ResultSet rs;
           rs=pst.executeQuery();
           if (rs.next())
           {
                name.setText(rs.getString("member"));     
                book.setText(rs.getString("book"));

           }
           connection.close();
        }catch (Exception e)
        {
            System.err.println(e);
           
        }
 

        
 
        
    }//GEN-LAST:event_detailsActionPerformed

    private void CmdResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdResetActionPerformed
        ClearText();
    }//GEN-LAST:event_CmdResetActionPerformed

    private void receivebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivebookActionPerformed
          
        
        
//        int[] columns = jtable.getSelectedColumns();
//TableModel model = jtable.getModel();
//int rowcount = model.getRowCount();
//String[][] output = new String[columns.length][rowcount];
//for (int i = 0; i < columns.length; i++)
//    for (int row = 0; row < rowcount; row++){
//        int column = jtable.convertColumnIndexToModel(columns[i]);
//        output[i][row] = model.getValueAt(row, column).toString();
        
        
            if (id.getText().trim().length()==0 ) {
                JOptionPane.showMessageDialog(null,"Enter member id.");
                return;
            }

             try {
            Mainclass mc=new Mainclass();
            Connection connection;
            connection=DriverManager.getConnection(mc.mydb,mc.uname,mc.upass);
            String  sq = "update books set status ='Available' where title = ?";
            PreparedStatement pst=connection.prepareStatement(sq);
            pst.setString(1, book.getText());
            pst.addBatch();
            pst.executeUpdate();          
     
            
            String sql = "update  transactions set rec_date = current_date where member= ?";  //" and rec_date is null and  book=" + book.getText();
            pst=connection.prepareStatement(sql);
            pst.setString(1, name.getText());
            pst.addBatch();
            pst.executeBatch();
            
            
            pst.executeUpdate();
                   System.out.println("vino");
            connection.close();
            JOptionPane.showMessageDialog(null,"Book Received");
             }catch(Exception w)
             { System.out.println(w);}
            
//        
}//GEN-LAST:event_receivebookActionPerformed
    
    private void ClearText()
    {
        id.setText("");
        name.setText("");
        book.setText("");

         }
    private void CmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CmdCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               ClearText();
        this.setLocationRelativeTo(null);
        receivebook.setEnabled(true);
        rootPane.setDefaultButton(details);
     
    }//GEN-LAST:event_formWindowOpened
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receivebook().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdClose;
    private javax.swing.JButton CmdReset;
    private javax.swing.JLabel LblBookID;
    private javax.swing.JTextField book;
    private javax.swing.JButton details;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name;
    private javax.swing.JButton receivebook;
    // End of variables declaration//GEN-END:variables
    
}
