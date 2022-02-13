/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ONTAP3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Nguoi {
    protected String Ten;
    protected NgayThangNam NamSinh;

    public Nguoi() {
        NamSinh=new NgayThangNam();
    }

    public Nguoi(String Ten, NgayThangNam NamSinh) {
        this.Ten = Ten;
        this.NamSinh = NamSinh;
    }
    public Nguoi(String Ten, String NamSinh) {
        this.Ten = Ten;
        NgayThangNam a=new NgayThangNam(NamSinh);
        this.NamSinh = a;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
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
        Ten=sc.nextLine();
        System.out.println("Nhap ngay Sinh(dd/MM/yyyy):");
        NamSinh.Nhap();
    }

    @Override
    public String toString() {
        return "Nguoi{" + "Ten=" + Ten + ", NamSinh=" + NamSinh.toString() + '}';
    }
    
}
