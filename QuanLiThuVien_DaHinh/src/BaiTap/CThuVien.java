/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author Administrator
 */
public class CThuVien {
    private ArrayList<CDocGia> arr=new ArrayList<>();
    public void init()
    {
        CDocGiaTreEm a=new CDocGiaTreEm("khoa", "khoa ngu", "12/3/2000", 2);
        CDocGiaTreEm b=new CDocGiaTreEm("taolao", "k", "12/3/2000", 21);
        CDocGiaTreEm c=new CDocGiaTreEm("khoa", "khoa1", "12/3/2000", 2);
        CDocGiaNguoiLon e=new CDocGiaNguoiLon("cmnd", "hoten", "123", 0);
        CDocGiaNguoiLon d=new CDocGiaNguoiLon("cmnd", "khoa1", "123", 0);
        CDocGiaNguoiLon f=new CDocGiaNguoiLon("cmnd", "khoa", "123", 0);
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(e);
        arr.add(f);
        
        
    }
    public void Menu()
    {
        int chon;
        Scanner sc=new Scanner(System.in);
        do {            
            System.out.println("1.Nhap thong tin doc gia tre em");
            System.out.println("2.Nhap thong tin doc gia nguoi lon");
            System.out.println("3.Xuat thong tin cac doc gia");
            System.out.println("4.Sap Xep doc gia tre em o dau danh sach");
            System.out.println("5.Tim doc gia tre em theo ten nguoi dai dien");
            System.out.println("0.Thoat");
            
            do {                
                System.out.println("Moi lua chon:");
                chon=sc.nextInt();
                if(chon<0||chon>5)
                    System.out.println("Chon sai! moi chon lai !");
            } while (chon<0||chon>5);
            if(chon == 1)
            {
                CDocGia a=new CDocGiaTreEm();
                a.Nhap();
                arr.add(a);
                a.setKT(true);
            }
            else if(chon == 2)
            {
                CDocGia a=new CDocGiaNguoiLon();
                a.Nhap();
                arr.add(a);
                a.setKT(false);
            }
            else if(chon == 3)
            {
                for(int i=0;i<arr.size();i++)
                {
                    System.out.println("Thong tin doc gia thu "+(i+1));
                    if(arr.get(i).getKT()==true){
                        System.out.println("Doc gia tre em:");
                        arr.get(i).Xuat();
                    }
                    else
                    {
                        System.out.println("Doc gia nguoi lon:");
                        arr.get(i).Xuat();
                    }
                }
            }
            else if(chon == 4)
            {
                for(int i=0;i<arr.size()-1;i++)
                {
                    for(int j=i+1;j<arr.size();j++)
                    {
                        if((arr.get(i) instanceof CDocGiaNguoiLon)&&(arr.get(j) instanceof CDocGiaTreEm))
                        {
                            CDocGia a=new CDocGia();
                            arr.set(i, arr.get(j));
                            arr.set(j, a);
                        }
                    }
                }
            }
            else if(chon == 5)
            {
                boolean flag=false;
                System.out.println("Nhap ten nguoi can tim:");
                String ten;
                ten=sc.nextLine();
                for(int i=0;i<arr.size();i++)
                {
                    if(arr.get(i) instanceof CDocGiaTreEm)
                    {
                        CDocGiaTreEm a=(CDocGiaTreEm)arr.get(i);
                        if(a.getNguoiDaiDien().equals(ten))
                        {
                            arr.get(i).Xuat();
                            flag=true;
                        }
                    }
                }
                if(flag==false)
                    System.out.println("Khong tim thay nguoi nao co ten ");
            }
        } while (chon!=0);
    }
}
