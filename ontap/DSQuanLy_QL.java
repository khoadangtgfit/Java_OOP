/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class DSQuanLy_QL {

    ArrayList<Nguoi> arr = new ArrayList<>();

    public void Them(int x) {
        Nguoi a;
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
        if (arr.size() == 0 || arr == null) {
            System.out.println("Danh sach rong!");
        } else {
            boolean flag = false;
            if (x == 1) {
                for (Nguoi a : arr) {
                    if (a instanceof HocVien) {
                        System.out.println(a.toString());
                        flag = true;
                    }
                }
                if (flag == false) {
                    System.out.println("Khong co hoc vien nao trong danh sach!");
                }
            } else if (x == 2) {
                for (Nguoi a : arr) {
                    if (a instanceof NVQuanLy) {
                        System.out.println(a.toString());
                        flag = true;
                    }
                }
                if (flag == false) {
                    System.out.println("Khong co nv quan ly nao trong danh sach!");
                }
            } else if (x == 3) {
                for (Nguoi a : arr) {
                    if (a instanceof GiaoVien) {
                        System.out.println(a.toString());
                        flag = true;
                    }
                }
                if (flag == false) {
                    System.out.println("Khong co giao vien nao trong danh sach!");
                }
            } else if (x == 4) {
                for (Nguoi a : arr) {
                    System.out.println(a.toString());
                }
            }
        }
    }

    public void init() {
        Nguoi a;
        NgayThangNam x = new NgayThangNam("2/2/2");
        a = new HocVien(1, 2, 3, "a", x);
        arr.add(a);
        a = new HocVien(1, 2, 3, "x", x);
        arr.add(a);
        a = new NhanVien(2, x, "ds", "wewew", "khoa", x);
        arr.add(a);
        a = new HocVien(1, 2, 3, "y", x);
        arr.add(a);
        a = new NhanVien(35, x, "ds", "wewew", "khoa", x);
        arr.add(a);
        a = new HocVien(1, 2, 3, "t", x);
        arr.add(a);
        a = new NVQuanLy(1, "ds", "dsw", "rwr", 88, x, "rw", "wr", "e", x);
        arr.add(a);
        a = new GiaoVien("tas", "dsds", "ds", 4, x, "343", "553", "b", x);
        arr.add(a);
        a = new GiaoVien("tas", "dsds", "ds", 2, x, "343", "553", "d", x);
        arr.add(a);
        a = new NhanVien(8, x, "ds", "wewew", "teo", x);
        arr.add(a);

        a = new GiaoVien("tas", "dsds", "ds", 2, x, "343", "553", "x", x);
        arr.add(a);
        a = new GiaoVien("tas", "dsds", "ds", 2, x, "343", "553", "e", x);
        arr.add(a);
        a = new NhanVien(35, x, "ds", "wewew", "khoa", x);
        arr.add(a);
        a = new NVQuanLy(1, "ds", "dsw", "rwr", 3, x, "rw", "wr", "kg", x);
        arr.add(a);
        a = new NVQuanLy(1, "ds", "dsw", "rwr", 3, x, "rw", "wr", "kg", x);
        arr.add(a);
        a = new NVQuanLy(1, "ds", "dsw", "rwr", 3, x, "rw", "wr", "kg", x);
        arr.add(a);

        a = new NhanVien(4, x, "ds", "wewew", "khoa", x);
        arr.add(a);

    }

    public int SapXep(int x) {
        if (x == 1) {
            arr.sort((Nguoi p1, Nguoi p2) -> {
                if (p1.getTen().compareTo(p2.getTen()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            });
        } else if (x == 2) {
            Collections.sort(arr, new Comparator<Nguoi>() {
                public int compare(Nguoi p1, Nguoi p2) {
                    if (p1.getTen().compareTo(p2.getTen()) > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            });
        }
        return 0;
    }

    public void TimNhanVien(double x) {
        NhanVien t;
        for (Nguoi a : arr) {
            if ((a instanceof NhanVien) && !(a instanceof NVQuanLy) && !(a instanceof GiaoVien)) {
                t = (NhanVien) (a);
                System.out.println(t.getLuong());
                break;
            }

        }
    }

    public void SapXepNhanVien() {
        NhanVien a, b;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if ((arr.get(i) instanceof NhanVien) && !(arr.get(i) instanceof NVQuanLy) && !(arr.get(i) instanceof GiaoVien)) {
                    if ((arr.get(j) instanceof NhanVien) && !(arr.get(j) instanceof NVQuanLy) && !(arr.get(j) instanceof GiaoVien)) {
                        a = (NhanVien) (arr.get(i));
                        b = (NhanVien) (arr.get(j));
                        if (a.getLuong() > b.getLuong()) {
                            Collections.swap(arr, i, j);
                        }
                    }

                }
            }
        }
    }

    public void XuatNhanVienThu2() { //sap xep nhan vien co luong giam dan trong danh sach
        NhanVien a;
        NhanVien b;
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            max = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if ((arr.get(i) instanceof NhanVien) && !(arr.get(i) instanceof NVQuanLy) && !(arr.get(i) instanceof GiaoVien)) {
                    if ((arr.get(j) instanceof NhanVien) && !(arr.get(j) instanceof NVQuanLy) && !(arr.get(j) instanceof GiaoVien)) {
                        a = (NhanVien) (arr.get(j));        //chuyen doi kieu
                        b = (NhanVien) (arr.get(max));
                        if (a.getLuong() > b.getLuong()) {   //so sanh luong nhan vien 
                            max = j;            //neu > max thi gan max=j
                        }
                    }

                }

            }
            if (i != max) {
                Collections.swap(arr, i, max);
            }
        }
    }
    public void Xuat2(){// ham xuat nhan vien co luong lon thu 2 (sau khi da sap xep giam dan)
        NhanVien x=new NhanVien();
        NhanVien y;
        boolean flag=false;
        for(int i=0;i<arr.size();i++){
              if(!flag&&(arr.get(i) instanceof NhanVien) && !(arr.get(i) instanceof NVQuanLy) && !(arr.get(i) instanceof GiaoVien)){
                  x=(NhanVien)(arr.get(i));           // gan x cho nhanvien dau tien tim thay trong danh sach
                  flag=true;                    //neu tim thay roi thi bat flag=true(muc dich la chi tim nhan vien dau tien trong danh sach)
              }
              if((arr.get(i) instanceof NhanVien) && !(arr.get(i) instanceof NVQuanLy) && !(arr.get(i) instanceof GiaoVien)){
                  y=(NhanVien)(arr.get(i));  //ep kieu
                  if(x.getLuong()!=y.getLuong()){   //tim nhan vien co luong khac luong cua nhan vien lon nhat
                      System.out.println(y.toString()); //sau khi tim duoc thi ta in ra
                      return;
                  }
              }
        }
    }
}
