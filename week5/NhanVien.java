/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class NhanVien {

    protected String MaNV, TenNV, TrinhDo;
    protected Double LuongCB;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, String TrinhDo, Double LuongCB) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.TrinhDo = TrinhDo;
        this.LuongCB = LuongCB;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nv:");
        MaNV = sc.nextLine();
        System.out.println("Nhap ten nv:");
        TenNV = sc.nextLine();
        System.out.println("Nhap trinh do:");
        TrinhDo = sc.nextLine();
        System.out.println("Nhap luong co ban:");
        LuongCB = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "MaNV=" + MaNV + ", TenNV=" + TenNV + ", TrinhDo=" + TrinhDo + ", LuongCB=" + LuongCB ;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    public Double getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(Double LuongCB) {
        this.LuongCB = LuongCB;
    }
    
    abstract double TinhLuong();
}
