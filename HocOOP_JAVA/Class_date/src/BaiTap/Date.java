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
public class Date {
    private int ngay,thang,nam;
    public boolean ngayHopLe()
    {
        int []ngayMax={0,31,28,31,30,31,30,31,30,31,30,31};
        if(nam%4==0)
        {
            ngayMax[2]=29;
        }
        if(ngay>ngayMax[thang]&&(thang>ngayMax.length))
            return false;
        else return true;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        do {            
            System.out.println("Nhap ngay:");
            ngay=sc.nextInt();
            System.out.println("Nhap thang:");
            thang=sc.nextInt();
            System.out.println("Nhap nam:");
            nam=sc.nextInt();
            if(!ngayHopLe())
                System.out.println("Ngay khong hop le!Moi nhap lai!");
        } while (!ngayHopLe());
    }
    public void Xuat()
    {
        System.out.println(ngay+"/"+thang+"/"+nam);
    }
}
