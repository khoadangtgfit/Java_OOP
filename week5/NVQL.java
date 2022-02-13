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
public class NVQL extends NhanVien {
    private String ChuyenMon;
    private double PhuCapCV;

    public NVQL() {
    }

    public NVQL(String ChuyenMon, double PhuCapCV) {
        this.ChuyenMon = ChuyenMon;
        this.PhuCapCV = PhuCapCV;
    }

    public NVQL(String ChuyenMon, double PhuCapCV, String MaNV, String TenNV, String TrinhDo, Double LuongCB) {
        super(MaNV, TenNV, TrinhDo, LuongCB);
        this.ChuyenMon = ChuyenMon;
        this.PhuCapCV = PhuCapCV;
    }

    @Override
    public void Nhap() {
        super.Nhap(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuyen mon:");
        ChuyenMon=sc.nextLine();
        System.out.println("Nhap phu cap:");
        PhuCapCV=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "NVQL{" +super.toString()+ "ChuyenMon=" + ChuyenMon + ", PhuCapCV=" + PhuCapCV + ",Luong="+TinhLuong()+ '}';
    }
    
   
    
    @Override
    double TinhLuong() {
        return super.LuongCB+PhuCapCV;
    }
    
}
