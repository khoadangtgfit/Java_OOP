/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Nguoi {
    protected String ten;
    protected NgayThangNam NamSinh;

    public Nguoi() {
    }

    public Nguoi(String ten, NgayThangNam NamSinh) {
        this.ten = ten;
        this.NamSinh = NamSinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public NgayThangNam getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(NgayThangNam NamSinh) {
        this.NamSinh = NamSinh;
    }

   
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        ten=sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        NgayThangNam a=new NgayThangNam();
        a.Nhap();
        NamSinh=a;
    }

    @Override
    public String toString() {
        return "ten=" + ten + ", NamSinh=" + NamSinh.toString();
    }
    
}
