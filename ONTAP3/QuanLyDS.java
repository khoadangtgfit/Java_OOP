/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ONTAP3;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class QuanLyDS {

    ArrayList<Nguoi> arr = new ArrayList<>();
    Nguoi a;

    public void Them(int x) {
        if (x == 1) {
            a = new HocVien();
            a.Nhap();
            arr.add(a);
        } else if (x == 2) {
            a = new NVQuanLy();
            a.Nhap();
            arr.add(a);
        } else if (x == 3) {
            a = new GiaoVien();
            a.Nhap();
            arr.add(a);
        }
    }

    public void Xuat(int x) {
        if (x == 1) {
            boolean flag= false;
            if (arr == null || arr.size() == 0) {
                System.err.println("Danh sach rong!");
            } else {
                for (Nguoi a : arr) {
                    if (a instanceof HocVien) {
                        System.out.println(a.toString());
                        flag = true;
                    }
                }
                if (!flag) {
                        System.err.println("Khong co hoc vien nao trong danh sach! ");
                    }
            }
        } else if (x == 2) {
            boolean flag = false;
            if (arr == null || arr.size() == 0) {
                System.err.println("Danh sach rong!");
            } else {
                for (Nguoi a : arr) {
                    if (a instanceof NVQuanLy) {
                        System.out.println(a.toString());
                        flag = true;
                    }
                }
                if (!flag) {
                        System.err.println("Khong co hoc vien nao trong danh sach! ");
                    }
            }
        } else if (x == 3) {
            boolean flag = false;
            if (arr == null || arr.size() == 0) {
                System.err.println("Danh sach rong!");
            } else {
                for (Nguoi a : arr) {
                    if (a instanceof GiaoVien) {
                        System.out.println(a.toString());
                        flag = true;
                    }
                }
                if (!flag) {
                        System.err.println("Khong co hoc vien nao trong danh sach! ");
                    }
            }
        } else if (x == 4) {
            if (arr == null || arr.size() == 0) {
                System.err.println("Danh sach rong!");
            } else {
                for (Nguoi a : arr) {
                    System.out.println(a.toString());
                }
            }
        }

    }

    public void init() {
        Nguoi a;
        a = new HocVien(1, 2, 3, "koasd", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 2, 3, "koadsd", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 2, 3, "kosdasd", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 2, 3, "sd", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 2, 3, "sdss", "2/2/2");
        arr.add(a);
        a = new GiaoVien(2, "dsd", "dsd", "dsj", 0, "2/3/4", "ds", "dsoj", "dsw", "2/2/2");
        arr.add(a);
        a = new GiaoVien(2, "dsd", "dsd", "dsj", 0, "2/3/4", "ds", "dsoj", "dsw", "2/2/2");
        arr.add(a);
        a = new GiaoVien(2, "dsd", "dsd", "dsj", 0, "2/3/4", "ds", "dsoj", "dsw", "2/2/2");
        arr.add(a);
        a = new GiaoVien(2, "dsd", "dsd", "dsj", 0, "2/3/4", "ds", "dsoj", "dsw", "2/2/2");
        arr.add(a);
        a = new GiaoVien(2, "dsd", "dsd", "dsj", 0, "2/3/4", "ds", "dsoj", "dsw", "2/2/2");
        arr.add(a);
        a = new NVQuanLy("dsds", "ere", "dskoad", 2, "2/3/2", "dsjids", "teo", "nhan", "2/2/2");
        arr.add(a);
        a = new NVQuanLy("dsds", "ere", "dskoad", 4, "2/3/2", "dsjids", "teo", "nhan", "2/2/2");
        arr.add(a);
        a = new NVQuanLy("dsds", "ere", "dskoad", 1, "2/3/2", "dsjids", "teo", "nhan", "2/2/2");
        arr.add(a);
        a = new NVQuanLy("dsds", "ere", "dskoad", 8, "2/3/2", "dsjids", "teo", "nhan", "2/2/2");
        arr.add(a);
    }
}
