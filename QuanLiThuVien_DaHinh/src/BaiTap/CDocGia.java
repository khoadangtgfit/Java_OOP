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
public class CDocGia {
    protected String HoTen;
    protected String NgayLamThe;
    protected int SoThanhHieuLuc;
    protected boolean KT;

    public boolean getKT() {
        return KT;
    }

    public void setKT(boolean KT) {
        this.KT = KT;
    }
    
    public CDocGia() {
    }

    public CDocGia(String HoTen, String NgayLamThe, int SoThanhHieuLuc) {
        this.HoTen = HoTen;
        this.NgayLamThe = NgayLamThe;
        this.SoThanhHieuLuc = SoThanhHieuLuc;
    }
    
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi nhap ho ten:");
        HoTen=sc.nextLine();
        System.out.println("Moi nhap ngay lam the:");
        NgayLamThe=sc.nextLine();
        System.out.println("Moi nhap so thang co hieu luc:");
        SoThanhHieuLuc=sc.nextInt();
    }
    public void Xuat()
    {
        System.out.println("Ho ten:"+HoTen);
        System.out.println("Ngay lam the:"+NgayLamThe);
        System.out.println("So thang co hieu luc:"+SoThanhHieuLuc);
    }
}
