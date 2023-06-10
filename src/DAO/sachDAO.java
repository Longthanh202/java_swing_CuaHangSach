/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.taikhoanDTO;
import dao.Connect;
import java.sql.ResultSet;
import java.util.ArrayList;
import DTO.sachDTO;

/**
 *
 * @author thanh
 */
public class sachDAO {
    private static ResultSet ResultSet;
    public static ArrayList<sachDTO> lstSach(){
        ArrayList<sachDTO> ds = new ArrayList<sachDTO>();
        try {
            String sql = "select * from sach";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            while (rs.next()) {
               sachDTO ls = new sachDTO();
               ls.setMaSach(rs.getInt(1));
               ls.setTenSach(rs.getString(2));
               ls.setMaTheLoai(rs.getInt(3));
               ls.setMaNXB(rs.getInt(4));
               ls.setTacGia(rs.getString(5));
               ls.setSoLuong(rs.getInt(6));
               ls.setGia(rs.getFloat(7));
               ds.add(ls);
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static int addNewSach(String tensach, int theloai, int nxb, String tacgia, int soluong, float gia){
        Connect conn = new Connect();
        String query = "insert into Sach values"
                + "(N'" + tensach + "', " + theloai + ", " + nxb + ", N'" + tacgia + "', " + soluong + ", " + gia + ")";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int deleteSach(int id){
        Connect conn = new Connect();
        String query = "delete from Sach where MaSach = '" + id + "'";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int editSach(int id, String tensach, int theloai, int nxb, String tacgia, int soluong, float gia){
        Connect conn = new Connect();
        String query = "update Sach set TenSach = N'" + tensach + "',MaTheLoai= " + theloai + ", MaNXB = " + nxb + ", TacGia = N'" + tacgia + "', soluong = " + soluong + ", Gia = " + gia + " where MaSach = " + id + "";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static ArrayList<sachDTO> lstSachTimKiem(String input){
        ArrayList<sachDTO> ds = new ArrayList<sachDTO>();
        try {
            String sql = "select * from sach where tensach like N'%" + input + "%'";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            while (rs.next()) {
                sachDTO ls = new sachDTO();
                ls.setMaSach(rs.getInt(1));
                ls.setTenSach(rs.getString(2));
                ls.setMaTheLoai(rs.getInt(3));
                ls.setMaNXB(rs.getInt(4));
                ls.setTacGia(rs.getString(5));
                ls.setSoLuong(rs.getInt(6));
                ls.setGia(rs.getFloat(7));
                ds.add(ls);
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
}
