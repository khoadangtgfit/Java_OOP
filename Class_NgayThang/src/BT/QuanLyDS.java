/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QuanLyDS {

    ArrayList<Nguoi> arr = new ArrayList<>();
    int n;
    Scanner sc = new Scanner(System.in);

    public void NhapSL() {
        do {
            System.out.println("Nhap so luong can them:");
            n = sc.nextInt();
        } while (n <= 0);

    }

    public void ThemDSHocVien() {
        NhapSL();
        for (int i = 0; i < n; i++) {
            Nguoi a = new HocVien();
            a.Nhap();
            arr.add(a);
        }
    }

    public void XuatDSHocVien() {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof HocVien) {
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public void ThemDSGiaoVien() {
        NhapSL();
        for (int i = 0; i < n; i++) {
            Nguoi a = new GiaoVien();
            a.Nhap();
            arr.add(a);
        }
    }

    public void XuatDSGiaoVien() {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof GiaoVien) {
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public void ThemDSNVQuanLy() {
        NhapSL();
        for (int i = 0; i < n; i++) {
            Nguoi a = new NVQuanLy();
            a.Nhap();
            arr.add(a);
        }
    }

    public void XuatDSNVQuanLy() {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof NVQuanLy) {
                System.out.println(arr.get(i).toString());
            }
        }
    }
}
