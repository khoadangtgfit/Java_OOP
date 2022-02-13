//  Họ và tên: Đặng Phước Khoa
 // Lớp:19DTHE1
 //MSSV:1911066165
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GiangVien extends ConNguoi {
    private int SoTiet;
    private double luong;

    public GiangVien() {
    }

    public GiangVien(int SoTiet, double luong) {
        this.SoTiet = SoTiet;
        this.luong = luong;
    }

    public GiangVien(int SoTiet, double luong, String HoTen, String NgaySinh) {
        super(HoTen, NgaySinh);
        this.SoTiet = SoTiet;
        this.luong = luong;
    }

    public int getSoTiet() {
        return SoTiet;
    }

    public void setSoTiet(int SoTiet) {
        this.SoTiet = SoTiet;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tiet");
        SoTiet=sc.nextInt();
        System.out.println("Nhap luong:");
        luong =sc.nextDouble();
    }
    @Override
    public String toString() {
        return "GiangVien{" +super.toString()+ "SoTiet=" + SoTiet + ", luong=" + luong + '}';
    }

    
    
    
}
