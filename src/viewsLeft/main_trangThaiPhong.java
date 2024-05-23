/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewsLeft;

import connectDatabase.ConnectDB;
import java.util.List;
import model.*;
import staticModify.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import viewsLeft.*;
import viewsTop.*;

/**
 *
 * @author DELL
 */
public class main_trangThaiPhong extends javax.swing.JFrame {

    /**
     * Creates new form main_taiKhoan
     */
    ConnectDB con = new ConnectDB();
    Connection conn;
    DefaultTableModel tableModel;
    String txtTrangThai = "";
    List<tinhTrangPhong> list = new ArrayList<>();

    public main_trangThaiPhong(String username) {
        initComponents();
        txt_TaiKhoan.setText(username);
        tableModel = (DefaultTableModel) tblTrangThaiPhong.getModel();
    }

    public main_trangThaiPhong() {
        initComponents();
        txt_TaiKhoan.setText(staticModify.userName);
        tableModel = (DefaultTableModel) tblTrangThaiPhong.getModel();
        showTrangThaiPhong();
    }

    public void showTrangThaiPhong() {
        if (cbTrangThai.getSelectedIndex() == 0) {
            txtTrangThai = "trong";
        } else if (cbTrangThai.getSelectedIndex() == 1) {
            txtTrangThai = "dat";
        } else if (cbTrangThai.getSelectedIndex() == 2) {
            txtTrangThai = "hen";
        }
        tinhTrangPhong test = new tinhTrangPhong();
        list = test.findAll(txtTrangThai);

        tableModel.setRowCount(0); // Đặt lại số hàng là 0 (xóa tất cả dữ liệu)

        list.forEach((trPhong) -> {
            tableModel.addRow(new Object[]{/*tableModel.getRowCount() + 1*/
                trPhong.getMaPhong(), trPhong.getNgay(), trPhong.getTinhTrang()});
        });
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
        btnTaiKhoan = new javax.swing.JButton();
        btnPhong = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnTrangThaiPhong = new javax.swing.JButton();
        btnDatPhong = new javax.swing.JButton();
        btnDkdv = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txt_TaiKhoan = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrangThaiPhong = new javax.swing.JTable();
        lbTrangThai = new javax.swing.JLabel();
        cbTrangThai = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnAUL = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRẠNG THÁI PHÒNG THEO NGÀY");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tài khoản:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 76, 80, 20));

        jLabel4.setBackground(new java.awt.Color(20, 56, 20));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rsz_xd.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 220, 200));

        btnTaiKhoan.setText("Tài Khoản");
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 110, -1));

        btnPhong.setText("Phòng");
        btnPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongActionPerformed(evt);
            }
        });
        getContentPane().add(btnPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 110, -1));

        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        getContentPane().add(btnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 110, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 130, -1));

        btnKhachHang.setText("Khách Hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        getContentPane().add(btnKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 110, -1));

        btnTrangThaiPhong.setText("Trạng thái phòng theo ngày");
        btnTrangThaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangThaiPhongActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrangThaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, -1));

        btnDatPhong.setText("Đặt phòng");
        btnDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatPhongActionPerformed(evt);
            }
        });
        getContentPane().add(btnDatPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 220, -1));

        btnDkdv.setText("Đặt đồ ăn / đồ uống");
        btnDkdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDkdvActionPerformed(evt);
            }
        });
        getContentPane().add(btnDkdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 220, -1));

        btnThongKe.setText("Báo cáo - Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        getContentPane().add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 220, -1));

        btnLogout.setText("Đăng xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 220, -1));

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 220, -1));

        txt_TaiKhoan.setAlignmentX(1.0F);
        txt_TaiKhoan.setAutoscrolls(false);
        txt_TaiKhoan.setPreferredSize(new java.awt.Dimension(120, 22));
        txt_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TaiKhoanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblTrangThaiPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Ngày", "Tình trạng"
            }
        ));
        jScrollPane1.setViewportView(tblTrangThaiPhong);

        lbTrangThai.setText("Trạng thái:");

        cbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trống", "Đặt", "Hẹn" }));
        cbTrangThai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTrangThaiItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("TRẠNG THÁI PHÒNG THEO NGÀY:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbTrangThai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTrangThai)
                    .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, 500));

        btnAUL.setText("Đồ ăn / Đồ uống / Loại Phòng");
        btnAUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAULActionPerformed(evt);
            }
        });
        getContentPane().add(btnAUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/green.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 640));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 640));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 640));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TaiKhoanActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        // TODO add your handling code here:
        new main_taiKhoan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongActionPerformed
        // TODO add your handling code here:
        new main_phong().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPhongActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        new main_nhanVien().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        new main_khachHang().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnTrangThaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangThaiPhongActionPerformed
        // TODO add your handling code here:
        new main_trangThaiPhong().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangThaiPhongActionPerformed

    private void btnDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatPhongActionPerformed
        // TODO add your handling code here:
        new main_datPhong().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDatPhongActionPerformed

    private void btnDkdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDkdvActionPerformed
        // TODO add your handling code here:
        new main_DkDichVu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDkdvActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        new main_thongKe().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new LoginForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        staticModify.refresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAULActionPerformed
        // TODO add your handling code here:
        new main_AUL().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAULActionPerformed

    private void cbTrangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTrangThaiItemStateChanged
        // TODO add your handling code here:
        showTrangThaiPhong();
    }//GEN-LAST:event_cbTrangThaiItemStateChanged

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
            java.util.logging.Logger.getLogger(main_trangThaiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_trangThaiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_trangThaiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_trangThaiPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new main_trangThaiPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAUL;
    private javax.swing.JButton btnDatPhong;
    private javax.swing.JButton btnDkdv;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhong;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTrangThaiPhong;
    private javax.swing.JComboBox<String> cbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTrangThai;
    private javax.swing.JTable tblTrangThaiPhong;
    private javax.swing.JTextField txt_TaiKhoan;
    // End of variables declaration//GEN-END:variables
}