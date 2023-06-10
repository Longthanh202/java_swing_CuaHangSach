/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author thanh
 */
public class sachDTO {
    private int maSach, soLuong, maTheLoai, maNXB;
    private String tenSach, tacGia;
    private float gia;

    public sachDTO() {
    }

    public sachDTO(int maSach, int soLuong, int maTheLoai, int maNXB, String tenSach, String tacGia, float gia) {
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.maTheLoai = maTheLoai;
        this.maNXB = maNXB;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }

    public int getMaSach() {
        return maSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getMaTheLoai() {
        return maTheLoai;
    }

    public int getMaNXB() {
        return maNXB;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public float getGia() {
        return gia;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setMaTheLoai(int maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public void setMaNXB(int maNXB) {
        this.maNXB = maNXB;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    
}
