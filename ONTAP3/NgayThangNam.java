/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ONTAP3;

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
    public NgayThangNam() {
    }

    public NgayThangNam(Date ngay) {
        this.ngay = ngay;
    }
    public NgayThangNam(String day) {
        try {
            ngay=a.parse(day);
        } catch (Exception e) {
        }
    }
    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        do {            
            try {
                ngay=a.parse(sc.nextLine());
                flag=true;
            } catch (Exception e) {
                System.err.println("Nhap sai ngay!Moi Nhap lai!");
            }
        } while (!flag);
    }
    public String toString(){
        return a.format(ngay);
    }
    
}
