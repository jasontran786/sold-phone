/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlchdt.view;

import com.qlchdt.view.ThongKeDoanhThu;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ThongKe extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienHeThong
     */
    public ThongKe() {
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

        btnGroupThongKe = new javax.swing.ButtonGroup();
        HeThong = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnNhanVien = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnDoanhThu = new javax.swing.JButton();
        btnKho = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panelThongKe = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelTongKet = new javax.swing.JLabel();
        btnSanPham = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeThong.setBackground(new java.awt.Color(255, 255, 255));
        HeThong.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Doanh thu");
        HeThong.add(jLabel3);
        jLabel3.setBounds(170, 60, 70, 16);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Nhân Viên");
        HeThong.add(jLabel25);
        jLabel25.setBounds(370, 60, 80, 16);

        btnNhanVien.setBackground(new java.awt.Color(189, 214, 218));
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/tồn kho.jpg"))); // NOI18N
        btnNhanVien.setText("jButton12");
        btnNhanVien.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 214, 218), 0, true));
        btnGroupThongKe.add(btnNhanVien);
        btnNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        HeThong.add(btnNhanVien);
        btnNhanVien.setBounds(390, 10, 50, 50);

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel20.setText("                      Chức năng");
        HeThong.add(jLabel20);
        jLabel20.setBounds(0, 185, 150, 20);

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel19.setText("                      Danh mục");
        HeThong.add(jLabel19);
        jLabel19.setBounds(0, 145, 150, 20);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Đăng xuất");
        HeThong.add(jLabel15);
        jLabel15.setBounds(670, 60, 90, 16);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Thoát");
        HeThong.add(jLabel17);
        jLabel17.setBounds(790, 60, 50, 16);

        jButton5.setBackground(new java.awt.Color(189, 214, 218));
        jButton5.setForeground(new java.awt.Color(189, 214, 218));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/login_icon.jpg"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 214, 218), 0, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        HeThong.add(jButton5);
        jButton5.setBounds(690, 0, 50, 70);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/logo.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        HeThong.add(jLabel11);
        jLabel11.setBounds(0, 20, 150, 40);

        btnDoanhThu.setBackground(new java.awt.Color(189, 214, 218));
        btnDoanhThu.setForeground(new java.awt.Color(189, 214, 218));
        btnDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/doanhthu.jpg"))); // NOI18N
        btnDoanhThu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 214, 218), 1, true));
        btnGroupThongKe.add(btnDoanhThu);
        btnDoanhThu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoanhThu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoanhThu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });
        HeThong.add(btnDoanhThu);
        btnDoanhThu.setBounds(180, 0, 50, 60);

        btnKho.setBackground(new java.awt.Color(189, 214, 218));
        btnKho.setForeground(new java.awt.Color(189, 214, 218));
        btnKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/loinhuan.jpg"))); // NOI18N
        btnKho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 214, 218), 1, true));
        btnGroupThongKe.add(btnKho);
        btnKho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoActionPerformed(evt);
            }
        });
        HeThong.add(btnKho);
        btnKho.setBounds(300, 10, 30, 50);

        jButton6.setBackground(new java.awt.Color(189, 214, 218));
        jButton6.setForeground(new java.awt.Color(189, 214, 218));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/exit_icon.jpg"))); // NOI18N
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 214, 218), 0, true));
        HeThong.add(jButton6);
        jButton6.setBounds(790, 0, 50, 70);

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel18.setText("                      Hệ thống");
        HeThong.add(jLabel18);
        jLabel18.setBounds(0, 100, 150, 20);

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("                      Thống kê");
        HeThong.add(jLabel21);
        jLabel21.setBounds(0, 220, 150, 20);

        jButton7.setBackground(new java.awt.Color(189, 214, 218));
        jButton7.setForeground(new java.awt.Color(189, 214, 218));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/system_icon.jpg"))); // NOI18N
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 214, 218), 0, true));
        HeThong.add(jButton7);
        jButton7.setBounds(0, 90, 150, 40);

        jButton8.setBackground(new java.awt.Color(189, 214, 218));
        jButton8.setForeground(new java.awt.Color(189, 214, 218));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/list_icon.jpg"))); // NOI18N
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 214, 218), 0, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        HeThong.add(jButton8);
        jButton8.setBounds(0, 140, 150, 30);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/function_icon.jpg"))); // NOI18N
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 214, 218), 0, true));
        HeThong.add(jButton9);
        jButton9.setBounds(0, 180, 150, 30);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/statistical_icon.jpg"))); // NOI18N
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 214, 218), 0, true));
        HeThong.add(jButton10);
        jButton10.setBounds(0, 210, 150, 40);

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel22.setText("                      Trợ giúp");
        HeThong.add(jLabel22);
        jLabel22.setBounds(0, 255, 150, 20);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/support_icon.jpg"))); // NOI18N
        jButton11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 214, 218), 0, true));
        HeThong.add(jButton11);
        jButton11.setBounds(0, 250, 150, 30);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Kho");
        HeThong.add(jLabel12);
        jLabel12.setBounds(270, 60, 80, 16);

        jLabel4.setBackground(new java.awt.Color(189, 214, 218));
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(177, 191, 188), 1, true));
        jLabel4.setOpaque(true);
        HeThong.add(jLabel4);
        jLabel4.setBounds(670, 0, 190, 90);

        jLabel5.setBackground(new java.awt.Color(189, 214, 218));
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(177, 191, 188), 1, true));
        jLabel5.setOpaque(true);
        HeThong.add(jLabel5);
        jLabel5.setBounds(0, 90, 150, 600);

        jLabel23.setText("jLabel23");
        HeThong.add(jLabel23);
        jLabel23.setBounds(720, 60, 70, 16);

        panelThongKe.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(120, 161, 178));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(" Giới Thiệu");
        jLabel9.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(153, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/background_giaodien.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PHẦN MỀM QUẢN LÝ CỬA HÀNG ĐIỆN THOẠI DI ĐỘNG");

        javax.swing.GroupLayout panelThongKeLayout = new javax.swing.GroupLayout(panelThongKe);
        panelThongKe.setLayout(panelThongKeLayout);
        panelThongKeLayout.setHorizontalGroup(
            panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongKeLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelThongKeLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelThongKeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelThongKeLayout.setVerticalGroup(
            panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongKeLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelThongKeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        HeThong.add(panelThongKe);
        panelThongKe.setBounds(150, 90, 1060, 510);

        labelTongKet.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        labelTongKet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeThong.add(labelTongKet);
        labelTongKet.setBounds(150, 616, 1060, 60);

        btnSanPham.setBackground(new java.awt.Color(102, 255, 102));
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/account_icon.jpg"))); // NOI18N
        btnSanPham.setText("Sản Phẩm");
        btnGroupThongKe.add(btnSanPham);
        btnSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        HeThong.add(btnSanPham);
        btnSanPham.setBounds(460, 10, 110, 80);

        jLabel1.setBackground(new java.awt.Color(189, 214, 218));
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(177, 191, 188), 1, true));
        jLabel1.setOpaque(true);
        HeThong.add(jLabel1);
        jLabel1.setBounds(0, 0, 1210, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeThong, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeThong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoActionPerformed
        // TODO add your handling code here:
        for (Component com : this.panelThongKe.getComponents()) {
            com.setVisible(false);
        }
        ThongKeKho tkk = new ThongKeKho();
        this.panelThongKe.setLayout(new CardLayout());
        this.panelThongKe.add(tkk);
        int sanPhamConLai = tkk.getSoLuongSanPham()-tkk.getSoLuongSanPhamBan();
        this.labelTongKet.setText("Sản Phẩm Bán Được: " + tkk.getSoLuongSanPhamBan()+".            Sản Phẩm: " + tkk.getSoLuongSanPham() + 
                ".                Sản Phẩm Còn Lại: " + sanPhamConLai);
    }//GEN-LAST:event_btnKhoActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        // TODO add your handling code here:
        for (Component com : this.panelThongKe.getComponents()) {
            com.setVisible(false);
        }
        ThongKeDoanhThu tkdt = new ThongKeDoanhThu();
        this.panelThongKe.setLayout(new CardLayout());
        this.panelThongKe.add(tkdt);
        this.labelTongKet.setText("Tổng Doanh Thu: " + tkdt.getTongDoanhThu() +" triệu.            Số Lượng Hóa Đơn: " + tkdt.getSoLuongHoaDon());
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        for (Component com : this.panelThongKe.getComponents()) {
            com.setVisible(false);
        }
        ThongKeNhanVien tknv = new ThongKeNhanVien();
        this.panelThongKe.setLayout(new CardLayout());
        this.panelThongKe.add(tknv);
        this.labelTongKet.setText("Tổng Doanh Thu: " + tknv.getTongDoanhThu() +" triệu.            Số Lượng Hóa Đơn: " + tknv.getSoLuong());
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        for (Component com : this.panelThongKe.getComponents()) {
            com.setVisible(false);
        }
        ThongKeSanPham tksp = new ThongKeSanPham();
        this.panelThongKe.setLayout(new CardLayout());
        this.panelThongKe.add(tksp);
        this.labelTongKet.setText("");
    }//GEN-LAST:event_btnSanPhamActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeThong;
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.ButtonGroup btnGroupThongKe;
    private javax.swing.JButton btnKho;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelTongKet;
    private javax.swing.JPanel panelThongKe;
    // End of variables declaration//GEN-END:variables
}