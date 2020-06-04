/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlchdt.view.QuanLy;

import com.qlchdt.service.KhachHangService;
import com.qlchdt.service.format.NhapExcel;
import com.qlchdt.service.format.XuatExcel;
import com.qlchdt.view.HienThiForm.HienThiKhachHang;
import com.qlchdt.view.ThemSua.ThemSuaKhachHang;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class QuanLyKhachHang extends javax.swing.JPanel {
    
    HienThiKhachHang formHienThi = new HienThiKhachHang();
    

    public QuanLyKhachHang() {
        initComponents();
        plKhachHang.add(formHienThi);
    }
    //xóa
    private void btnXoaMouseClicked() {
        String makh = formHienThi.getSelectedRow(1);
        if (makh != null) {
            KhachHangService khachHangService = new KhachHangService();
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn khách hàng " + makh + " ?",
                    "Chú ý", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                khachHangService.delete(makh);
                formHienThi.refresh();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Chưa chọn khách hàng nào để xóa");
        }
    }
    //sửa

    private void btnSuaMouseClicked() {
        String makh = formHienThi.getSelectedRow(1);
        if (makh != null) {
            ThemSuaKhachHang suakh = new ThemSuaKhachHang("Sửa", makh);

            // https://stackoverflow.com/questions/4154780/jframe-catch-dispose-event
            suakh.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                   formHienThi.refresh();
                }
            });

        } else {
            JOptionPane.showMessageDialog(null, "Chưa chọn khách hàng nào để sửa");
        }
    }

    //thêm
    private void btnThemMouseClicked() {
        ThemSuaKhachHang themkh = new ThemSuaKhachHang("Thêm", "");
        themkh.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                formHienThi.refresh();
            }
        });
        System.out.println("Đã nhấn nút thêm ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        plKhachHang = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1115, 80));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/icons8_add_30px.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(140, 40));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/icons8_delete_forever_30px_1.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(140, 40));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/icons8_support_30px.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setPreferredSize(new java.awt.Dimension(140, 40));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/excel.png"))); // NOI18N
        jButton1.setText("Nhập Excel");
        jButton1.setPreferredSize(new java.awt.Dimension(140, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchdt/assets/excel.png"))); // NOI18N
        jButton2.setText("Xuất Excel");
        jButton2.setPreferredSize(new java.awt.Dimension(140, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        plKhachHang.setLayout(new java.awt.CardLayout());
        jPanel2.add(plKhachHang, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       btnSuaMouseClicked();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        btnThemMouseClicked();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        btnXoaMouseClicked();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            new XuatExcel().xuatFileExcelKhachHang();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new NhapExcel().docFileExcelKhachhang();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel plKhachHang;
    // End of variables declaration//GEN-END:variables
}