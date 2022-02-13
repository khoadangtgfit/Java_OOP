/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class QuanLyDS {

    ArrayList<Nguoi> arr = new ArrayList<>();

    public void Them(int x) {
        if (x == 1) {
            Nguoi a = new HocVien();
            a.Nhap();
            arr.add(a);
        } else if (x == 2) {
            Nguoi a = new NVQuanLy();
            a.Nhap();
            arr.add(a);
        } else if (x == 3) {
            Nguoi a = new GiaoVien();
            a.Nhap();
            arr.add(a);
        }
    }

    public void Xuat(int x) {
        if (x == 1) {
            for (Nguoi a : arr) {
                if (a instanceof HocVien) {
                    System.out.println(a.toString());
                }
            }
        } else if (x == 2) {
            for (Nguoi a : arr) {
                if (a instanceof NVQuanLy) {
                    System.out.println(a.toString());
                }
            }
        } else if (x == 3) {
            for (Nguoi a : arr) {
                if (a instanceof GiaoVien) {
                    System.out.println(a.toString());
                }
            }
        } else if (x == 4) {
            for (Nguoi a : arr) {

                System.out.println(a.toString());
            }
        }
    }
    public int SapXep(){
        arr.sort((Nguoi p1,Nguoi p2)->{
            if(p1.getHoTen().compareTo(p2.getHoTen())>0)
                return 1;
            else return -1;
        });
        return 0;
    }
    public void Init(){
       Class_Date x=new Class_Date(1, 1, 2);
        
        Nguoi a=new HocVien(1, 2, 3, x, "b");
        Nguoi b=new HocVien(1, 2, 3, x, "c");
        Nguoi c=new HocVien(1, 2, 3, x, "x");
        Nguoi d=new HocVien(1, 2, 3, x, "a");
        Nguoi e=new HocVien(1, 2, 3, x, "a");
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(e);
        
              
       
    }
}
