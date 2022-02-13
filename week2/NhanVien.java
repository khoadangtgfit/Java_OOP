/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NhanVien {
    private String MaSo,HoTen;
    private float LuongCoban;
    private int HeSoLuong;
    static int SoLuongNhanVien;

    public NhanVien(String MaSo, String HoTen, int HeSoLuong) {
        this.MaSo = MaSo;
        this.HoTen = HoTen;
        this.LuongCoban=20000;
        this.HeSoLuong = HeSoLuong;
        SoLuongNhanVien++;
    }
    public NhanVien()
    {
       LuongCoban=20000;
       SoLuongNhanVien++;
    }

    public void setMaSo(String MaSo) {
        this.MaSo = MaSo;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setHeSoLuong(int HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public String getMaSo() {
        return MaSo;
    }

    public String getHoTen() {
        return HoTen;
    }

    public int getHeSoLuong() {
        return HeSoLuong;
    }
    public int getSLNhanVien()
    {
    	return SoLuongNhanVien;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        HoTen=sc.nextLine();
        System.out.println("Nhap ma nhan vien:");
        MaSo=sc.nextLine();
        System.out.println("Nhap he so luong:");
        HeSoLuong=sc.nextInt();
    }
    public void Xuat(int a)
    {
    	System.out.printf("|%-4d|%-10s|%-20s|%-14f|%-14d|%-16f|",a,MaSo,HoTen,LuongCoban,HeSoLuong,TinhLuong());
    }
    public float TinhLuong()
    {
    	return LuongCoban*HeSoLuong;
    }
}
