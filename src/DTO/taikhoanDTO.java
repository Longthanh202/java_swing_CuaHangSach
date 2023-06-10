/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author thanh
 */
public class taikhoanDTO {
    private int id, loaiTK;
    private String tenDangNhap, matKhau, sDt;

    public taikhoanDTO() {
    }

    public taikhoanDTO(int id, int loaiTK, String tenDangNhap, String matKhau, String sDt) {
        this.id = id;
        this.loaiTK = loaiTK;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.sDt = sDt;
    }

    public int getId() {
        return id;
    }

    public int getLoaiTK() {
        return loaiTK;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getsDt() {
        return sDt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLoaiTK(int loaiTK) {
        this.loaiTK = loaiTK;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setsDt(String sDt) {
        this.sDt = sDt;
    }
    
    
}
