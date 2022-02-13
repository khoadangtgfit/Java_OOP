//  Họ và tên: Đặng Phước Khoa
 // Lớp:19DTHE1
 //MSSV:1911066165
package Tuan4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ChuyenXe {
    protected String MaSoChuyen,HoTenTaiXe,SoXe; //tao cac thuoc tinh cua lop chuyen xe
    protected double DoanhThu;

    public ChuyenXe() {
        //constructor mac dinh
    }

    public ChuyenXe(String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        this.MaSoChuyen = MaSoChuyen;
        this.HoTenTaiXe = HoTenTaiXe;    //constructor truyen tham so day du
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma so chuyen:");
        MaSoChuyen=sc.nextLine();
        System.out.println("Nhap ho ten tai xe:");   //Ham Nhap thong tin cac chuyen xe
        HoTenTaiXe=sc.nextLine();
        System.out.println("Nhap so xe:");
        SoXe=sc.nextLine();
        System.out.println("Nhap doanh thu:");
        DoanhThu=sc.nextDouble();
    }
    public String toString() {
        return "ChuyenXe{" + "MaSoChuyen=" + MaSoChuyen + ", HoTenTaiXe=" + HoTenTaiXe + ", SoXe=" + SoXe + ", DoanhThu=" + DoanhThu + '}';
        //Ham xuat thong tin cac chuyen xe
    }

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }

    public void setMaSoChuyen(String MaSoChuyen) {
        this.MaSoChuyen = MaSoChuyen;
    }

    public String getHoTenTaiXe() {
        return HoTenTaiXe;
    }

    public void setHoTenTaiXe(String HoTenTaiXe) {
        this.HoTenTaiXe = HoTenTaiXe;
    }

    public String getSoXe() {
        return SoXe;
    }

    public void setSoXe(String SoXe) {
        this.SoXe = SoXe;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
   
    
}
