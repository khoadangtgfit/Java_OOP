/*
 * Họ Tên: Đặng Phước Khoa
 * Lớp : 19DTHE1
 * MSSV:1911066165
 */
package BT;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVien extends Nguoi {
    protected double Luong;
    protected Class_Date NgayNhanViec;
    protected PhongBanKhoa PBK;

    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong:");
        Luong=sc.nextDouble();
        System.out.println("Nhap ngay nhan viec:");
        NgayNhanViec.Nhap();
        System.out.println("Nhap phong ban khoa:");
        PBK.Nhap();
    }

    public NhanVien() {
        NgayNhanViec = new Class_Date();
        PBK = new PhongBanKhoa();
    }

    public NhanVien(double Luong, Class_Date NgayNhanViec, PhongBanKhoa PBK) {
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        this.PBK = PBK;
    }

    public NhanVien(double Luong, Class_Date NgayNhanViec, PhongBanKhoa PBK, String ten, Class_Date NgaySinh) {
        super(ten, NgaySinh);
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        this.PBK = PBK;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public Class_Date getNgayNhanViec() {
        return NgayNhanViec;
    }

    public void setNgayNhanViec(Class_Date NgayNhanViec) {
        this.NgayNhanViec = NgayNhanViec;
    }

    public PhongBanKhoa getPBK() {
        return PBK;
    }

    public void setPBK(PhongBanKhoa PBK) {
        this.PBK = PBK;
    }

    @Override
    public String toString() {
        return super.toString()+ "Luong=" + Luong + ", NgayNhanViec=" + NgayNhanViec + ", PBK=" + PBK.toString()+",";
    }
    
}
