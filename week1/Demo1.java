/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Demo1 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        HocSinh hs1=new HocSinh();
        hs1.input();
        hs1.output();
        String ten;
        System.out.println("Nhap ten thay doi:");
        ten=sc.nextLine();
        hs1.setHoTen(ten);
        HocSinh hs2=new HocSinh();
        hs2.input();
        hs2.output();
        if(hs1.getDiemTB()<hs2.getDiemTB())
            System.out.println("Hoc sinh 2 co diem trung binh lon hon");
        else if(hs1.getDiemTB()>hs2.getDiemTB())
            System.out.println("Hoc sinh 1 co diem trung binh lon hon");
    }
}
