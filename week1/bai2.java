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
public class bai2 {
    public static class SinhVien{
        private String maSV,hoTen;
        private int tuoi,namSinh;
        private double diemTB;

        public SinhVien() {
        }

       
        public void Nhap()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Nhap ma so sv:");
            maSV=sc.nextLine();
            System.out.println("Nhap ho ten");
            hoTen=sc.nextLine();
            System.out.println("Nhap tuoi:");
            tuoi=sc.nextInt();
            System.out.println("Nhap nam sinh:");
            namSinh=sc.nextInt();
            System.out.println("Nhap diem TB:");
            diemTB=sc.nextDouble();
        }
        public void Xuat()
        {
            System.out.println("MSSV:"+maSV);
            System.out.println("Ho Ten:"+hoTen);
            System.out.println("Tuoi:"+tuoi);
            System.out.println("Nam Sinh:"+namSinh);
            System.out.println("Diem TB:"+diemTB);
        }
        
    };
    public static void main(String []args)
    {
        SinhVien sv=new SinhVien();
        sv.Nhap();
        sv.Xuat();
    }
}
