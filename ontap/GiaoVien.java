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
public class GiaoVien extends NhanVienCLCao{
    private double ThuLaoGD;

    public GiaoVien() {
    }

    public GiaoVien(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, String mapb, String tenpb) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, mapb, tenpb);
    }

    public GiaoVien(String TrinhDo, String Nganh, String NoiDaoTao, double Luong, NgayThangNam NgayNhanViec, String mapb, String tenpb, String ten, NgayThangNam NamSinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, mapb, tenpb, ten, NamSinh);
    }

    public double getThuLaoGD() {
        return ThuLaoGD;
    }

    public void setThuLaoGD(double ThuLaoGD) {
        this.ThuLaoGD = ThuLaoGD;
    }

    @Override
    public void Nhap() {
        super.Nhap(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap thu lao CV:");
        ThuLaoGD=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "GiaoVien{" +super.toString()+ "ThuLaoGD=" + ThuLaoGD + '}';
    }
    
    
}
