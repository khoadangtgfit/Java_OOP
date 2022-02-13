/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DemoDSHH_ArrayList {
    public static void main(String[] args) {
        DSHangHoa_ArrayList a=new DSHangHoa_ArrayList();
    a.inti();
    int chon;
    Scanner sc=new Scanner(System.in);
    do
    {
        System.out.println("=================Menu================");
        System.out.println("|       1.Nhap 1 Hang Hoa DM         |");
        System.out.println("|       2.Nhap 1 Hang hoa TP         |");
        System.out.println("|       3.Xuat DS Hang Hoa DM        |");
        System.out.println("|       4.Xuat DS Hang Hoa TP        |");
        System.out.println("|       5.Sap xep                    |");
        System.out.println("|       6.Xuat Danh Sach             |");
        System.out.println("|       7.Xoa 1 Hang DM theo ma      |");
        System.out.println("|       8.Xoa 1 Hang TP theo ma      |");
        System.out.println("|       9.Tim kiem hang hoa theo ma  |");
        System.out.println("=====================================");
        do {            
            System.out.println("Moi ban chon:");
            chon=sc.nextInt();
            if(chon<0||chon>9)
                System.err.println("Lua chon sai!Moi chon lai");
        } while (chon<0||chon>9);
        if(chon == 1)
        {
            a.Them1HangDM();
        }
        else if(chon == 2)
        {
            a.Them1HangTP();
        }
        else if(chon == 3)
        {
            a.XuatDSHangDM();
        }
        else if(chon == 4)
        {
            a.XuatDSHangTP();
        }
        else if(chon == 5)
        {
            a.SapXep();
        }
        else if(chon == 6)
        {
            a.XuatDS();
        }
        else if(chon == 7)
        {
            Scanner s=new Scanner(System.in);
            String ma;
            System.out.println("Nhap ma can xoa:");
            ma=s.nextLine();
            a.Xoa1HangDM(ma);
        }
        else if(chon == 8)
        {
            String ma;
            Scanner t=new Scanner(System.in);
            System.out.println("Nhap ma can xoa:");
            ma=t.nextLine();
            a.Xoa1HangTP(ma);
        }
        else if(chon == 9)
        {
            String ma;
            ma=sc.nextLine();
            a.TimKiemHangHoa(ma);
        }
    }while(chon!=0);  
    }
}
