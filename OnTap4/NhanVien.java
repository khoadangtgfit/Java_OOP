/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVien extends Nguoi{
    protected double Luong;
    protected NgayThangNam NgayNhanViec;
    protected PhongBanKhoa PBK;

    public NhanVien(double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK, String Ten, NgayThangNam NamSinh) {
        super(Ten, NamSinh);
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        this.PBK = PBK;
    }

    public NhanVien(double Luong, String NgayNhanViec, String MaPBK,String TenPBK, String Ten, String NamSinh) {
        super(Ten, NamSinh);
        PhongBanKhoa a=new PhongBanKhoa(MaPBK, TenPBK);
        this.Luong = Luong;
        NgayThangNam b=new NgayThangNam(NgayNhanViec);
        this.NgayNhanViec = b;
        this.PBK = a;
    }

    public NhanVien(double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK) {
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        this.PBK = PBK;
    }

    public NhanVien() {
        NgayNhanViec=new NgayThangNam();
        PBK=new PhongBanKhoa();
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public NgayThangNam getNgayNhanViec() {
        return NgayNhanViec;
    }

    public void setNgayNhanViec(NgayThangNam NgayNhanViec) {
        this.NgayNhanViec = NgayNhanViec;
    }

    public PhongBanKhoa getPBK() {
        return PBK;
    }

    public void setPBK(PhongBanKhoa PBK) {
        this.PBK = PBK;
    }

    @Override
    public void Nhap() {
        super.Nhap(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Luong:");
        Luong=sc.nextDouble();
        System.out.println("Nhap ngay nhan viec(dd/MM/yyyy):");
        NgayNhanViec.Nhap();
        System.out.println("Nhap phong ban khoa:");
        PBK.Nhap();
    }

    @Override
    public String toString() {
        return super.toString()+ "Luong=" + Luong + ", NgayNhanViec=" + NgayNhanViec.toString() + ", PBK=" + PBK.toString();
    }
    
}
