/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.chqldt.view.HeThong;
import com.qlchdt.model.TaiKhoan;
import com.qlchdt.service.DocFile;
import com.qlchdt.service.TaiKhoanService;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap1
     */
    TaiKhoanService tks = new TaiKhoanService();
    HeThong ht= new HeThong();
    public DangNhap() {
        super("Đăng nhập hệ thống");
        this.setLocationRelativeTo(null);
        initComponents();
        String text = new DocFile(saveFileName).read();
        if (!text.equals("")) {
            try {
                txtuser.setText(text.split(" ")[0]);
                txtpass.setText(text.split(" ")[1]);
                checkrem.setSelected(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi Giữ đăng nhập");
            }
        }
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
        rSButtonMetro1 = new rojerusan.RSButtonMetro();
        rSButtonMetro2 = new rojerusan.RSButtonMetro();
        checkrem = new javax.swing.JCheckBox();
        txtuser = new rojeru_san.RSMTextFull();
        txtpass = new rojeru_san.RSMPassView();
        rSPanelImage1 = new rojerusan.RSPanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Mật khẩu");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Tài khoản");

        rSButtonMetro1.setText("Đăng nhập");
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });

        rSButtonMetro2.setText("Đóng");
        rSButtonMetro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro2ActionPerformed(evt);
            }
        });

        checkrem.setText("Ghi nhớ tài khoản và mật khẩu");
        checkrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkremActionPerformed(evt);
            }
        });

        txtuser.setPlaceholder("Nhập tài khoản");

        txtpass.setPlaceholder("Nhập mật khẩu");
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/lock_login.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkrem)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkrem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonMetro2ActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
       String user=txtuser.getText();
       String pass=txtpass.getText();
//       if(user.length()==0 || pass.length()==0)
//       {
//           JOptionPane.showMessageDialog(null,"Chưa nhập thông tin","Thông báo",1);
//       }
       if( tks.kiemtraLogin(user, pass)>=0)
       {   
           JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
           this.setVisible(false);
           ht.setVisible(true);
           if(checkrem.isSelected())
           {
               // mã hóa ra tiếng trung
               new DocFile(saveFileName).write(user+" "+pass);
           }
           else
           {
               new DocFile(saveFileName).write(" ");
           }
       }
       else{
          JOptionPane.showMessageDialog(null, "Đăng nhập thất bại");
          txtuser.setText("");
          txtpass.setText("");
       }
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void checkremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkremActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkremActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DangNhap().setVisible(true);
//                new DangNhap().rSButtonMetro1ActionPerformed(evt);
//                System.out.println( tks.getTaiKhoan(txtuser.getText(), txtpass.getText()));
            }
        });
    }
 public static String saveFileName = "temps";
 public static TaiKhoan taiKhoanLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkrem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSButtonMetro rSButtonMetro1;
    private rojerusan.RSButtonMetro rSButtonMetro2;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojeru_san.RSMPassView txtpass;
    private rojeru_san.RSMTextFull txtuser;
    // End of variables declaration//GEN-END:variables
}
