/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulycollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QuanLySinhVien {
    static HashMap<Integer,String> map=new HashMap<>();
    public static void Them()
    {
        SinhVien a=new SinhVien();
        a.NhapMa();
        if(map.containsKey(a.getMa())==false)
        {
            a.NhapTen();
            map.put(a.getMa(), a.getTen());
        }
        else
        {
            System.out.println("Ma "+a.getMa()+" da ton tai");
        }
    }
    public static void Xuat()
    {
        for(Map.Entry<Integer,String>item:map.entrySet())
        {
            System.out.println(item.getKey()+"-"+item.getValue());
        }
        System.out.println("Do dai cua map ="+map.size());
    }
    public static void main(String a[])
    {
        int chon;
        do {            
            System.out.println("1.Nhap");
            System.out.println("2.Xuat");
            System.out.println("0.Thoat");
            do {                
                System.out.println("Moi chon:");
                chon=new Scanner(System.in).nextInt();
                if(chon<0||chon>2)
                {
                    System.out.println("Nhap sai moi nhap lai!");
                }
            } while (chon<0||chon>2);
            if(chon==1)
            {
                Them();
            }
            else if(chon==2)
            {
                Xuat();
            }
            
        } while (chon!=0);
    }
            
}
