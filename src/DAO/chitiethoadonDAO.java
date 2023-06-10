/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import dao.Connect;

/**
 *
 * @author thanh
 */
public class chitiethoadonDAO {
    public static int addNewCTHD(int masach, int mahd, int sl, float dongia){
        Connect conn = new Connect();
        String query = "insert into ChiTietHoaDon values"
                + "(" + masach + ", " + mahd + ", " + sl + ", " + dongia + ")";
        int result = conn.executeUpdate(query);
        conn.close();
        return result;
    }
}
