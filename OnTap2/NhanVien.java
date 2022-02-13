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
public class NhanVien extends Nguoi{
    protected double Luong;
    protected NgayThangNam NgayNhanViec;
    protected PhongBanKhoa PBK;

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

    public NhanVien() {
        PBK=new PhongBanKhoa();
        NgayNhanViec=new NgayThangNam();
    }

    public NhanVien(double Luong, String NgayNhanViec, String MaPBK,String TenPBK, String HoTen, String NS) {
        super(HoTen, NS);
        this.Luong = Luong;
        NgayThangNam a=new NgayThangNam(NgayNhanViec);
        this.NgayNhanViec = a;
        PhongBanKhoa t=new PhongBanKhoa(MaPBK, TenPBK);
        this.PBK = t;
    }

    public NhanVien(double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK, String HoTen, NgayThangNam NgaySinh) {
        super(HoTen, NgaySinh);
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        this.PBK = PBK;
    }
    
    public NhanVien(double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK) {
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        this.PBK = PBK;
    }
    public void Nhap(){
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
        return "NhanVien{" + "Luong=" + Luong + ", NgayNhanViec=" + NgayNhanViec.toString() + ", PBK=" + PBK.toString() + '}';
    }
    
}
