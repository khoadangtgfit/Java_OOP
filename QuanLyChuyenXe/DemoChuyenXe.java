//  Họ và tên: Đặng Phước Khoa
 // Lớp:19DTHE1
 //MSSV:1911066165
package Tuan4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DemoChuyenXe {
    public static void main(String []args)
    {
        QuanLyChuyenXe CX=new QuanLyChuyenXe();
        int chon;
        do {            
            System.out.println("1.Nhap thong tin 1 chuyen xe noi thanh");
            System.out.println("2.Nhap thong tin 1 chuyen xe ngoai thanh");
            System.out.println("3.Xuat thong tin cac chuyen xe noi thanh");
            System.out.println("4.Xuat thong tin cac chuyen xe ngoai thanh");
            System.out.println("5.Xoa 1 Chuyen xe");
            System.out.println("6.Sua 1 chuyen xe noi thanh");
            System.out.println("7.Sua mot chuyen xe ngoai thanh");
            System.out.println("8.Tim Kiem chuyen xe");
            System.out.println("0.Thoat");
            do {                
                System.out.println("Moi ban chon:");
                chon=new Scanner(System.in).nextInt();
                if(chon<0||chon>8)
                    System.err.println("Lua chon sai! moi ban chon lai!(0<=chon<=8)");
            } while (chon<0||chon>8);
            if(chon==1)
            {
                CX.Nhap1ChuyenXeNoiThanh();
            }
            else if(chon==2)
            {
                CX.Nhap1ChuyenXeNgoaiThanh();
            }
            else if(chon==3)
            {
                CX.XuatChuyenXeNT();
            }
            else if(chon==4)
            {
                CX.XuatChuyenXeNgT();
            }
            else if(chon==5)
            {
                String ma;
                Scanner sc=new Scanner(System.in);
                System.out.println("Moi nhap ma chuyen xe can xoa:");
                ma=sc.nextLine();
                CX.Xoa1ChuyenXe(ma);
            }
            else if(chon==6)
            {
                String ma;
                Scanner sc=new Scanner(System.in);
                System.out.println("Moi nhap ma chuyen xe noi thanh can sua thong tin:");
                ma=sc.nextLine();
                CX.SuaThongTin1ChuyenXeNoiThanh(ma);
            }
            if(chon == 7)
            {
                String ma;
                Scanner sc=new Scanner(System.in);
                System.out.println("Moi nhap ma chuyen xe ngoai thanh can sua thong tin:");
                ma=sc.nextLine();
                CX.SuaThongTin1ChuyenXeNgoaiThanh(ma);
            }
            if(chon == 8)
            {
                String maxe;
                Scanner sc=new Scanner(System.in);
                System.out.println("Moi nhap ma chuyen xe can tim:");
                maxe=sc.nextLine();
                CX.TimKiem(maxe);
            }
        } while (chon!=0);
    }
}
