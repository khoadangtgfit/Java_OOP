/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NVQuanLy extends NhanVienCLCao{
    private double PhuCapCV;

    public NVQuanLy(String TrinhDo, String Nganh, String NoiDaoTao) {
        super(TrinhDo, Nganh, NoiDaoTao);
    }

    public NVQuanLy(double PhuCapCV, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, String NgayNhanViec, String MaPBK, String TenPBK, String HoTen, String NS) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, MaPBK, TenPBK, HoTen, NS);
        this.PhuCapCV = PhuCapCV;
    }
    
    
    public NVQuanLy(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK, String HoTen, NgayThangNam NgaySinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK, HoTen, NgaySinh);
    }

    public NVQuanLy(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK);
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
        System.out.println("Nhap phu cap cv:");
        PhuCapCV=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "NVQuanLy{" +super.toString()+ "PhuCapCV=" + PhuCapCV + '}';
    }
    
}
