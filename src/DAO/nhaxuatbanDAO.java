/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import dao.Connect;
import java.sql.ResultSet;
import java.util.ArrayList;
import DTO.nhaxuatbanDTO;
/**
 *
 * @author thanh
 */
public class nhaxuatbanDAO {
    private static ResultSet ResultSet;
    public static ArrayList<nhaxuatbanDTO> lstNXB(){
        ArrayList<nhaxuatbanDTO> ds = new ArrayList<nhaxuatbanDTO>();
        try {
            String sql = "select * from NhaXuatBan";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            while (rs.next()) {
               nhaxuatbanDTO ls = new nhaxuatbanDTO();
               ls.setMaNXB(rs.getInt(1));
               ls.setTenNXB(rs.getString(2));
               ls.setDiaChi(rs.getString(3));
               ls.setDienThoai(rs.getString(4));
               ds.add(ls);
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static int addNewNhaXuatBan(String tennxb, String diachi, String sdt){
        Connect conn = new Connect();
        String query = "insert into nhaxuatban values"
                + "(N'" + tennxb + "', N'" + diachi + "', N'" + sdt + "')";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int deleteNhaXuatBan(int id){
        Connect conn = new Connect();
        String query = "delete from nhaxuatban where MaNXB = '" + id + "'";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int editNhaXuatBan(int id, String ten, String diachi, String sdt){
        Connect conn = new Connect();
        String query = "update nhaxuatban set tennxb = N'" + ten + "', diachiNXB = N'" + diachi + "', dienthoai = N'" + sdt + "' where manxb = '" + id + "'";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static ArrayList<nhaxuatbanDTO> lstNXBTimKiem(String input){
        ArrayList<nhaxuatbanDTO> ds = new ArrayList<nhaxuatbanDTO>();
        try {
            String sql = "select * from nhaxuatban where tennxb like N'%" + input + "%'";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            while (rs.next()) {
                nhaxuatbanDTO ls = new nhaxuatbanDTO();
               ls.setMaNXB(rs.getInt(1));
               ls.setTenNXB(rs.getString(2));
               ls.setDiaChi(rs.getString(3));
               ls.setDienThoai(rs.getString(4));
               ds.add(ls);
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
}
