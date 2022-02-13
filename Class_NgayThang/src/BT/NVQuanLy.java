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
public class NVQuanLy extends NhanVienCLCao{
    private double PhuCapCV;

    public NVQuanLy(double PhuCapCV) {
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(double PhuCapCV, String TrinhDo, String Nganh, String NoiDaoTao) {
        super(TrinhDo, Nganh, NoiDaoTao);
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(double PhuCapCV, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, Class_Date NgayNhanViec, PhongBanKhoa PBK) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK);
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(double PhuCapCV, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, Class_Date NgayNhanViec, PhongBanKhoa PBK, String ten, Class_Date NgaySinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK, ten, NgaySinh);
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy() {
    }

    public double getPhuCapCV() {
        return PhuCapCV;
    }

    public void setPhuCapCV(double PhuCapCV) {
        this.PhuCapCV = PhuCapCV;
    }
    
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap phu cap:");
        PhuCapCV=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "NVQuanLy{" +super.toString()+ "PhuCapCV=" + PhuCapCV + '}';
    }
    
    
}
