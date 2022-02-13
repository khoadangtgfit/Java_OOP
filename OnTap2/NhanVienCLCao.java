/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVienCLCao extends NhanVien{
    protected String TrinhDo;
    protected String Nganh;
    protected String NoiDaoTao;

    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao) {
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }

    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, String NgayNhanViec, String MaPBK, String TenPBK, String HoTen, String NS) {
        super(Luong, NgayNhanViec, MaPBK, TenPBK, HoTen, NS);
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }

    

    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK, String HoTen, NgayThangNam NgaySinh) {
        super(Luong, NgayNhanViec, PBK, HoTen, NgaySinh);
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }
    
    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, PhongBanKhoa PBK) {
        super(Luong, NgayNhanViec, PBK);
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }
    
    public NhanVienCLCao() {
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

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap trinh do:");
        TrinhDo=sc.nextLine();
        System.out.println("Nhap nganh dao tao:");
        Nganh=sc.nextLine();
        System.out.println("Nhap noi dao tao:");
        NoiDaoTao=sc.nextLine();
    }

    @Override
    public String toString() {
        return "NhanVienCLCao{" +super.toString()+ "TrinhDo=" + TrinhDo + ", Nganh=" + Nganh + ", NoiDaoTao=" + NoiDaoTao + '}';
    }
    
}
