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
public class HinhVuong implements Hinh {

    private float Canh;

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap canh:");
            Canh = sc.nextFloat();
        } while (Canh <= 0);
    }

    @Override
    public void Xuat() {
        System.out.println("Hinh Vuong:");
        System.out.println("-Canh =" + Canh);
        System.out.println("-Dien Tich =" + DienTich());
    }

    @Override
    public float DienTich() {
        return Canh * Canh;
    }

    public HinhVuong() {
    }

    public HinhVuong(float Canh) {
        this.Canh = Canh;
    }

    public float getCanh() {
        return Canh;
    }

    public void setCanh(float Canh) {
        this.Canh = Canh;
    }

}
