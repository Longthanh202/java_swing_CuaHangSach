/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.hoadonDAO;
import DAO.theloaiDAO;
import DTO.hoadonDTO;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//--------------------------------------
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author thanh
 */
public class thongke extends javax.swing.JFrame {

    public thongke() {
        initComponents();
        showTable();
        Tong();
    }
    private void showTable(){
        ArrayList<hoadonDTO> ds = hoadonDAO.lstHoaDon();
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("Mã hóa đơn");
        tb.addColumn("Ngày lập");
        tb.addColumn("\tThành tiền");
        tb.addColumn("\tTên khách hàng");
        tb.setNumRows(ds.size());
        
        for(int i = 0 ; i < ds.size(); i++){
            hoadonDTO ls = ds.get(i);
            tb.setValueAt(ls.getMaHoaDon(), i, 0);
            tb.setValueAt(ls.getNgayLap(), i, 1);
            tb.setValueAt(ls.getThanhTien(), i, 2);
            tb.setValueAt(ls.getTenKH(), i, 3);
        }
        this.tbl_ThongKe.setModel(tb);
    }
     public void openFile(String file){
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private void Tong(){
        DecimalFormat x = new DecimalFormat("###,###,###");
        float tong = 0;
        TableModel model = tbl_ThongKe.getModel();
        for(int i = 0; i < tbl_ThongKe.getRowCount(); i++){
            tong += Float.parseFloat(model.getValueAt(i, 2).toString());
        }
        lbl_tong.setText("Tổng doanh thu: " + x.format(tong) + " VND");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNgay = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ThongKe = new javax.swing.JTable();
        lbl_tong = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("THỐNG KÊ DOANH THU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(273, 273, 273))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtNgay.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnLoad.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        tbl_ThongKe.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_ThongKe);

        lbl_tong.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_tong.setText("jLabel2");

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnXuatFile.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnXuatFile.setText("Xuất File Excel");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem)
                        .addGap(29, 29, 29)
                        .addComponent(btnLoad)
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatFile)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_tong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(btnLoad)
                    .addComponent(btnXuatFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tong)
                    .addComponent(btnThoat))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if(txtNgay.getText().equals("")){
            showTable();
            this.Tong();
        }
        ArrayList<hoadonDTO> ds = hoadonDAO.findByDate(txtNgay.getText());
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("Mã hóa đơn");
        tb.addColumn("Ngày lập");
        tb.addColumn("Thành tiền");
        tb.addColumn("Tên khách hàng");
        tb.setNumRows(ds.size());
        
        for(int i = 0 ; i < ds.size(); i++){
            hoadonDTO ls = ds.get(i);
            tb.setValueAt(ls.getMaHoaDon(), i, 0);
            tb.setValueAt(ls.getNgayLap(), i, 1);
            tb.setValueAt(ls.getThanhTien(), i, 2);
            tb.setValueAt(ls.getTenKH(), i, 3);
        }
        this.tbl_ThongKe.setModel(tb);
        this.Tong();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        showTable();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
        main m = new main();
        m.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
//        int row = tbl_ThongKe.getSelectedRow();
//    
//        if (row == -1) {
//            JOptionPane.showMessageDialog(rootPane, "Hãy chọn thông tin cần export!");
//            return;
//        }
//        int contact_id = (int) tbl_ThongKe.getValueAt(0, 0);
//        int success = XuatFileDAO.exportExcel(tbl_ThongKe) ;
//    
//        if (success==1) {
//            JOptionPane.showMessageDialog(rootPane, "Xuất thông tin thành công!");
//        }

        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();
            if(saveFile != null){
                saveFile = new File(saveFile.toString()+".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("Sheet 1");
                
                Row rowCol = sheet.createRow(0);
                for(int i = 0 ; i < tbl_ThongKe.getColumnCount(); i++){
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tbl_ThongKe.getColumnName(i));
                }
                
                for(int j = 0; j < tbl_ThongKe.getRowCount(); j++){
                    Row row = sheet.createRow(j+1);
                    for(int k = 0; k < tbl_ThongKe.getColumnCount(); k++){
                        Cell cell = row.createCell(k);
                        if(tbl_ThongKe.getValueAt(j, k) != null){
                            cell.setCellValue(tbl_ThongKe.getValueAt(j, k).toString());
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                //FileOutputStream out = new FileOutputStream("dulieu.xlsx");
                wb.write(out);
                wb.close();
                out.close();
                //JOptionPane.showMessageDialog(null, "Xuất file Excel thành công");
                openFile(saveFile.toString());
            }else{
                JOptionPane.showMessageDialog(null, "Error");
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }catch(IOException io){
            System.out.println(io);
        }
    }//GEN-LAST:event_btnXuatFileActionPerformed

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
            java.util.logging.Logger.getLogger(thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new thongke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_tong;
    private javax.swing.JTable tbl_ThongKe;
    private javax.swing.JTextField txtNgay;
    // End of variables declaration//GEN-END:variables
}
