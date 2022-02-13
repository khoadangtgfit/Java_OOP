/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HangHoa {
    protected String maHang,tenHang;
    protected long donGia;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma hang:");
        maHang=sc.nextLine();
        System.out.println("Nhap ten hang:");
        tenHang=sc.nextLine();
        System.out.println("Nhap don gia:");
        donGia=sc.nextLong();
    }
    public String toString()
    {
        return "HangHoa{"+"maHang="+maHang+",tenHang="+tenHang+",donGia="+donGia+"}";
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
    
}
