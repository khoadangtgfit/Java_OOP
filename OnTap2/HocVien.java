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
public class HocVien extends Nguoi{
    private double diem1,diem2,diem3;

    public HocVien() {
    }

    public HocVien(double diem1, double diem2, double diem3, String HoTen, String NS) {
        super(HoTen, NS);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public HocVien(double diem1, double diem2, double diem3, String HoTen, NgayThangNam NgaySinh) {
        super(HoTen, NgaySinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public HocVien(double diem1, double diem2, double diem3) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }
    public void Nhap(){
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem 1:");
        diem1=sc.nextDouble();
        System.out.println("Nhap diem 2:");
        diem2=sc.nextDouble();
        System.out.println("Nhap diem 3:");
        diem3=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "HocVien{" +super.toString()+ "diem1=" + diem1 + ", diem2=" + diem2 + ", diem3=" + diem3 + '}';
    }
    
}
