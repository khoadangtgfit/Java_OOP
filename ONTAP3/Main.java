/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ONTAP3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static int PhaiChonDung(String t, int x, int y) {
        int chon = 0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi chon(" + x + "<=chon<=" + y + "):");
            try {
                t = sc.nextLine();
                chon = Integer.parseInt(t);
                flag = true;
            } catch (Exception e) {
                System.out.println("Ban vua nhap khong phai so!Moi nhap lai!");
            }
            if (chon < x || chon > y) {
                System.out.println("Chon sai! Moi chon lai!");
            }
        } while (!flag || chon < x || chon > y);
        return chon;
    }

    public static void main(String[] args) {
        QuanLyDS a = new QuanLyDS();
        a.init();
        int chon = 0;
        String t = "";
        do {
            System.out.println("==============================");
            System.out.println("|            1.Them          |");
            System.out.println("|            2.Xuat          |");
            System.out.println("|            0.Thoat         |");
            System.out.println("==============================");
            chon = PhaiChonDung(t, 0, 2);
            if (chon == 1) {
                System.out.println("=========================================");
                System.out.println("|       1.Them 1 Hoc Vien               |");
                System.out.println("|       2.Them 1 nhan vien quan ly      |");
                System.out.println("|       3.Them 1 giao vien              |");
                System.out.println("|       4.Tro ve giao dien truoc        |");
                System.out.println("=========================================");
                String x = "";
                int f = PhaiChonDung(x, 1, 4);
                if (f == 4) {
                    continue;
                } else {
                    a.Them(f);
                }
            } else if (chon == 2) {
                System.out.println("==========================================");
                System.out.println("|       1.Xuat DS Hoc Vien               |");
                System.out.println("|       2.Xuat DS nhan vien quan ly      |");
                System.out.println("|       3.Xuat DS giao vien              |");
                System.out.println("|       4.Xuat Tat Ca DS                 |");
                System.out.println("|       5.Tro ve giao dien truoc         |");
                System.out.println("==========================================");
                String x = "";
                int f = PhaiChonDung(x, 1, 5);
                if (f == 5) {
                    continue;
                } else {
                    a.Xuat(f);
                }
            }
        } while (chon != 0);
    }

}
