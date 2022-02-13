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
public class CDocGiaNguoiLon extends CDocGia{
    private String CMND;

    public CDocGiaNguoiLon() {
    }

    @Override
    public void Nhap() {
        super.Nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so CMND:");
        CMND=sc.nextLine();
    }   

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("CMND:"+CMND);//To change body of generated methods, choose Tools | Templates.
    }
    
    public float TinhTienLamThe()
    {
        return SoThanhHieuLuc*10000;
    }

    public CDocGiaNguoiLon(String CMND) {
        this.CMND = CMND;
    }

    public CDocGiaNguoiLon(String CMND, String HoTen, String NgayLamThe, int SoThanhHieuLuc) {
        super(HoTen, NgayLamThe, SoThanhHieuLuc);
        this.CMND = CMND;
    }
    
}
