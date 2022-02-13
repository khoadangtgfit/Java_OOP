/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhapXuatKieuDate {
    Date ngay;
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat a=new SimpleDateFormat("dd/MM/yyyy");
        boolean flag=true;
        do{
        try {
            System.out.println("Nhap ngay(dd/MM/yyyy):");
            ngay=a.parse(sc.nextLine());
        } catch (ParseException e) {
            flag=false;
            System.err.println("Nhap sai!");
        }
        }while(!flag);
                
    }
    public void Xuat(){
        SimpleDateFormat a=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(a.format(ngay));
    }
}
