/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NhanVien extends Nguoi{
    private double Luong;
    private Class_Date NgayNhanViec=new Class_Date();
    private PBK Pbk;
    Scanner sc=new Scanner(System.in);
    public class PBK{
        String maPBK;
        String tenPBK;
        public void Nhap(){
            Scanner t=new Scanner(System.in);
            System.out.println("-Nhap ma PBK:");
            maPBK=t.nextLine();
            System.out.println("-Nhap ten PBK:");
            tenPBK=t.nextLine();
        }

        @Override
        public String toString() {
            return "PBK{" + "maPBK=" + maPBK + ", tenPBK=" + tenPBK + '}';
        }

        public String getMaPBK() {
            return maPBK;
        }

        public void setMaPBK(String maPBK) {
            this.maPBK = maPBK;
        }

        public String getTenPBK() {
            return tenPBK;
        }

        public void setTenPBK(String tenPBK) {
            this.tenPBK = tenPBK;
        }

        public PBK(String maPBK, String tenPBK) {
            this.maPBK = maPBK;
            this.tenPBK = tenPBK;
        }
        
    }

    public NhanVien(double Luong, Class_Date NgayNhanViec, PBK Pbk) {
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        this.Pbk = Pbk;
    }

    public NhanVien(double Luong, Class_Date NgayNhanViec, PBK Pbk, Class_Date namSinh, String hoTen) {
        super(namSinh, hoTen);
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        this.Pbk = Pbk;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap Luong:");
        Luong=sc.nextDouble();
        System.out.println("Nhap ngay nhan viec:");
        NgayNhanViec.Nhap();
        System.out.println("Nhap phong ban khoa:");
        Pbk.Nhap();
    }

    @Override
    public String toString() {
        return "NhanVien{" +super.toString()+ "Luong=" + Luong + ", NgayNhanViec=" + NgayNhanViec.toString() + ", Pbk=" + Pbk.toString() ;
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

    public PBK getPbk() {
        return Pbk;
    }

    public void setPbk(PBK Pbk) {
        this.Pbk = Pbk;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public NhanVien() {
    }
    
}
