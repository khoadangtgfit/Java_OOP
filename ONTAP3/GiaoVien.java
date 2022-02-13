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
public class GiaoVien extends NhanVienCLCao{
    private double ThuLaoGD;

    public GiaoVien() {
    }

    public GiaoVien(double ThuLaoGD) {
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(double ThuLaoGD, String TrinhDo, String Nganh, String NoiDaoTao) {
        super(TrinhDo, Nganh, NoiDaoTao);
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(double ThuLaoGD, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK);
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(double ThuLaoGD, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK, String Ten, NgayThangNam NamSinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK, Ten, NamSinh);
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(double ThuLaoGD, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, String NgayNhanViec, String TenPBK, String MaPBK, String Ten, String NamSinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, TenPBK, MaPBK, Ten, NamSinh);
        this.ThuLaoGD = ThuLaoGD;
    }

    public double getThuLaoGD() {
        return ThuLaoGD;
    }

    public void setThuLaoGD(double ThuLaoGD) {
        this.ThuLaoGD = ThuLaoGD;
    }

    @Override
    public void Nhap() {
        super.Nhap(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Thu Lao GD:");
        ThuLaoGD=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "GiaoVien{"+super.toString() + "ThuLaoGD=" + ThuLaoGD + '}';
    }
    
}
