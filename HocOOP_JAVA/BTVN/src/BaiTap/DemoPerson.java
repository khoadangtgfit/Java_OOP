/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DemoPerson {
    public static void main(String[] args) {
        QuanLyPerSon a=new QuanLyPerSon();
        
        int chon;
        do {            
            System.out.println("1.Nhap 1 sv");
            System.out.println("2.Xuat danh sach");
            System.out.println("3.Tim kiem ");
            System.out.println("4.xoat sv");
            do {                
                System.out.println("Moi lua chon:");
                Scanner sc=new Scanner(System.in);
                chon=sc.nextInt();
                if(chon<0||chon>4)
                    System.out.println("Chon sai moi chon lai");
               
            } while (chon<0||chon>4);
            if(chon == 1)
            {
                a.Nhap1SinhVien();
            }
            else if(chon ==2)
                a.XuatDSSinhVien();
            else if(chon ==3)
            {
                String ten;
                Scanner b=new Scanner(System.in);
                System.out.println("Nhap ten sinh vien can tim:");
                ten=b.nextLine();
                a.TimKiemSV(ten);
            }
            else if(chon ==4)
            {
                String ten;
                Scanner sc=new Scanner(System.in);
                System.out.println("Nhap ten sinh vien can xoa:");
                ten=sc.nextLine();
                a.XoaSV(ten);
            }
        } while (chon!=0);
    }
}
