/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author PC
 */
public class DemoPhanSo {
    public static void main(String [] args){
        PhanSo p1=new PhanSo();
        PhanSo p2=new PhanSo();
        p1.input();
        p2.input();
        p1.RutGon();
        p2.RutGon();
        p1.output();
        p2.output();
        PhanSo p3=p1.cong(p2);
        p3.RutGon();
        System.out.println("Tong Hai phan so=");
        p3.output();
        PhanSo p4=p1.tru(p2);
        p4.RutGon();
        System.out.println("Hieu Hai phan so=");
        p4.output();
        PhanSo p5=p1.nhan(p2);
        p5.RutGon();
        System.out.println("Tich Hai phan so=");
        p5.output();
        PhanSo p6=p1.chia(p2);
        p6.RutGon();
        System.out.println("Thuong Hai phan so=");
        p6.output();
        
        
    }
    
    
}
