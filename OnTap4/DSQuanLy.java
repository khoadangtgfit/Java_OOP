/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class DSQuanLy {

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
            boolean flag = false;
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
                    System.err.println("Khong co hoc vien nao trong danh sach!");
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
                    System.err.println("Khong co nhan vien quan ly nao trong danh sach!");
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
                    System.err.println("Khong co giao vien nao trong danh sach!");
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

    public int SapXepTheoTen() {
        if (arr == null || arr.size() == 0) {
            System.err.println("Danh sach rong!");
        } else {
            arr.sort((Nguoi p1, Nguoi p2) -> {
                if (p1.getTen().compareTo(p2.getTen()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            });
        }
        System.out.println("Da Sap Xep Xong!");
        return 0;
    }

    public void TimNVQuanLyLuongThu2(int k) {
        int max = 0;
        int vt = 0;
        int dem = 1;
        int teo1=0;
        int teo2=0;
        boolean flag = false;
        boolean flag1 = false;

        for (int i = 0; i < arr.size() - 1; i++) {
            if ((!flag) && (arr.get(i) instanceof NVQuanLy)) {
                vt = i;
                flag = true;
            }
            if (arr.get(i) instanceof NVQuanLy) {
                boolean flag2 = false;
                max = i;
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(j) instanceof NVQuanLy) {
                        if (((NVQuanLy) (arr.get(j))).getLuong() > (((NVQuanLy) (arr.get(max))).getLuong())) {
                            max = j;
                        }
                    }
                }
                Collections.swap(arr, i, max);
                if (k == 1) {
                    System.out.println(arr.get(i).toString());
                    return;
                }
                teo1=dem;
                if ((i > 0) && (((NVQuanLy) (arr.get(i))).getLuong() != ((NVQuanLy) (arr.get(vt))).getLuong())) {
                    if (k == ++dem) {
                        System.out.println(arr.get(i).toString());
                    }
                    vt = i;
                    flag1 = true;
                    teo2=dem;

                }
                if(teo1==teo2){
                    if(i!=vt){
                        System.out.println(arr.get(i).toString());
                    }
                }
            }
        }
        if(k>dem){
            System.out.println("Ko co!");
        }
        if (!flag1) {
            System.err.println("Luong cua cac nhan vien deu bang nhau !");
        }
    }

    public void XoaHocVienTheoTen(String ten) {
        boolean flag = false;
        for (Nguoi a : arr) {
            arr.remove(a);
        }
        
    }

    public void init() {
        Nguoi a;
        a = new HocVien(1, 0, 0, "teo", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 0, 0, "teo", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 0, 0, "teo", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 0, 0, "w", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 0, 0, "s2", "2/2/2");
        arr.add(a);
        a = new NVQuanLy(0, "ds", "dsdsd", "wrs", 35, "2/2/2", "do", "dsdsi", "t", "2/2/2");
        arr.add(a);
        a = new NVQuanLy(0, "ds", "dsdsd", "wrs", 4, "2/2/2", "do", "dsdsi", "a", "2/2/2");
        arr.add(a);
        a = new NVQuanLy(0, "ds", "dsdsd", "wrs", 9, "2/2/2", "do", "dsdsi", "d", "2/2/2");
        arr.add(a);
        a = new NVQuanLy(0, "ds", "dsdsd", "wrs", 9, "2/2/2", "do", "dsdsi", "w", "2/2/2");
        arr.add(a);
        a = new NVQuanLy(0, "ds", "dsdsd", "wrs", 9, "2/2/2", "do", "dsdsi", "b", "2/2/2");
        arr.add(a);
        a = new GiaoVien(0, "ds", "sdsd", "dsd", 0, "2/3/4", "dssf", "dsdji", "a", "2/2/2");
        arr.add(a);
        a = new GiaoVien(0, "ds", "sdsd", "dsd", 0, "2/3/4", "dssf", "dsdji", "v", "2/2/2");
        arr.add(a);
        a = new GiaoVien(0, "ds", "sdsd", "dsd", 0, "2/3/4", "dssf", "dsdji", "tds", "2/2/2");
        arr.add(a);
        a = new GiaoVien(0, "ds", "sdsd", "dsd", 0, "2/3/4", "dssf", "ds", "a", "2/2/2");
        arr.add(a);
        a = new GiaoVien(0, "ds", "sdsd", "dsd", 0, "2/3/4", "dssf", "dsdji", "c", "2/2/2");
        arr.add(a);
    }
}
