/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.chitiethoadonDAO;
import DAO.hoadonDAO;
import DAO.sachDAO;
import DTO.sachDTO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author thanh
 */
public class order extends javax.swing.JFrame {

    /**
     * Creates new form order
     */
    public order() {
        initComponents();
        showTable();
          td.add("Mã sách");
        td.add("Tên sách");
        td.add("Số lượng");
        td.add("Giá bán");
        td.add("Thành tiền");
        tbl_Order.setModel(new DefaultTableModel(cthd, td));
    }
    
    Vector cthd = new Vector();
    Vector td = new Vector();
    static DefaultTableModel dmtModel;
    private void showTable(){
        ArrayList<sachDTO> ds = sachDAO.lstSach();
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("Mã sách");
        tb.addColumn("Tên sách");
        tb.addColumn("Tác giả");
        tb.addColumn("Số lượng");
        tb.addColumn("Giá");
        tb.setNumRows(ds.size());
        
        for(int i = 0 ; i < ds.size(); i++){
            sachDTO ls = ds.get(i);
            tb.setValueAt(ls.getMaSach(), i, 0);
            tb.setValueAt(ls.getTenSach(), i, 1);
            tb.setValueAt(ls.getTacGia(), i, 2);
            tb.setValueAt(ls.getSoLuong(), i, 3);
            tb.setValueAt(ls.getGia(), i, 4);
        }
        this.tbl_SanPham.setModel(tb);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SanPham = new javax.swing.JTable();
        btnThemVaoGioHang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Order = new javax.swing.JTable();
        btnXoaKhoiGioHang = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        txtTongThanhTien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnTangSoLuong = new javax.swing.JButton();
        btnGiamSoLuong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tbl_SanPham.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tbl_SanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_SanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_SanPham);

        btnThemVaoGioHang.setBackground(new java.awt.Color(0, 204, 204));
        btnThemVaoGioHang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnThemVaoGioHang.setText("Thêm");
        btnThemVaoGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGioHangActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Số lượng");

        txtSoLuong.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        txtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnTimKiem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemVaoGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemVaoGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tên khách hàng");

        txtTenKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        tbl_Order.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tbl_Order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_Order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_OrderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_Order);

        btnXoaKhoiGioHang.setBackground(new java.awt.Color(204, 255, 255));
        btnXoaKhoiGioHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoaKhoiGioHang.setText("Xóa sản phẩm khỏi giỏ hàng");
        btnXoaKhoiGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhoiGioHangActionPerformed(evt);
            }
        });

        btnThanhToan.setBackground(new java.awt.Color(0, 153, 153));
        btnThanhToan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        txtTongThanhTien.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tổng tiền hóa đơn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtTenKhachHang)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoaKhoiGioHang)
                .addGap(140, 140, 140))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaKhoiGioHang)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        btnTangSoLuong.setBackground(new java.awt.Color(0, 102, 255));
        btnTangSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTangSoLuong.setText("^");
        btnTangSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangSoLuongActionPerformed(evt);
            }
        });

        btnGiamSoLuong.setBackground(new java.awt.Color(0, 102, 255));
        btnGiamSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGiamSoLuong.setText("V");
        btnGiamSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamSoLuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTangSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGiamSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnTangSoLuong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGiamSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int masach;
    int soluong;
    String tensach = null;
    String tacgia;
    float gia;
    
    private void tbl_SanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SanPhamMouseClicked
        int i = tbl_SanPham.getSelectedRow();
        TableModel model = tbl_SanPham.getModel();
        masach = Integer.parseInt(model.getValueAt(i, 0).toString());
        tensach =  model.getValueAt(i, 1).toString();
        tacgia = model.getValueAt(i, 2).toString();
        soluong = Integer.parseInt(model.getValueAt(i, 3).toString());
        gia = Float.parseFloat(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_tbl_SanPhamMouseClicked

    private void btnThemVaoGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGioHangActionPerformed

        if(tensach == null){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách và nhập số lượng");
        }
        else if(Integer.parseInt(txtSoLuong.getText()) < 0 || Integer.parseInt(txtSoLuong.getText()) > soluong){
            JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0 và bé hơn số lượng trong kho!");
        }
        else{
            boolean check = false;

            //int i = tbl_Order.getSelectedRow();
            TableModel model = tbl_Order.getModel();
            int count = tbl_Order.getRowCount();
            for(int j = 0; j < count; j++){
                int idsach = Integer.parseInt(model.getValueAt(j, 0).toString());
                int sl = Integer.parseInt(model.getValueAt(j, 2).toString());                  

                if(idsach == masach){
                    check = true;
                    int slNew = sl + Integer.parseInt(txtSoLuong.getText());
                    model.setValueAt(slNew, j, 2);  
                    break;
                }                   
        }
        if(check == false){
            int soluong = Integer.parseInt(txtSoLuong.getText());
            Vector add = new Vector();
            add.add(masach);
            add.add(tensach);
            add.add(soluong);
            add.add(gia);
            add.add(gia * soluong);
            cthd.add(add);
            tbl_Order.setModel(new DefaultTableModel(cthd, td));    
        }
        }
        
    }//GEN-LAST:event_btnThemVaoGioHangActionPerformed
    
    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        float sum = 0;
        String tenkhachhang = txtTenKhachHang.getText();
        String datenow = new SimpleDateFormat("yyyy/MM/dd").format(Date.from(Instant.now())) ;
        if(tenkhachhang.equals("")){
            JOptionPane.showConfirmDialog(this, "Hãy nhập đầy đủ dữ liệu", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
        }
        else{
            try {
                int result = hoadonDAO.addNewHoaDon(datenow, 0, tenkhachhang);     
                int maxid = hoadonDAO.getIdMax();
                //int i = tbl_Order.getSelectedRow();
                TableModel model = tbl_Order.getModel();
                int count = tbl_Order.getRowCount();
                for(int j = 0; j < count; j++){
                    int masach = Integer.parseInt(model.getValueAt(j, 0).toString());
                    int sl = Integer.parseInt(model.getValueAt(j, 2).toString());
                    float dongia = Float.parseFloat(model.getValueAt(j, 3).toString());
                    float temp = Float.parseFloat(model.getValueAt(j, 4).toString());
                    sum += temp;
                    chitiethoadonDAO.addNewCTHD(masach, maxid, sl, dongia);
                }  
                txtTongThanhTien.setText(sum + "");
                float tongthanhtien = Float.parseFloat(txtTongThanhTien.getText());
                int kt = hoadonDAO.updateThanhTien(maxid,tongthanhtien);   
                if(kt > 0){
                    JOptionPane.showMessageDialog(this, "Thanh toán thành công!");
                }
            DefaultTableModel xoa = (DefaultTableModel) tbl_Order.getModel();
            xoa.setRowCount(0);
            } catch (Exception e) {
            }
        }
        this.showTable();
    }//GEN-LAST:event_btnThanhToanActionPerformed
    String check = null;
    private void tbl_OrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_OrderMouseClicked
        int i = tbl_Order.getSelectedRow();
        TableModel model = tbl_Order.getModel();
        check = model.getValueAt(i, 0).toString();
    }//GEN-LAST:event_tbl_OrderMouseClicked

    private void btnTangSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangSoLuongActionPerformed
        if(check == null){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm muốn tăng số lượng");
        }else{
            int i = tbl_Order.getSelectedRow();
            TableModel model = tbl_Order.getModel();
            int count = tbl_Order.getRowCount();
            int sl = Integer.parseInt(model.getValueAt(i, 2).toString());
            float gia = Float.parseFloat(model.getValueAt(i, 3).toString()); 
            int slnew = sl + 1;
            model.setValueAt(slnew, i, 2);
            model.setValueAt(slnew * gia, i, 4);
        }
    }//GEN-LAST:event_btnTangSoLuongActionPerformed

    private void btnGiamSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamSoLuongActionPerformed
        if(check == null){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm muốn giảm số lượng");
        }else{
            int i = tbl_Order.getSelectedRow();
            TableModel model = tbl_Order.getModel();
            int sl = Integer.parseInt(model.getValueAt(i, 2).toString());
            float gia = Float.parseFloat(model.getValueAt(i, 3).toString()); 
            int slnew = sl - 1;
            model.setValueAt(slnew, i, 2);
            model.setValueAt(slnew * gia, i, 4);         
        }
    }//GEN-LAST:event_btnGiamSoLuongActionPerformed

    private void btnXoaKhoiGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhoiGioHangActionPerformed
        int n = tbl_Order.getSelectedRow();
        if(n < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng muốn xóa!");
        }else{
            cthd.remove(n);
            tbl_Order.setModel(new DefaultTableModel(cthd, td));
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        }
    }//GEN-LAST:event_btnXoaKhoiGioHangActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
        main m = new main();
        m.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if(txtTimKiem.getText().equals("")){
            //JOptionPane.showMessageDialog(this, "Thêm tên tài khoản muốn tìm");
            this.showTable();
        }
        else{
            ArrayList<sachDTO> ds = sachDAO.lstSachTimKiem(txtTimKiem.getText());
            DefaultTableModel tb = new DefaultTableModel();
            tb.addColumn("Mã sách");
            tb.addColumn("Tên sách");
            tb.addColumn("Tác giả");
            tb.addColumn("Số lượng");
            tb.addColumn("Giá");
            tb.setNumRows(ds.size());
        
            for(int i = 0 ; i < ds.size(); i++){
                sachDTO ls = ds.get(i);
                tb.setValueAt(ls.getMaSach(), i, 0);
                tb.setValueAt(ls.getTenSach(), i, 1);
                tb.setValueAt(ls.getTacGia(), i, 2);
                tb.setValueAt(ls.getSoLuong(), i, 3);
                tb.setValueAt(ls.getGia(), i, 4);
            }
            this.tbl_SanPham.setModel(tb);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiamSoLuong;
    private javax.swing.JButton btnTangSoLuong;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemVaoGioHang;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaKhoiGioHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_Order;
    private javax.swing.JTable tbl_SanPham;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongThanhTien;
    // End of variables declaration//GEN-END:variables
}
