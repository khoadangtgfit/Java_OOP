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
public class HangDM extends HangHoa{
    private int thoigianbh;
    private int dienap;
    private int congsuat;

    public HangDM() {
    }

    public HangDM(int thoigianbh, int dienap, int congsuat, String maHang, String tenHang, long donGia) {
        super(maHang, tenHang, donGia);
        this.thoigianbh = thoigianbh;
        this.dienap = dienap;
        this.congsuat = congsuat;
    }

    public int getThoigianbh() {
        return thoigianbh;
    }

    public void setThoigianbh(int thoigianbh) {
        this.thoigianbh = thoigianbh;
    }

    public int getDienap() {
        return dienap;
    }

    public void setDienap(int dienap) {
        this.dienap = dienap;
    }

    public int getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
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
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap thoi gian bao hanh:");
        thoigianbh=sc.nextInt();
        System.out.println("Nhap dien ap:");
        dienap=sc.nextInt();
        System.out.println("Nhap cong suat:");
        congsuat=sc.nextInt();
        
    }
    public String toString()
    {
        return "HangDm{"+super.toString()+",thoigianbh="+thoigianbh+",dienap="+dienap+",congsuat="+congsuat+"}";
    }

    
    
}
