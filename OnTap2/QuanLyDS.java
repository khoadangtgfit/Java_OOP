/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
        boolean flag = false;
        if (x == 1) {
            for (Nguoi a : arr) {
                if (a instanceof HocVien) {
                    System.out.println(a.toString());
                    flag = true;
                }
            }
            if (!flag) {
                System.err.println("Khong co hoc vien nao trong danh sach");
            }
        } else if (x == 2) {
            for (Nguoi a : arr) {
                if (a instanceof NVQuanLy) {
                    System.out.println(a.toString());
                    flag = true;
                }
            }
            if (!flag) {
                System.err.println("Khong co nhan vien quan ly nao trong danh sach");
            }
        } else if (x == 3) {
            for (Nguoi a : arr) {
                if (a instanceof GiaoVien) {
                    System.out.println(a.toString());
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Khong co giao vien nao trong danh sach");
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

    public void TimKiem(int x) {
        if (x == 1) {
            if (arr == null || arr.size() == 0) {
                System.err.println("Danh sach rong!");
            } else {
                System.out.println("Nhap ten muon tim:");
                String ten = new Scanner(System.in).nextLine();
                boolean flag = false;
                for (Nguoi a : arr) {
                    if (a.getHoTen().equals(ten)) {
                        System.out.println(a.toString());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.err.println("Khong co nguoi nao co ten " + ten + " trong danh sach");
                }
            }
        } else if (x == 2) {
            if (arr == null || arr.size() == 0) {
                System.err.println("Danh sach rong!");
            } else {
                System.out.println("Nhap Luong muon tim:");
                double luong = new Scanner(System.in).nextDouble();
                boolean flag = false;
                for (Nguoi a : arr) {
                    if (a instanceof NVQuanLy) {
                        if (((NVQuanLy) (a)).getLuong() == luong) {
                            System.out.println(a.toString());
                            flag = true;
                        }
                    }
                }
                if (!flag) {
                    System.err.println("Khong co NV quan ly nao co luong " + luong + " trong danh sach");
                }
            }
        } else if (x == 3) {
            if (arr == null || arr.size() == 0) {
                System.err.println("Danh sach rong!");
            } else {
                boolean flag = false;
                for (int i = 0; i < arr.size() - 1; i++) {
                    if (arr.get(i) instanceof NVQuanLy) {
                        flag = true;
                        for (int j = i + 1; j < arr.size(); j++) {
                            if (arr.get(j) instanceof NVQuanLy) {
                                if (((NVQuanLy) (arr.get(i))).getLuong() < ((NVQuanLy) (arr.get(j))).getLuong()) {
                                    Collections.swap(arr, i, j);
                                }
                            }
                        }
                    }
                }

                if (!flag) {
                    System.err.println("Khong co nhan vien quan ly nao trong DS");
                    return;
                } else {
                    boolean flag1 = false;
                    Nguoi t = new Nguoi();
                    for (int i = 0; i < arr.size(); i++) {
                        if ((!flag1) && (arr.get(i) instanceof NVQuanLy)) {
                            t = arr.get(i);
                            flag1 = true;
                        }
                        if ((i > 0) && (arr.get(i) instanceof NVQuanLy)) {
                            if (((NVQuanLy) (arr.get(i))).getLuong() != ((NVQuanLy) (t)).getLuong()) {
                                System.out.println(arr.get(i).toString());
                                return;
                            }
                        }
                    }
                }
            }
        } else if (x == 4) {
            int max = 0;
            int vt=0;
            boolean flag=false;
            for (int i = 0; i < arr.size(); i++) {
                if(!flag&&arr.get(i) instanceof NVQuanLy){
                    vt=i;
                    flag=true;
                }
                if (arr.get(i) instanceof NVQuanLy) {
                    max = i;
                    for (int j = i + 1; j < arr.size(); j++) {
                        if(arr.get(j) instanceof NVQuanLy){
                            if(((NVQuanLy)(arr.get(j))).getLuong()>((NVQuanLy)(arr.get(max))).getLuong()){
                                max=j;
                            }
                        }
                    }
                    Collections.swap(arr, i, max);
                    if(i>0&&(((NVQuanLy)(arr.get(i))).getLuong()!=((NVQuanLy)(arr.get(vt))).getLuong())){
                        System.out.println(arr.get(i).toString());
                        return;
                    }
                }
            }
        }
      
    }

    public void init() {
        Nguoi a;
        a = new HocVien(1, 2, 3, "khoa", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 2, 3, "teo", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 2, 3, "nghiem", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 2, 3, "cho", "2/2/2");
        arr.add(a);
        a = new HocVien(1, 2, 3, "meo", "2/2/2");
        arr.add(a);
        a = new NVQuanLy(1, "ds", "ewew", "rere", 3, "3/5/6", "fd", "tep", "teo", "2/2/2");
        arr.add(a);
        a = new NVQuanLy(2, "ds", "ewew", "rere", 43, "3/5/6", "fd", "tep", "tu", "2/2/2");
        arr.add(a);
        a = new NVQuanLy(1, "dsr", "ewew", "rere", 9, "3/5/6", "fd", "tep", "teo", "2/2/2");
        arr.add(a);
        a = new NVQuanLy(1, "ds", "ewew", "rere", 3, "3/5/6", "fd", "tep", "teo", "2/2/2");
        arr.add(a);
        a = new NVQuanLy(1, "ds", "ewew", "rere", 3, "3/5/6", "fd", "tep", "teo", "2/2/2");
        arr.add(a);
        a = new GiaoVien(1, "re", "dskod", "lao", 0, "2/2/2", "ds", "dsko", "jeo", "2/2/22");
        arr.add(a);
        a = new GiaoVien(1, "re", "dskod", "lao", 0, "2/2/2", "ds", "dsko", "jeo", "2/2/22");
        arr.add(a);
        a = new GiaoVien(1, "re", "dskod", "lao", 0, "2/2/2", "ds", "dsko", "jeo", "2/2/22");
        arr.add(a);
        a = new GiaoVien(1, "re", "dskod", "lao", 0, "2/2/2", "ds", "dsko", "jeo", "2/2/22");
        arr.add(a);
        a = new GiaoVien(1, "re", "dskod", "lao", 0, "2/2/2", "ds", "dsko", "jeo", "2/2/22");
        arr.add(a);
    }
}
