/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhanVien {
    private int a;
    public void Nhap()
    {
        a=new Scanner(System.in).nextInt();
    }
    public void Xuat()
    {
        System.out.println("a="+a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
