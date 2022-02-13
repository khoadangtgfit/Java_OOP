/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class HocSinh {
    private String maSV,hoTen;
    private float diemTB;

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma so:");
        maSV=sc.nextLine();
        System.out.println("Nhap ho ten:");
        hoTen=sc.nextLine();
        System.out.println("Nhap diem trung binh:");
        diemTB=sc.nextFloat();
    }
    void rank()
    {
        if(diemTB<5)
            System.out.println("Xep loai yeu");
        else if(diemTB>=5&&diemTB<7)
            System.out.println("Xep loai trung binh");
        else if(diemTB>=7&&diemTB<8)
            System.out.println("Xep loai kha");
        else
            System.out.println("Xep loai gioi");
    }
    public void output()
    {
        System.out.println("Ma So:"+maSV);
        System.out.println("Ho Ten:"+hoTen);
        System.out.println("Diem TB:"+diemTB );
    }
}
