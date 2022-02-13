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
public class NhanVienCLCao extends NhanVien {
    protected String TrinhDo,Nganh,NoiDaoTao;

    public NhanVienCLCao() {
    }

    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao) {
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }

    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, Class_Date NgayNhanViec, PhongBanKhoa PBK) {
        super(Luong, NgayNhanViec, PBK);
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }

    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, Class_Date NgayNhanViec, PhongBanKhoa PBK, String ten, Class_Date NgaySinh) {
        super(Luong, NgayNhanViec, PBK, ten, NgaySinh);
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap trinh do:");
        TrinhDo=sc.nextLine();
        System.out.println("Nhap nganh:");
        Nganh=sc.nextLine();
        System.out.println("Nhap noi dao tao:");
        NoiDaoTao=sc.nextLine();
    }
    @Override
    public String toString() {
        return super.toString()+ "TrinhDo=" + TrinhDo + ", Nganh=" + Nganh + ", NoiDaoTao=" + NoiDaoTao +",";
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public String getNoiDaoTao() {
        return NoiDaoTao;
    }

    public void setNoiDaoTao(String NoiDaoTao) {
        this.NoiDaoTao = NoiDaoTao;
    }
    
}
