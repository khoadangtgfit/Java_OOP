/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class HocVien {

    ArrayList<NhanVien> arr = new ArrayList<>();

    public void Nhap1NhanVien(int x) {
        if (x == 1) {
            NhanVien a = new NVQL();
            a.Nhap();
            arr.add(a);
        } else if (x == 2) {
            NhanVien a = new NVNC();
            a.Nhap();
            arr.add(a);
        } else if (x == 3) {
            NhanVien a = new NVPV();
            a.Nhap();
            arr.add(a);
        }
    }

    public void XuatDSNV(int x) {
        if (x == 1) {
            for (NhanVien a : arr) {
                if (a instanceof NVQL) {
                    System.out.println(a.toString());
                }
            }
        } else if (x == 2) {
            for (NhanVien a : arr) {
                if (a instanceof NVNC) {
                    System.out.println(a.toString());
                }
            }
        } else if (x == 3) {
            for (NhanVien a : arr) {
                if (a instanceof NVPV) {
                    System.out.println(a.toString());
                }
            }
        } else if (x == 4) {
            for (NhanVien a : arr) {
                System.out.println(a.toString());
            }
        }
    }

    public int SapXepTheoLuongC1() {
        arr.sort((NhanVien p1, NhanVien p2) -> {
            if (p1.TinhLuong() > p2.TinhLuong()) {
                return 1;
            } else {
                return -1;
            }
        }
        );
        return 0;
    }

    public int SapXepTheoLuongC2() {
        Collections.sort(arr, new Comparator<NhanVien>() {
            public int compare(NhanVien p1, NhanVien p2) {
                if (p1.TinhLuong() > p2.TinhLuong()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        return 0;
    }
    public void init(){
        NhanVien a=new NVNC("taolao", 22, "kokos", "djsid", "dsds",1.0);
        NhanVien b=new NVNC("taolao", 24, "kokos", "djsid", "dsds",12.0);
        NhanVien c=new NVNC("taolao", 12, "kokos", "djsid", "dsds",4.0);
        NhanVien d=new NVNC("taolao", 1, "kokos", "djsid", "dsds",2.0);
        NhanVien e=new NVNC("taolao", 3, "kokos", "djsid", "dsds",3.0);
        NhanVien f=new NVPV("ds", "rjei", "ds", 23.0);
        NhanVien g=new NVPV("ds", "rjei", "ds", 13.0);
        NhanVien h=new NVPV("ds", "rjei", "ds", 2.0);
        NhanVien i=new NVPV("ds", "rjei", "ds", 3.0);
        NhanVien n=new NVQL("te", 23.0, "ds", "kf", "dsko", 4.0);
        NhanVien x=new NVQL("te",13.0, "ds", "kf", "dsko", 2.0);
        NhanVien y=new NVQL("te", 3.0, "ds", "kf", "dsko", 3.0);
        NhanVien z=new NVQL("te", 4.0, "ds", "kf", "dsko", 1.0);
        arr.add(a); arr.add(b); arr.add(c); arr.add(d); arr.add(e); arr.add(f);
        arr.add(g); arr.add(h); arr.add(i); arr.add(n); arr.add(x); arr.add(y); 
        arr.add(z);
    }
}
