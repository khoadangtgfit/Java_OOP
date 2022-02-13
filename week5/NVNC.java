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
public class NVNC extends NhanVien{
    private String ChuyenMon;
    private double PhuCap;

    public NVNC() {
    }
    
    public NVNC(String ChuyenMon, double PhuCap) {
        this.ChuyenMon = ChuyenMon;
        this.PhuCap = PhuCap;
    }

    public NVNC(String ChuyenMon, double PhuCap, String MaNV, String TenNV, String TrinhDo, Double LuongCB) {
        super(MaNV, TenNV, TrinhDo, LuongCB);
        this.ChuyenMon = ChuyenMon;
        this.PhuCap = PhuCap;
    }

    @Override
    public void Nhap() {
        super.Nhap(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Chuyen Mon:");
        ChuyenMon =sc.nextLine();
        System.out.println("Nhap phu cap:");
        PhuCap=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "NVNC{" +super.toString()+ "ChuyenMon=" + ChuyenMon + ", PhuCap=" + PhuCap + ",Luong="+TinhLuong()+'}';
    }
    @Override
    double TinhLuong() {
        return super.LuongCB+PhuCap;
    }
    
}
