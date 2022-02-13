/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author PC
 */
public class DSHangHoa_ArrayList {

    ArrayList<HangHoa> arr = new ArrayList<>();

    public void Them1HangDM() {
        HangDM a = new HangDM();
        a.Nhap();
        arr.add(a);
    }

    public void Them1HangTP() {
        HangTP a = new HangTP();
        a.Nhap();
        arr.add(a);
    }

    public void XuatDSHangDM() {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof HangDM) {
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public void XuatDSHangTP() {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof HangTP) {
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public void Xoa1HangDM(String ma) {
        boolean flag = false;
        int dem = 0;
        for (int i = 0; i < arr.size(); i++) {
            if ((arr.get(i).getMaHang().equals(ma)) && (arr.get(i) instanceof HangDM)) {
                arr.remove(i);
                flag = true;
                dem++;
            }
        }
        if (flag == true) {
            System.out.println("Da xoa " + dem + " hang DM co ma " + ma);
        }
        if (flag == false) {
            System.err.println("Khong co hang DM nao trong danh sach co ma la " + ma);
        }
    }

    public void Xoa1HangTP(String ma) {
        boolean flag = false;
        int dem = 0;
        for (int i = 0; i < arr.size(); i++) {
            if ((arr.get(i).getMaHang().equals(ma)) && (arr.get(i) instanceof HangTP)) {
                arr.remove(i);
                flag = true;
                dem++;
            }
        }
        if (flag == true) {
            System.out.println("Da xoa " + dem + " hang TP co ma " + ma);
        }
        if (flag == false) {
            System.err.println("Khong co hang TP nao trong danh sach co ma la " + ma);
        }
    }

    public void TimKiemHangHoa(String ma) {
        boolean flag = false;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getMaHang().equals(ma)) {
                System.out.println(arr.get(i).toString());
                flag = true;
            }
        }
        if (flag == false) {
            System.err.println("Khong co hang hoa nao trong danh sach co ma la " + ma);
        }
    }

    public int SapXep() {
        Collections.sort(arr, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                return o1.getMaHang().compareTo(o2.getMaHang());
            }
        });
        return 1;
    }

    public void XuatDS() {
        for (HangHoa a : arr) {
            System.out.println(a.toString());
        }
    }

    public void inti() {
        Class_Date a = new Class_Date(1, 2, 2000);
        Class_Date b = new Class_Date(2, 4, 2001);
        Class_Date t = new Class_Date(3, 6, 2000);
        Class_Date f = new Class_Date(4, 5, 2001);
        HangHoa c = new HangDM(0, 0, 0, "1", "tenHang", 0);
        HangHoa d = new HangTP(a, b, "3", "4", 0);
        HangHoa e = new HangTP(t, f, "8", "6", 10);
        arr.add(c);
        arr.add(d);
        arr.add(e);
    }
}
