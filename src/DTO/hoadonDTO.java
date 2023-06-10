/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author thanh
 */
public class hoadonDTO {
    private int maHoaDon;
    private Date ngayLap;
    private double thanhTien;
    private String tenKH;

    public hoadonDTO() {
    }

    public hoadonDTO(int maHoaDon, Date ngayLap, int trangThai, double thanhTien, String tenKH) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.thanhTien = thanhTien;
        this.tenKH = tenKH;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public Date getNgayLap() {
        return ngayLap;
    }


    public double getThanhTien() {
        return thanhTien;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    
    
}
