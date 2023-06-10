/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import DTO.taikhoanDTO;
import dao.Connect;


/**
 *
 * @author thanh
 */
public class taikhoanDAO {
    private static ResultSet ResultSet;
    public static ArrayList<taikhoanDTO> lstTaiKhoan(){
        ArrayList<taikhoanDTO> ds = new ArrayList<taikhoanDTO>();
        try {
            String sql = "select * from taikhoan";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            System.err.print(rs);
            while (rs.next()) {
               taikhoanDTO ls = new taikhoanDTO();
               ls.setId(rs.getInt(1));
               ls.setTenDangNhap(rs.getString(2));
               ls.setMatKhau(rs.getString(3));
               ls.setsDt(rs.getString(4));
               ls.setLoaiTK(rs.getInt(5));
               ds.add(ls);
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static int addNewTaiKhoan(String tendangnhap, String matkhau, String sdt, int loaitaikhoan){
        Connect conn = new Connect();
        String query = "insert into taikhoan values"
                + "(N'" + tendangnhap + "', N'" + matkhau + "', N'" + sdt + "', " + loaitaikhoan + ")";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int deleteTaiKhoan(int id){
        Connect conn = new Connect();
        String query = "delete from taikhoan where id = '" + id + "'";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int editTaiKhoan(int id, String tendangnhap, String matkhau, String sdt, int loaitaikhoan){
        Connect conn = new Connect();
        String query = "update taikhoan set tendangnhap = N'" + tendangnhap + "',matkhau= N'" + matkhau + "', sdt = '" + sdt + "' where id = '" + id+ "'";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static ArrayList<taikhoanDTO> lstTaiKhoanTimKiem(String input){
        ArrayList<taikhoanDTO> ds = new ArrayList<taikhoanDTO>();
        try {
            String sql = "select * from taikhoan where tendangnhap like N'%" + input + "%'";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            while (rs.next()) {
               taikhoanDTO ls = new taikhoanDTO();
               ls.setId(rs.getInt(1));
               ls.setTenDangNhap(rs.getString(2));
               ls.setMatKhau(rs.getString(3));
               ls.setsDt(rs.getString(4));
               ls.setLoaiTK(rs.getInt(5));
               ds.add(ls);
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    public static taikhoanDTO CheckLogin(String tendangnhap, String password){
        taikhoanDTO ls = new taikhoanDTO();
        try {
            String sql = "select * from taikhoan where tendangnhap = N'" + tendangnhap + "' and matkhau = N'" + password + "'";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            while (rs.next()) {
               ls.setId(rs.getInt(1));
               ls.setTenDangNhap(rs.getString(2));
               ls.setMatKhau(rs.getString(3));
               ls.setsDt(rs.getString(4));
               ls.setLoaiTK(rs.getInt(5));
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ls;
    }
}
