/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    public static void Menu() {
        System.out.println("1.Nhap 1 hoc vien");
        System.out.println("2.Nhap 1 nhan vien");
        System.out.println("3.Xuat thong tin 1 hoc vien ");
        System.out.println("4.Xuat thong tin 1 nhan vien");
        System.out.println("5.Thoat");
    }

    public static void main(String[] args) {
        Nguoi a = new HocVien();
        Nguoi b = new NhanVien();
        int chon;
        Scanner sc=new Scanner(System.in);
        do {            
            Menu();
            do {                
                System.out.println("Moi chon:");
                chon=sc.nextInt();
                if(chon<1||chon>5)
                    System.err.println("Chon sai!moi chon lai!");
            } while (chon<1||chon>5);
            if(chon==1){
                a.Nhap();
            }
            else if(chon==2){
                b.Nhap();
            }
            else if(chon==3){
                System.out.println(a.toString());
            }
            else if(chon==4){
                System.out.println(b.toString());
            }
        } while (chon!=5);
    }
}
