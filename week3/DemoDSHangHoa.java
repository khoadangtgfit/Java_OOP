/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DemoDSHangHoa {
    public static void main(String[] args) {
        DSHangHoa a=new DSHangHoa();
        int chon;
        do {            
            System.out.println("1.Nhap thong tin 1 hang dien may");
            System.out.println("2.Nhap thong tin 1 hang thuc pham");
            System.out.println("3.Xuat thong tin cac hang dien may");
            System.out.println("4.Xuat thong tin cac hang thuc pham");
            System.out.println("0.thoat");
            do {                
                System.out.println("Moi lua chon:");
                chon=new Scanner(System.in).nextInt();
                if(chon<0||chon>4)
                    System.err.println("Lua chon sai! moi chon lai!");
            } while (chon<0||chon>4);
            if(chon==1)
            {
                a.Nhap1HangDM();
            }
            else if(chon==2)
            {
                a.Nhap1HangTP();
            }
            else if(chon==3)
            {
                a.XuatDSHangDM();
            }
            else if(chon==4)
            {
                a.XuatDSHangTP();
            }
        } while (chon!=0);
    }
}
