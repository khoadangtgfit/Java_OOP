/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap4;

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
            try {
                System.out.println("Moi chon(" + x + "<=chon<=" + y + "):");
                t = sc.nextLine();
                chon = Integer.parseInt(t);
                flag = true;
            } catch (Exception e) {
                System.out.println("Ban vua nhap khong phai la so!Moi nhap lai!");
            }
            if (chon < x || chon > y) {
                System.out.println("Nhap sai!Moi nhap lai!");
            }
        } while (!flag || chon < x || chon > y);
        return chon;
    }

    public static void main(String[] args) {
        DSQuanLy a = new DSQuanLy();
        int chon = 0;
        a.init();
        String t = "";
        do {
            System.out.println("=============================");
            System.out.println("|           1.Them          |");
            System.out.println("|           2.Xuat          |");
            System.out.println("|           3.Sap Xep       |");
            System.out.println("|           0.Thoat         |");
            System.out.println("=============================");
            chon = PhaiChonDung(t, 0, 3);
            if (chon == 1) {
                String x="";
                int f;
                System.out.println("========================================");
                System.out.println("|           1.Nhap 1 hoc vien          |");
                System.out.println("|           2.Nhap 1 NV Quan Ly        |");
                System.out.println("|           3.Nhap 1 Giao Vien         |");
                System.out.println("|           4.Tro Ve Giao Dien Truoc   |");
                System.out.println("========================================");
                f=PhaiChonDung(x, 1, 4);
                if(f==4){
                    continue;
                }
                else{
                    a.Them(f);
                }
            }
            else if(chon==2){
                String x="";
                int f;
                System.out.println("========================================");
                System.out.println("|           1.Xuat DS hoc vien          |");
                System.out.println("|           2.Xuat DS NV Quan Ly        |");
                System.out.println("|           3.Xuat DS Giao Vien         |");
                System.out.println("|           4.Xuat tat ca DS            |");
                System.out.println("|           5.Tro ve giao dien truoc    |");
                System.out.println("========================================");
                f=PhaiChonDung(x, 1, 5);
                if(f==5){
                    continue;
                }
                else{
                    a.Xuat(f);
                }
            }
            else if(chon==3){
                a.SapXepTheoTen();
            }
        } while (chon!=0);
    }
}
