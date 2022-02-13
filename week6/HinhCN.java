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
public class HinhCN implements Hinh {

    private float dai, rong;

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dai:");
        dai = sc.nextFloat();
        System.out.println("Nhap rong:");
        rong = sc.nextFloat();
    }

    @Override
    public void Xuat() {
        System.out.println("Hinh Chu Nhat:");
        System.out.println("-Chieu dai = " + dai);
        System.out.println("-Chieu rong = " + rong);
        System.out.println("-Dien tich = " + DienTich());
    }

    @Override
    public float DienTich() {
        return dai * rong;
    }

    public HinhCN() {
    }

    public HinhCN(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

}
