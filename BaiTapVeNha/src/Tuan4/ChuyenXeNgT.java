//  Họ và tên: Đặng Phước Khoa
 // Lớp:19DTHE1
 //MSSV:1911066165
package Tuan4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ChuyenXeNgT extends ChuyenXe {
    private String NoiDen;
    private int SoNgayDiDuoc;

    public ChuyenXeNgT(String NoiDen, int SoNgayDiDuoc, String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HoTenTaiXe, SoXe, DoanhThu);
        this.NoiDen = NoiDen;
        this.SoNgayDiDuoc = SoNgayDiDuoc;
    }

    public ChuyenXeNgT() {
        this.NoiDen="";
        this.SoNgayDiDuoc=0;
    }
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap noi den:");
        NoiDen=sc.nextLine();
        System.out.println("Nhap so ngay di duoc:");
        SoNgayDiDuoc=sc.nextInt();
    }

    @Override
    public String toString() {
        return "ChuyenXeNgT{" +super.toString()+ "NoiDen=" + NoiDen + ", SoNgayDiDuoc=" + SoNgayDiDuoc + '}';
    }
   
}
