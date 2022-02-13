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
public class GiaoVien extends NhanVienCLCao{
    private Double ThuLaoGD;

    public GiaoVien() {
    }

    public GiaoVien(Double ThuLaoGD) {
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(Double ThuLaoGD, String TrinhDo, String Nganh, String NoiDaoTao) {
        super(TrinhDo, Nganh, NoiDaoTao);
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(Double ThuLaoGD, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, Class_Date NgayNhanViec, PhongBanKhoa PBK) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK);
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(Double ThuLaoGD, String TrinhDo, String Nganh, String NoiDaoTao, double Luong, Class_Date NgayNhanViec, PhongBanKhoa PBK, String ten, Class_Date NgaySinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, PBK, ten, NgaySinh);
        this.ThuLaoGD = ThuLaoGD;
    }

    public Double getThuLaoGD() {
        return ThuLaoGD;
    }

    public void setThuLaoGD(Double ThuLaoGD) {
        this.ThuLaoGD = ThuLaoGD;
    }
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap thu lao:");
        ThuLaoGD=sc.nextDouble();
    }
    @Override
    public String toString() {
        return "GiaoVien{" +super.toString()+ "ThuLaoGD=" + ThuLaoGD + '}';
    }
    
}
