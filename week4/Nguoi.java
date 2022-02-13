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
public class Nguoi {
    protected Class_Date namSinh;
    protected String hoTen;

    public Nguoi() {
        namSinh=new Class_Date();
        hoTen="";
    }
    
    public Nguoi(Class_Date namSinh, String hoTen) {
        this.namSinh = namSinh;
        this.hoTen = hoTen;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten:");
        hoTen=sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        namSinh.Nhap();
    }

    public Class_Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Class_Date namSinh) {
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "namSinh=" + namSinh.toString() + ", hoTen=" + hoTen ;
    }
    
}
