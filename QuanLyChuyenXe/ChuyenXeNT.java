//  Họ và tên: Đặng Phước Khoa
 // Lớp:19DTHE1
 //MSSV:1911066165
package Tuan4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ChuyenXeNT extends ChuyenXe {
    private int SoChuyen;
    private int SoKm;

    public ChuyenXeNT() {
        //ham constructor mac dinh
    }
    public ChuyenXeNT(int SoChuyen, int SoKm, String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HoTenTaiXe, SoXe, DoanhThu);
        this.SoChuyen = SoChuyen;
        this.SoKm = SoKm;
        //ham constructor truyen doi so
    }

    public int getSoChuyen() {
        return SoChuyen;
    }

    public void setSoChuyen(int SoChuyen) {
        this.SoChuyen = SoChuyen;
    }

    public int getSoKm() {
        return SoKm;
    }

    public void setSoKm(int SoKm) {
        this.SoKm = SoKm;
    }
    public void Nhap()
    {   Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap so chuyen:");
        SoChuyen=sc.nextInt();
        System.out.println("Nhap so km:");
        SoKm=sc.nextInt();
    }
    @Override
    public String toString() {
        return "ChuyenXeNT{"+super.toString() + "SoChuyen=" + SoChuyen + ", SoKm=" + SoKm + '}';
    }
    
}
