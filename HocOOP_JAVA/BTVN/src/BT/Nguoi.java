/*
 * Họ Tên: Đặng Phước Khoa
 * Lớp : 19DTHE1
 * MSSV:1911066165
 */
package BT;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Nguoi {
    protected String ten;
    protected Class_Date NgaySinh;

    public Nguoi() {
        NgaySinh=new Class_Date();
    }

    public Nguoi(String ten, Class_Date NgaySinh) {
        this.ten = ten;
        this.NgaySinh = NgaySinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Class_Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Class_Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten:");
        ten=sc.nextLine();
        System.out.println("Nhap Ngay Sinh:");
        NgaySinh.Nhap();
    }

    @Override
    public String toString() {
        return "ten=" + ten + ", NgaySinh=" + NgaySinh.toString()+",";
    }
    
}
