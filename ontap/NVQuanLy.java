/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NVQuanLy extends NhanVienCLCao{
    private double PhuCapCV;

    public NVQuanLy(double PhuCapCV) {
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(double PhuCapCV, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, String mapb, String tenpb) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, mapb, tenpb);
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(double PhuCapCV, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, String mapb, String tenpb, String ten, NgayThangNam NamSinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, mapb, tenpb, ten, NamSinh);
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy() {
    }
    
    public double getPhuCapCV() {
        return PhuCapCV;
    }

    public void setPhuCapCV(double PhuCapCV) {
        this.PhuCapCV = PhuCapCV;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap phu cap CV:");
        PhuCapCV=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "NVQuanLy{" +super.toString()+ "PhuCapCV=" + PhuCapCV + '}';
    }
    
    
}
