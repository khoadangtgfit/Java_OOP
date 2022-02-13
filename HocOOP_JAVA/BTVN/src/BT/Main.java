/*
 * Họ Tên: Đặng Phước Khoa
 * Lớp : 19DTHE1
 * MSSV:1911066165
 */
package BT;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */

public class Main {
    public static boolean KTSo(String a)
    {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        int chon=0;
        String t;
        HocVien a=new HocVien();
        NVQuanLy b=new NVQuanLy();
        GiaoVien c=new GiaoVien();
        Scanner sc=new Scanner(System.in);
        do {            
            System.out.println("1.Nhap 1 hoc vien");
            System.out.println("2.Nhap 1 nhan vien quan ly");
            System.out.println("3.Nhap 1 giao vien");
            System.out.println("4.Xuat thong tin 1 hoc vien");
            System.out.println("5.Xuat thong tin 1 nhan vien quan ly");
            System.out.println("6.Xuat thong tin 1 giao vien");
            System.out.println("0.Thoat");
            do {
                System.out.println("Moi lua chon:");
               t=sc.nextLine();
               if(KTSo(t))
               {
                   chon=Integer.parseInt(t);
               }
               else{
                   System.err.println("Ban phai nhap so nguyen vao");
               }
               if(chon<0||chon>6)
               {
                   System.err.println("Nhap lua chon sai(0<=chon<=6)");
               }
            } while (!KTSo(t)||chon<0||chon>6);
            if(chon == 1)
            {
                a.Nhap();
            }
            else if(chon==2)
            {
                b.Nhap();
            }
            else if(chon==3)
            {
                c.Nhap();
            }
            else if(chon==4)
            {
                System.out.println(a.toString());
            }
            else if(chon ==5)
            {
                System.out.println(b.toString());
            }
            else if(chon == 6)
            {
                System.out.println(c.toString());
            }
        } while (chon!=0);
    }
}
