/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DSNhanVien {
    static ArrayList<NhanVien> arr=new ArrayList<>();
    public void Menu()
    { int chon;
        do {            
            System.out.println("1.Nhap");
            System.out.println("2.Xuat");
            System.out.println("3.Sap xep");
            System.out.println("0.Thoat");
            do {                
                System.out.println("Moi nhap lua chon:");
                chon=new Scanner(System.in).nextInt();
            } while (chon<0||chon>3);
            if(chon == 1)
            {
                NhanVien a=new NhanVien();
                a.Nhap();
                arr.add(a);
            }
            else if(chon == 2)
            {
                for(int i=0;i<arr.size();i++)
                {
                    System.out.println("Thong tin nhan vien thu "+(i+1));
                    arr.get(i).Xuat();
                }
            }
            else if(chon == 3)
            {
                arr.sort((p1,p2)->{
                    if(p1.getA()>p2.getA())
                        return 1;
                    else 
                        return -1;
                });
            }
        } while (true);
    }
}
