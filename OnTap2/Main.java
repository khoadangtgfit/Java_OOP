/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static int PhaiChonDung(int x, int y) {
        int chon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi chon:");
            chon = sc.nextInt();
            if (chon < x || chon > y) {
                System.err.println("Lua chon sai Moi chon lai!");
            }
        } while (chon < x || chon > y);
        return chon;
    }

    public static void main(String[] args) {
        QuanLyDS a = new QuanLyDS();
        int chon = 0;
        Scanner sc = new Scanner(System.in);
       
        khoa: do {
            System.out.println("1.Nhap");
            System.out.println("2.Xuat");
            System.out.println("0.Thoat");
            chon = PhaiChonDung(0, 2);
            if (chon == 1) {
            int x;
                System.out.println("1.Nhap 1 Hoc vien");
                System.out.println("2.Nhap 1 Nhan Vien Quan Ly");
                System.out.println("3.Nhap 1 Giao Vien ");
                System.out.println("4.Tro ve Giao Dien Truoc");
                x = PhaiChonDung(1, 4);
                if(x==4){
                    continue khoa;
                }
                a.Them(x);
        }
            else if(chon==2){
                int x;
                System.out.println("1.Xuat DS Hoc vien");
                System.out.println("2.Xuat DS Nhan Vien Quan Ly");
                System.out.println("3.Xuat DS Giao Vien ");
                System.out.println("4.Xuat het DS");
                System.out.println("5.Tro ve Giao Dien Truoc");
                x = PhaiChonDung(1, 5);
                if(x==5){
                    continue khoa;
                }
                a.Xuat(x);
            }
        } while (chon != 0);
        
    }

}
