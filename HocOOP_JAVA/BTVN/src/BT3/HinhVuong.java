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
public class HinhVuong implements Hinh{
    private double Canh;

    public HinhVuong(double Canh) {
        this.Canh = Canh;
    }

    public HinhVuong() {
    }

    public double getCanh() {
        return Canh;
    }

    public void setCanh(double Canh) {
        this.Canh = Canh;
    }
    
    @Override
    public void Nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh cua hinh vuong:");
        Canh=sc.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.println("Hinh Vuong:");
        System.out.println("-Canh="+Canh);
        System.out.println("-Dien tich="+TinhDT());
        System.out.println("-Chu vi="+TinhCV());
    }

    @Override
    public double TinhDT() {
            return Canh*Canh;
    }
    @Override
    public double TinhCV() {
        return 4*Canh;
    }
    
}
