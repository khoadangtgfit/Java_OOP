/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ONTAP3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NVQuanLy extends NhanVienCLCao{
    private double PhuCapCV;

    public NVQuanLy() {
    }

    public NVQuanLy(String TrinhDo, String Nganh, String NoiDaoTao) {
        super(TrinhDo, Nganh, NoiDaoTao);
    }

    public NVQuanLy(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK);
    }

    public NVQuanLy(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK, String Ten, NgayThangNam NamSinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK, Ten, NamSinh);
    }

    public NVQuanLy(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, String NgayNhanViec, String TenPBK, String MaPBK, String Ten, String NamSinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, TenPBK, MaPBK, Ten, NamSinh);
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
