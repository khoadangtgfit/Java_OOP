/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NgayThangNam {
    Date ngay;
    SimpleDateFormat a=new SimpleDateFormat("dd/MM/yyyy");
    public NgayThangNam(Date ngay) {
        this.ngay = ngay;
    }

    public NgayThangNam() {
    }
    public NgayThangNam(String day){
        try {
            ngay=a.parse(day);
        } catch (Exception e) {
        }
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        
        boolean flag=false;
        do {            
            try {
                System.out.println("Moi nhap ngay(dd/MM/yyyy)");
                ngay=a.parse(sc.nextLine());
                flag=true;
            } catch (Exception e) {
                System.out.println("Nhap sai ngay!Moi nhap lai!");
            }
        } while (!flag);
    }
    public String Xuat(){
        return a.format(ngay);
    }
    
}
