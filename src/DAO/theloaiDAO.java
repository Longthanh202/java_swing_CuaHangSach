/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import dao.Connect;
import java.sql.ResultSet;
import java.util.ArrayList;
import DTO.theloaiDTO;

/**
 *
 * @author thanh
 */
public class theloaiDAO {
    private static ResultSet ResultSet;
    public static ArrayList<theloaiDTO> lstTheLoai(){
        ArrayList<theloaiDTO> ds = new ArrayList<theloaiDTO>();
        try {
            String sql = "select * from theloai";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            while (rs.next()) {
               theloaiDTO ls = new theloaiDTO();
               ls.setMaTheLoai(rs.getInt(1));
               ls.setTenTheLoai(rs.getString(2));
               ds.add(ls);
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static int addNewTheLoai(String tenlt){
        Connect conn = new Connect();
        String query = "insert into theloai values"
                + "(N'" + tenlt + "')";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int deleteTheLoai(int id){
        Connect conn = new Connect();
        String query = "delete from theloai where MaTheLoai = '" + id + "'";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static int editTheLoai(int id, String tentheloai){
        Connect conn = new Connect();
        String query = "update theloai set tentheloai = N'" + tentheloai + "' where matheloai = '" + id + "'";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
    
    public static ArrayList<theloaiDTO> lstTheLoaiTimKiem(String input){
        ArrayList<theloaiDTO> ds = new ArrayList<theloaiDTO>();
        try {
            String sql = "select * from theloai where tentheloai like N'%" + input + "%'";
            Connect helper = new Connect();
            ResultSet rs;
            ResultSet = rs = helper.executeQuery(sql);
            while (rs.next()) {
                theloaiDTO ls = new theloaiDTO();
                ls.setMaTheLoai(rs.getInt(1));
                ls.setTenTheLoai(rs.getString(2));
                ds.add(ls);
            }
            helper.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
}
