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
public class NVQuanLy  extends NhanVienCLCao{
    private double PhuCapCV;

    public NVQuanLy() {
    }

    public NVQuanLy(double PhuCapCV) {
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(double PhuCapCV, String trinhDo, String nganh, String noiDaoTao, double Luong, Class_Date NgayNhanViec, PBK Pbk) {
        super(trinhDo, nganh, noiDaoTao, Luong, NgayNhanViec, Pbk);
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(double PhuCapCV, String trinhDo, String nganh, String noiDaoTao, double Luong, Class_Date NgayNhanViec, PBK Pbk, Class_Date namSinh, String hoTen) {
        super(trinhDo, nganh, noiDaoTao, Luong, NgayNhanViec, Pbk, namSinh, hoTen);
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(double PhuCapCV, String trinhDo, String nganh, String noiDaoTao) {
        super(trinhDo, nganh, noiDaoTao);
        this.PhuCapCV = PhuCapCV;
    }

    @Override
    public void Nhap() {
        super.Nhap(); 
        Scanner sc=new Scanner(System.in);
        PhuCapCV=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "NVQuanLy{" +super.toString()+ "PhuCapCV=" + PhuCapCV + '}';
    }

    public double getPhuCapCV() {
        return PhuCapCV;
    }

    public void setPhuCapCV(double PhuCapCV) {
        this.PhuCapCV = PhuCapCV;
    }
    
}
