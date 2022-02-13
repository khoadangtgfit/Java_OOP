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

public class Main_ArrayList {
    public static void Menu(){
        System.out.println("1.Them");
        System.out.println("2.Xuat");
        System.out.println("3.Sap xep");
        System.out.println("0.Thoat");
   }
    public static void main(String[] args) {
         QuanLyDS a=new QuanLyDS();
         Scanner sc=new Scanner(System.in);
        int chon;
        a.Init();
        do {            
            Menu();
            do {                
                System.out.println("Moi chon:");
                chon=sc.nextInt();
                if(chon<0||chon>3)
                    System.err.println("Nhap sai moi nhap lai!");
            } while (chon<0||chon>3);
            if(chon==1){
                System.out.println("1.Nhap hoc vien");
                System.out.println("2.Nhap nhan vien quan ly");
                System.out.println("3.Nhap giao vien");
                System.out.println("4.Tro ve giao dien truoc");
                int x;
                do {                    
                    System.out.println("Moi chon:");
                    x=sc.nextInt();
                    if(x<1||chon>4){
                        System.err.println("Chon Lai!");
                    }
                } while (x<1||chon>4);
                if(x==4)
                    continue;
                a.Them(x);
            }
            else if(chon==2){
                System.out.println("1.Xuat DS hoc vien");
                System.out.println("2.Xuat DS nhan vien quan ly");
                System.out.println("3.Xuat DS giao vien");
                System.out.println("4.Xuat Tat Ca trong DS");
                System.out.println("5.Tro ve giao dien truoc");
                int x;
                do {                    
                    System.out.println("Moi chon:");
                    x=sc.nextInt();
                    if(x<1||chon>5){
                        System.err.println("Chon Lai!");
                    }
                } while (x<1||chon>5);
                if(x==5)
                    continue;
                a.Xuat(x);
            }
            else if(chon==3){
                a.SapXep();
            }
        } while (true);
    }
   
}
