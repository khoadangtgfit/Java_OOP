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
public class HinhTron implements Hinh{
    private double bankinh;
    @Override
    public void Nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        bankinh=sc.nextDouble();
    }

    public HinhTron() {
    }
    
    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    
    @Override
    public void Xuat() {
        System.out.println("Hinh Tron:");
        System.out.println("-Ban kinh= "+bankinh);
        System.out.println("-Dien tich="+TinhDT());
        System.out.println("-Chu vi="+TinhCV());
    }

    @Override
    public double TinhDT() {
        return PI*bankinh*bankinh;
    }

    @Override
    public double TinhCV() {
        return 2*PI*bankinh;
    }
    
}
