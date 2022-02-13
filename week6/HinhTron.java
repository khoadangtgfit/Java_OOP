/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HinhTron implements Hinh {

    private float bankinh;

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap ban kinh:");
            bankinh = sc.nextFloat();
        } while (bankinh <= 0);
    }

    @Override
    public void Xuat() {
        System.out.println("Hinh tron:");
        System.out.println("-Ban kinh = " + bankinh);
        System.out.println("-Dien tich = " + DienTich());
    }

    @Override
    public float DienTich() {
        return (float) Math.pow(Hinh.Pi, 2) * bankinh;
    }

    public HinhTron() {
    }

    public HinhTron(float bankinh) {
        this.bankinh = bankinh;
    }

    public float getBankinh() {
        return bankinh;
    }

    public void setBankinh(float bankinh) {
        this.bankinh = bankinh;
    }

}
