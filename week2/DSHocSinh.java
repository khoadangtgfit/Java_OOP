/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import week1.HocSinh;
/**
 *
 * @author PC
 */

public class DSHocSinh {
    static ArrayList<HocSinh> arr=new ArrayList<>();
    static public void Menu()
    {
        int chon;
        do {            
            System.out.println("=============Menu=============");
            System.out.println("1.Nhap thong tin sinh vien");
            System.out.println("2.Xuat thong tin cac sinh vien");
            System.out.println("3.Sap xep danh sach sinh vien theo diem trung binh");
            System.out.println("0.thoat");
            do {                
                System.out.println("Moi ban chon:");
                chon=new Scanner(System.in).nextInt();
                if(chon<0||chon>3)
                    System.out.println("Chon sai roi! moi chon lai");
            } while (chon<0||chon>3);
            if(chon==1)
            {
               HocSinh a=new HocSinh();
               a.input();
               arr.add(a);
            }
            else if(chon ==2)
            {
                for(HocSinh b:arr)
                {
                    b.output();
                }
            }
            else if(chon==3)
            {
                Collections.sort(arr, new Comparator<HocSinh>()
                {
                    public int compare(HocSinh hs1,HocSinh hs2)
                    {
                        if(hs1.getDiemTB()<hs2.getDiemTB())
                            return 1;
                        else if(hs1.getDiemTB()==hs2.getDiemTB())
                            return 0;
                        else
                            return -1;
                    }
                    });
                 
            }
        } while ( chon!=0);
       
    }
}
