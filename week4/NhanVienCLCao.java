/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NhanVienCLCao extends NhanVien{
    protected String trinhDo,nganh,noiDaoTao;

    public NhanVienCLCao() {
    }

    public NhanVienCLCao(String trinhDo, String nganh, String noiDaoTao, double Luong, Class_Date NgayNhanViec, PBK Pbk) {
        super(Luong, NgayNhanViec, Pbk);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    public NhanVienCLCao(String trinhDo, String nganh, String noiDaoTao, double Luong, Class_Date NgayNhanViec, PBK Pbk, Class_Date namSinh, String hoTen) {
        super(Luong, NgayNhanViec, Pbk, namSinh, hoTen);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    public NhanVienCLCao(String trinhDo, String nganh, String noiDaoTao) {
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    @Override
    public void Nhap() {
        super.Nhap(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap trinh do:");
        trinhDo=sc.nextLine();
        System.out.println("Nhap nganh:");
        nganh=sc.nextLine();
        System.out.println("Nhap noi dao tao:");
        noiDaoTao=sc.nextLine();
    }

    @Override
    public String toString() {
        return "NhanVienCLCao{" +super.toString()+ "trinhDo=" + trinhDo + ", nganh=" + nganh + ", noiDaoTao=" + noiDaoTao + '}';
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNoiDaoTao() {
        return noiDaoTao;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }
    
    
}
