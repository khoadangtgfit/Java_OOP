/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class NgayThangNam {
    Date ngay;
    public void Nhap(){
        SimpleDateFormat a=new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        while(!flag){
        try {
            ngay=a.parse(sc.nextLine());
            flag=true;
        } catch (Exception e) {
            System.err.println("Nhap Sai !Yeu Cau Nhap Lai!");
        }
        }
    }

    public NgayThangNam(Date ngay) {
        this.ngay = ngay;
    }
    public NgayThangNam(String ngay) {
        SimpleDateFormat a=new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngay = a.parse(ngay);
        } catch (ParseException ex) {
            Logger.getLogger(NgayThangNam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public NgayThangNam() {
    }
    

    @Override
    public String toString() {
        SimpleDateFormat a=new SimpleDateFormat("dd/MM/yyyy");
        return  a.format(ngay) ;
    }
    
}
