/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SinhVien extends PerSon{
    private String MSSV;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(String MSSV, double diemTB, String HoTen, String NgaySinh) {
        super(HoTen, NgaySinh);
        this.MSSV = MSSV;
        this.diemTB = diemTB;
    }

    public SinhVien(String MSSV, double diemTB) {
        this.MSSV = MSSV;
        this.diemTB = diemTB;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap mssv:");
        MSSV=sc.nextLine();
        System.out.println("Nhap diem trung binh:");
        diemTB=sc.nextDouble();
   }
    @Override
    public String toString() {
        return "SinhVien{" +super.toString()+ "MSSV=" + MSSV + ", diemTB=" + diemTB + '}';
    }
    
}
