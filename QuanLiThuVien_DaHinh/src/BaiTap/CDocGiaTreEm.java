/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CDocGiaTreEm extends CDocGia{
    private String NguoiDaiDien;

    public CDocGiaTreEm() {
    }
    
    @Override
    public void Nhap() {
        Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap ten nguoi dai dien:");
        NguoiDaiDien=sc.nextLine();
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Nguoi dai dien:"+NguoiDaiDien);
        //To change body of generated methods, choose Tools | Templates.
    }
    public int TinhTienLamThe()
    {
        return SoThanhHieuLuc*3000;
    }

    public String getNguoiDaiDien() {
        return NguoiDaiDien;
    }

    public void setNguoiDaiDien(String NguoiDaiDien) {
        this.NguoiDaiDien = NguoiDaiDien;
    }

    public CDocGiaTreEm(String NguoiDaiDien) {
        this.NguoiDaiDien = NguoiDaiDien;
    }

    public CDocGiaTreEm(String NguoiDaiDien, String HoTen, String NgayLamThe, int SoThanhHieuLuc) {
        super(HoTen, NgayLamThe, SoThanhHieuLuc);
        this.NguoiDaiDien = NguoiDaiDien;
    }
    
}
