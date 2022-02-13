/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HocVien extends Nguoi{
    private double Diem1,Diem2,Diem3;

    public HocVien(double Diem1, double Diem2, double Diem3) {
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }

    public HocVien(double Diem1, double Diem2, double Diem3, String ten, NgayThangNam NamSinh) {
        super(ten, NamSinh);
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }

    public HocVien() {
    }

    
    
    public void Nhap(){  
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem 1:");
        Diem1=sc.nextDouble();
        System.out.println("Nhap diem 2:");
        Diem2=sc.nextDouble();
        System.out.println("Nhap diem 3:");
        Diem3=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "HocVien{" +super.toString()+ "Diem1=" + Diem1 + ", Diem2=" + Diem2 + ", Diem3=" + Diem3 + '}';
    }
    
    
}
