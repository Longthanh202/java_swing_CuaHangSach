/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thanh
 */
public class Connect {
    private static java.sql.Connection connection = null;
    private static ResultSet rs = null;
    String dbURL = "jdbc:sqlserver://localhost\\Long\\SQLEXPRESS:1433;encrypt=true;trustServerCertificate=true;databaseName=db_ql_cuahangsach;user=sa;password=sa";
    public void close(){
        try {
             this.connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ResultSet executeQuery(String sql){
        try {
            connection = DriverManager.getConnection(dbURL);
            rs = connection.createStatement().executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.err.print("\nError resultData !!!\n");
        }
        return null;
    }
    
    public int executeUpdate(String sql){
       try {
            connection = DriverManager.getConnection(dbURL);
            int value = connection.createStatement().executeUpdate(sql);
            return value;
        } catch (Exception e) {
            System.err.print("\nError UpdateData !!!\n");
        }
        return 0;
    }
}
