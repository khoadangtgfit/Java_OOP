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
public class Class_Date {
     private int ngay,thang,nam;

    Class_Date() {
    }
    public boolean ngayHopLe(){
        int []ngayMax={0,31,28,30,31,30,31,30,31,30,31,30,31};
        if(ngay>ngayMax[thang]||ngay<1)
            return false;
        else return true;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("-Nhap ngay:");
        ngay=sc.nextInt();
        System.out.println("-Nhap thang:");
        thang=sc.nextInt();
        System.out.println("-Nhap nam:");
        nam=sc.nextInt();
        if(!ngayHopLe())
                System.err.println("Nhap ngay khong hop le! moi nhap lai!");
        }while(!ngayHopLe());
    }
    public String toString()
    {
        return ngay+"/"+thang+"/"+nam;
    }

    public Class_Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
}
