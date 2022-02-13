//  Họ và tên: Đặng Phước Khoa
 // Lớp:19DTHE1
 //MSSV:1911066165
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVien extends ConNguoi{
    private double Luong;
    private String ChucVu;

    public NhanVien() {
    }

    public NhanVien(double Luong, String ChucVu) {
        this.Luong = Luong;
        this.ChucVu = ChucVu;
    }

    public NhanVien(double Luong, String ChucVu, String HoTen, String NgaySinh) {
        super(HoTen, NgaySinh);
        this.Luong = Luong;
        this.ChucVu = ChucVu;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuc vu:");
        ChucVu =sc.nextLine();
        System.out.println("Nhap luong:");
        Luong =sc.nextDouble();
    }

    @Override
    public String toString() {
        return "NhanVien{" +super.toString()+ "Luong=" + Luong + ", ChucVu=" + ChucVu + '}';
    }
    
}
