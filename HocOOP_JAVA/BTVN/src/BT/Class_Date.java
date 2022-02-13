/*
 * Họ Tên: Đặng Phước Khoa
 * Lớp : 19DTHE1
 * MSSV:1911066165
 */
package BT;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Class_Date {
     private int ngay,thang,nam;

    Class_Date() {
    }
    public boolean ngayHopLe(){
        int []ngayMax={0,31,28,30,31,30,31,30,31,30,31,30,31};
        if(nam<1||thang<1||ngay<1||ngay>ngayMax[thang])
            return false;
        else return true;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("-Nhap ngay:");
        ngay=sc.nextInt();
        System.out.println("-Nhap thang:");
        thang=sc.nextInt();
        System.out.println("-Nhap nam:");
        nam=sc.nextInt();
        if(!ngayHopLe())
                System.err.println("Nhap ngay khong hop le! moi nhap lai!");
        }while(!ngayHopLe());
    }
    public String toString()
    {
        return ngay+"/"+thang+"/"+nam;
    }

    public Class_Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
}
