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
public class Nguoi {
    protected String HoTen;
    protected NgayThangNam NgaySinh;

    public Nguoi(String HoTen, String NS) {
        NgayThangNam a=new NgayThangNam(NS);
        this.HoTen = HoTen;
        this.NgaySinh = a;
    }

    public Nguoi(String HoTen, NgayThangNam NgaySinh) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
    }
    
    public Nguoi() {
        NgaySinh=new NgayThangNam();
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public NgayThangNam getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(NgayThangNam NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        HoTen=sc.nextLine();
        System.out.println("Nhap Ngay sinh(dd/MM/yyyy):");
        NgaySinh.Nhap();
    }

    @Override
    public String toString() {
        return "Nguoi{" + "HoTen=" + HoTen + ", NgaySinh=" + NgaySinh.toString() + '}';
    }
    
}
