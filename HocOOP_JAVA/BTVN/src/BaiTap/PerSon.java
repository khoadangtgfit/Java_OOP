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
public class PerSon {
    protected String HoTen,NgaySinh;

    public PerSon(String HoTen, String NgaySinh) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
    }

    public PerSon() {
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        HoTen=sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        NgaySinh=sc.nextLine();
    }
    public String toString() {
        return "PerSon{" + "HoTen=" + HoTen + ", NgaySinh=" + NgaySinh + '}';
    }
    
}
