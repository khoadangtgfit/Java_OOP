/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MainDS {

    public static boolean KTSo(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        QuanLyDS a = new QuanLyDS();
        int chon = 0;
        String t;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Nhap DS hoc vien");
            System.out.println("2.Nhap DS nhan vien quan ly");
            System.out.println("3.Nhap DS giao vien");
            System.out.println("4.Xuat thong tin DS hoc vien");
            System.out.println("5.Xuat thong tin DS nhan vien quan ly");
            System.out.println("6.Xuat thong tin DS giao vien");
            System.out.println("0.Thoat");
            do {
                System.out.println("Moi lua chon:");
                t = sc.nextLine();
                if (KTSo(t)) {
                    chon = Integer.parseInt(t);
                } else {
                    System.err.println("Ban phai nhap so nguyen vao");
                }
                if (chon < 0 || chon > 6) {
                    System.err.println("Nhap lua chon sai(0<=chon<=6)");
                }
            } while (!KTSo(t) || chon < 0 || chon > 6);
            if(chon == 1)
            {
                a.ThemDSHocVien();
            }
            else if(chon == 2)
            {
                a.ThemDSNVQuanLy();
            }
            else if(chon == 3)
            {
                a.ThemDSGiaoVien();
            }
            else if(chon == 4)
            {
                a.XuatDSHocVien();
            }
            else if(chon == 5)
            {
                a.XuatDSNVQuanLy();
            }
            else if(chon == 6)
            {
                a.XuatDSGiaoVien();
            }
        } while (chon != 0);
    }
}
