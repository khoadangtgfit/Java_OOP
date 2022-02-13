/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static int PhaiChonDung(String t, int x, int y) {
        int chon = 0;
        try {
            chon = Integer.parseInt(t);
        } catch (Exception e) {
            return 1;

        }
        if (chon < x || chon > y) {
            return 2;
        }
        return 0;

    }

    public static void Menu() {
        System.out.println("1.Them");
        System.out.println("2.Xuat");
        System.out.println("3.Sap Xep");
        System.out.println("4.Tim nhan vien");
        System.out.println("0.Thoat");
    }

    public static void main(String[] args) {
        DSQuanLy_QL a = new DSQuanLy_QL();
        a.init();

        a.XuatNhanVienThu2();
        a.Xuat2();
        
//        Scanner sc = new Scanner(System.in);
//        String t;
//        int chon = 0;
//        do {
//            Menu();
//            do {
//                System.out.println("Moi chon:");
//                t = sc.nextLine();
//                if (PhaiChonDung(t, 0, 4) == 1) {
//                    System.err.println("Ban phai nhap so vao! Moi Nhap lai");
//                } else if (PhaiChonDung(t, 0, 4) == 2) {
//                    System.err.println("Lua chon sai(0<=chon<=4)!Moi chon lai!");
//                }
//            } while (PhaiChonDung(t, 0, 4) != 0);
//            chon = Integer.parseInt(t);
//            switch (chon) {
//                case 1:
//                    System.out.println("1.Nhap 1 hoc vien");
//                    System.out.println("2.Nhap 1 nhan vien ql");
//                    System.out.println("3.Nhap 1 giao vien");
//                    System.out.println("4.Tro ve giao dien truoc");
//                    String b;
//                    int x;
//                    do {
//                        System.out.println("Moi chon:");
//                        b = sc.nextLine();
//                        if (PhaiChonDung(b, 1, 4) == 1) {
//                            System.err.println("Ban phai nhap so vao! Moi Nhap lai");
//                        } else if (PhaiChonDung(b, 1, 4) == 2) {
//                            System.err.println("Lua chon sai(1<=chon<=4)!Moi chon lai!");
//                        }
//                        int g=PhaiChonDung(b, 0, 4);
//                    } while (PhaiChonDung(b, 0, 4) != 0);
//                    x=Integer.parseInt(b);
//                    if(x==4){
//                        continue;
//                    }
//                    else{
//                        a.Them(x);
//                    }
//                    break;
//                case 2:
//                    System.out.println("1.Xuat DS hoc vien");
//                    System.out.println("2.Xuat DS nhan vien ql");
//                    System.out.println("3.Xuat DS giao vien");
//                    System.out.println("4.Xuat Tat Ca DS");
//                    System.out.println("5.Tro ve giao dien truoc");
//                    String c;
//                    int y;
//                    do {
//                        System.out.println("Moi chon:");
//                        c = sc.nextLine();
//                        if (PhaiChonDung(c, 1, 5) == 1) {
//                            System.err.println("Ban phai nhap so vao! Moi Nhap lai");
//                        } else if (PhaiChonDung(c, 1, 5) == 2) {
//                            System.err.println("Lua chon sai(1<=chon<=4)!Moi chon lai!");
//                        }
//                    } while (PhaiChonDung(c, 0, 5) != 0);
//                    y=Integer.parseInt(c);
//                    if(y==5){
//                        continue;
//                    }
//                    else{
//                        a.Xuat(y);
//                    }
//                    break;
//                case 3:
//                    System.out.println("1.Sap Xep Bang Cach 1");
//                    System.out.println("2.Sap Xep Bang Cach 2");
//                    System.out.println("3.Tro ve giao dien truoc");
//                    String u;
//                    int i;
//                    do {
//                        System.out.println("Moi chon:");
//                        u = sc.nextLine();
//                        if (PhaiChonDung(u, 1, 3) == 1) {
//                            System.err.println("Ban phai nhap so vao! Moi Nhap lai");
//                        } else if (PhaiChonDung(u, 1, 3) == 2) {
//                            System.err.println("Lua chon sai(1<=chon<=3)!Moi chon lai!");
//                        }
//                    } while (PhaiChonDung(u, 0, 3) != 0);
//                    i=Integer.parseInt(u);
//                    if(i==3){
//                        continue;
//                    }
//                    else{
//                        a.SapXep(i);
//                    }
//                    break;
//                case 4: System.out.println("Nhap luong can tim:");
//                double luong=sc.nextDouble();
//                a.TimNhanVien(luong);
//                break;
//            }
//        } while (chon != 0);


    }
}
