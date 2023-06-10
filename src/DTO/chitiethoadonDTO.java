/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author thanh
 */
public class chitiethoadonDTO {
    private int maSach, maHoaDon, soLuong;

    public chitiethoadonDTO() {
    }

    public chitiethoadonDTO(int maSach, int maHoaDon, int soLuong) {
        this.maSach = maSach;
        this.maHoaDon = maHoaDon;
        this.soLuong = soLuong;
    }

    public int getMaSach() {
        return maSach;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
