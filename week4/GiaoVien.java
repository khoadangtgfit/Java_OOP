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
public class GiaoVien extends NhanVienCLCao{
    private double ThuLaoGD;

    public GiaoVien() {
    }

    public GiaoVien(double ThuLaoGD) {
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(double ThuLaoGD, String trinhDo, String nganh, String noiDaoTao, double Luong, Class_Date NgayNhanViec, PBK Pbk) {
        super(trinhDo, nganh, noiDaoTao, Luong, NgayNhanViec, Pbk);
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(double ThuLaoGD, String trinhDo, String nganh, String noiDaoTao, double Luong, Class_Date NgayNhanViec, PBK Pbk, Class_Date namSinh, String hoTen) {
        super(trinhDo, nganh, noiDaoTao, Luong, NgayNhanViec, Pbk, namSinh, hoTen);
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(double ThuLaoGD, String trinhDo, String nganh, String noiDaoTao) {
        super(trinhDo, nganh, noiDaoTao);
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
        System.out.println("Nhap thu lao GD:");
        ThuLaoGD=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "GiaoVien{" +super.toString()+ "ThuLaoGD=" + ThuLaoGD + '}';
    }
    
    
}
