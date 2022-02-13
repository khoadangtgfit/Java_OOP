/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HinhChuNhat implements Hinh{
    private double Dai,Rong;
    @Override
    public void Nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu dai:");
        Dai=sc.nextDouble();
        System.out.println("Nhap chieu rong:");
        Rong=sc.nextDouble();
    }

    public HinhChuNhat(double Dai, double Rong) {
        this.Dai = Dai;
        this.Rong = Rong;
    }

    public HinhChuNhat() {
    }

    public double getDai() {
        return Dai;
    }

    public void setDai(double Dai) {
        this.Dai = Dai;
    }

    public double getRong() {
        return Rong;
    }

    public void setRong(double Rong) {
        this.Rong = Rong;
    }
    
    @Override
    public void Xuat() {
        System.out.println("Hinh chu nhat:");
        System.out.println("-Chieu dai="+Dai);
        System.out.println("-Chieu rong="+Rong);
        System.out.println("-Dien tich ="+TinhDT());
        System.out.println("-Tinh chu vi="+TinhCV());
    }

    @Override
    public double TinhDT() {
        return Dai*Rong;
    }

    @Override
    public double TinhCV() {
        return (Dai+Rong)*2;
    }
    
}
