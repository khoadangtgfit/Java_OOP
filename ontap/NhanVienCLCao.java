/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVienCLCao extends NhanVien {
    private String TrinhDo,Nganh,NoiDaoTao;
    public NhanVienCLCao() {
        
    }
    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, String mapb, String tenpb) {
        super(Luong, NgayNhanViec, mapb, tenpb);
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }

    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, String mapb, String tenpb, String ten, NgayThangNam NamSinh) {
        super(Luong, NgayNhanViec, mapb, tenpb, ten, NamSinh);
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap trinh do:");
        TrinhDo =sc.nextLine();
        System.out.println("Nhap nganh:");
        Nganh =sc.nextLine();
        System.out.println("Nhap noi dao tao:");
        NoiDaoTao =sc.nextLine();
    }

    @Override
    public String toString() {
        return "NhanVienCLCao{" +super.toString()+ ", TrinhDo=" + TrinhDo + ", Nganh=" + Nganh + ", NoiDaoTao=" + NoiDaoTao + '}';
    }
    
    

   
    
}
