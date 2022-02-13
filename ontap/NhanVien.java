/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVien extends Nguoi{

    protected double Luong;
    protected NgayThangNam NgayNhanViec;
    protected PhongBanKhoa PBK;
    class PhongBanKhoa{
        String MaPBK,TenPBK;

        public PhongBanKhoa(String MaPBK, String TenPBK) {
            this.MaPBK = MaPBK;
            this.TenPBK = TenPBK;
        }

        public PhongBanKhoa() {
        }
        public void Nhap(){
            Scanner sc=new Scanner(System.in);
            System.out.println("-Nhap Ma PBK:");
            MaPBK=sc.nextLine();
            System.out.println("-Nhap Ten PBK:");
            TenPBK=sc.nextLine();
        }

        @Override
        public String toString() {
            return "PhongBanKhoa{" + "MaPBK=" + MaPBK + ", TenPBK=" + TenPBK + '}';
        }
        
        
    }

    public NhanVien(double Luong, NgayThangNam NgayNhanViec, String mapb,String tenpb) {
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        PhongBanKhoa a=new PhongBanKhoa(mapb, tenpb);
        this.PBK = a;
    }

    public NhanVien(double Luong, NgayThangNam NgayNhanViec, String mapb,String tenpb, String ten, NgayThangNam NamSinh) {
        super(ten, NamSinh);
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        PhongBanKhoa a=new PhongBanKhoa(mapb, tenpb);
        this.PBK = a;
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

    public NhanVien() {
    }
    
    @Override
    public void Nhap() {
        super.Nhap(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Luong:");
        Luong=sc.nextDouble();
        System.out.println("Nhap Phong Ban Khoa:");
        PhongBanKhoa a=new PhongBanKhoa();
        a.Nhap();
        PBK=a;
        System.out.println("Nhap Ngay Nhan Viec:");
        NgayThangNam b=new NgayThangNam();
        b.Nhap();
        NgayNhanViec=b;
    }

    @Override
    public String toString() {
        return "NhanVien{" +super.toString()+ ", Luong=" + Luong + ", NgayNhanViec=" + NgayNhanViec.toString() + ", PBK=" + PBK.toString() + '}';
    }
    
    
    
}
