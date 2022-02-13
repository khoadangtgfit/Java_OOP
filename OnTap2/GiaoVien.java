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
public class GiaoVien extends NhanVienCLCao{
    private double ThuLaoCV;

    public GiaoVien(String TrinhDo, String Nganh, String NoiDaoTao) {
        super(TrinhDo, Nganh, NoiDaoTao);
    }

    public GiaoVien(double ThuLaoCV, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, String NgayNhanViec, String MaPBK, String TenPBK, String HoTen, String NS) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, MaPBK, TenPBK, HoTen, NS);
        this.ThuLaoCV = ThuLaoCV;
    }

   

    public GiaoVien(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK, String HoTen, NgayThangNam NgaySinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK, HoTen, NgaySinh);
    }

    public GiaoVien(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK);
    }

    public GiaoVien() {
    }

    public double getThuLaoCV() {
        return ThuLaoCV;
    }

    public void setThuLaoCV(double ThuLaoCV) {
        this.ThuLaoCV = ThuLaoCV;
    }

    @Override
    public void Nhap() {
        super.Nhap(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap thu lao CV:");
        ThuLaoCV=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "GiaoVien{" +super.toString()+ "ThuLaoCV=" + ThuLaoCV + '}';
    }
    
}
