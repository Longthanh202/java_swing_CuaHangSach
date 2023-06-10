/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.hoadonDTO;
import dao.Connect;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author thanh
 */
public class hoadonDAO {
    public static int addNewHoaDon(String ngaylap, float thanhtien, String tenkhachhang){
        Connect conn = new Connect();
        String query = "insert into HoaDon values"
                + "('" + ngaylap + "', " + thanhtien + ", N'" + tenkhachhang + "')";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int deleteHoaDon(int id){
        Connect conn = new Connect();
        String query = "delete from HoaDon where MaHoaDon = '" + id + "'";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int editHoaDon(int id, String ngaylap, float thanhtien, String tenkhachhang){
        Connect conn = new Connect();
        String query = "update HoaDon set NgayLap = '" + ngaylap + "',ThanhTien = " + thanhtien + ", TenKhachHang = N'" + tenkhachhang + "' where MaHoaDon = " + id + "";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int getIdMax() throws SQLException{
        Connect conn = new Connect();
        String query = "select top(1) * from HOADON order by MaHoaDon desc";
        ResultSet result = conn.executeQuery(query);
        result.next();
        int value = result.getInt(1);
        return value;
    }
    
    public static int updateThanhTien(int id, float thanhtien){
        Connect conn = new Connect();
        String query = "update HoaDon set ThanhTien = " + thanhtien + " where MaHoaDon = " + id + "";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    private static ResultSet ResultSet;
    public static ArrayList<hoadonDTO> lstHoaDon(){
        ArrayList<hoadonDTO> ds = new ArrayList<hoadonDTO>();
        try {
            String sql = "select * from hoadon";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            while (rs.next()) {
               hoadonDTO ls = new hoadonDTO();
               ls.setMaHoaDon(rs.getInt(1));
               ls.setNgayLap(rs.getDate(2));
               ls.setThanhTien(rs.getDouble(3));
               ls.setTenKH(rs.getString(4));
               ds.add(ls);
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ArrayList<hoadonDTO> findByDate(String ngay){
        ArrayList<hoadonDTO> ds = new ArrayList<hoadonDTO>();
        try {
            String sql = "select * from hoadon where ngaylap like N'%" + ngay + "%'";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            while (rs.next()) {
               hoadonDTO ls = new hoadonDTO();
               ls.setMaHoaDon(rs.getInt(1));
               ls.setNgayLap(rs.getDate(2));
               ls.setThanhTien(rs.getDouble(3));
               ls.setTenKH(rs.getString(4));
               ds.add(ls);
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
}
