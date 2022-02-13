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
public class TamGiac implements Hinh{
    private double Canh1,Canh2,Canh3;

    public TamGiac(double Canh1, double Canh2, double Canh3) {
        this.Canh1 = Canh1;
        this.Canh2 = Canh2;
        this.Canh3 = Canh3;
    }

    public TamGiac() {
    }

    public double getCanh1() {
        return Canh1;
    }

    public void setCanh1(double Canh1) {
        this.Canh1 = Canh1;
    }

    public double getCanh2() {
        return Canh2;
    }

    public void setCanh2(double Canh2) {
        this.Canh2 = Canh2;
    }

    public double getCanh3() {
        return Canh3;
    }

    public void setCanh3(double Canh3) {
        this.Canh3 = Canh3;
    }

    @Override
    public void Nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh 1:");
        Canh1=sc.nextDouble();
        System.out.println("Nhap canh 2:");
        Canh2 =sc.nextDouble();
        System.out.println("Canh 3:");
        Canh3=sc.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.println("Tam Giac:");
        System.out.println("-Canh 1="+Canh1);
        System.out.println("-Canh 2="+Canh2);
        System.out.println("-Canh 3="+Canh3);
        System.out.println("-Dien tich="+TinhDT());
        System.out.println("-Chu vi="+TinhCV());
    }

    @Override
    public double TinhDT() {
        double p=(Canh1+Canh2+Canh3)/3;
        return Math.sqrt(p*(p-Canh1)*(p-Canh2)*(p-Canh3));
    }

    @Override
    public double TinhCV() {
        return Canh1+Canh2+Canh3;
    }
    
}
