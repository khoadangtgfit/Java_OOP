/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */

public class DemoNhanVien {
    public static boolean CheckSo(String so){
        try {
            Integer.parseInt(so);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        HocVien a=new HocVien();
        a.init();
        int chon=0;
        Scanner sc=new Scanner(System.in);
        do {            
            System.out.println("1.Nhap Thong Tin Hoc Vien");
            System.out.println("2.Xuat Thong Tin Hoc Vien");
            System.out.println("3.Sap Xep");
            System.out.println("0.Thoat");
            do {                
                System.out.println("Moi lua chon:");
                chon=sc.nextInt();
                if(chon<0||chon>3){
                    System.err.println("Lua chon sai! Moi chon lai!");
                }
            } while (chon<0||chon>3);
            if(chon==1){
                System.out.println("1.Nhap thong tin nhan vien quan ly");
                System.out.println("2.Nhap thong tin nhan vien nghien cuu");
                System.out.println("3.Nhap thong tin nhan vien phuc vu");
                System.out.println("4.Tro ve giao dien truoc");
                int x;
                do {                    
                    System.out.println("Moi chon:");
                    x=sc.nextInt();
                } while (x<1||x>4);
                if(x==4)
                    continue;
                a.Nhap1NhanVien(x);
            }
            else if(chon==2){
                System.out.println("1.Xuat DS nhan vien quan ly");
                System.out.println("2.Xuat DS nhan vien nghien cuu");
                System.out.println("3.Xuat DS nhan vien phuc vu");
                System.out.println("4.Xuat Tat Ca Nhan Vien");
                System.out.println("5.Tro ve giao dien truoc");
                int x;
                do {                    
                    System.out.println("Moi chon:");
                    x=sc.nextInt();
                } while (x<1||x>5);
                if(x==5)
                    continue;
                a.XuatDSNV(x);
            }
            else if(chon==3){
                System.out.println("1.Sap Xep Cach 1");
                System.out.println("2.Sap Xep Cach 2");
                System.out.println("3.Tro ve giao dien truoc");
                int x;
                do {                    
                    System.out.println("Moi chon:");
                    x=sc.nextInt();
                } while (x<1||x>3);
                if(x==1){
                    a.SapXepTheoLuongC1();
                }
                else if(x==2){
                    a.SapXepTheoLuongC2();
                }
                else if(x==3){
                    continue;
                }
            }
        } while (chon!=0);
    }
}
