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
public class HocVien extends Nguoi{
    private double Diem1,Diem2,Diem3;

    public HocVien() {
    }

    public HocVien(double Diem1, double Diem2, double Diem3) {
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }

    public HocVien(double Diem1, double Diem2, double Diem3, String ten, Class_Date NgaySinh) {
        super(ten, NgaySinh);
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }

    public double getDiem1() {
        return Diem1;
    }

    public boolean setDiem1(double Diem1) {
        if(Diem1<0||Diem1>10)
            return false;
        else{
        this.Diem1 = Diem1;
            return true;
        }
        
    }

    public double getDiem2() {
        return Diem2;
    }

    public boolean setDiem2(double Diem2) {
        if(Diem2<0||Diem2>10)
            return false;
        else{
        this.Diem2 = Diem2;
            return true;
        }
        
    }

    public double getDiem3() {
        return Diem3;
    }

    public boolean setDiem3(double Diem3) {
       if(Diem3<0||Diem3>10)
            return false;
        else{
        this.Diem3 = Diem3;
            return true;
        }
    }
    public boolean KTDiem(String a)
    {
        try {
            Double.parseDouble(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        String t;
        do {  
            System.out.println("Nhap diem 1:");
           t=sc.nextLine(); boolean flag=false;
           if(KTDiem(t))
               Diem1=Double.parseDouble(t);
           else{
               System.err.println("Diem phai la so!");
               flag=true;
           }
           if(!setDiem1(Diem1)&&!flag)
           {
               System.err.println("Nhap sai diem(0<=diem<=10)");
           }
           if(!KTDiem(t)||!setDiem1(Diem1))
           {
               System.out.println("Moi nhap lai diem!");
           }
        } while (!KTDiem(t)||!setDiem1(Diem1));
        do {      
            
            System.out.println("Nhap diem 2:");
           t=sc.nextLine(); boolean flag=false;
           if(KTDiem(t))
               Diem2=Double.parseDouble(t);
           else{
               System.err.println("Diem phai la so!");
               flag=true;
           }
           if(!setDiem1(Diem2)&&!flag)
           {
               System.err.println("Nhap sai diem(0<=diem<=10)");
           }
           
           if(!KTDiem(t)||!setDiem1(Diem2))
           {
               System.out.println("Moi nhap lai diem!");
           }
        } while (!KTDiem(t)||!setDiem1(Diem2));
        do {      
            System.out.println("Nhap diem 3:"); 
           t=sc.nextLine();
           boolean flag=false;
           if(KTDiem(t))
               Diem3=Double.parseDouble(t);
           else{
               System.err.println("Diem phai la so!");
               flag=true;
           }
           if(!setDiem1(Diem3)&&!flag)
           {
               System.err.println("Nhap sai diem(0<=diem<=10)");
           }
           if(!KTDiem(t)||!setDiem1(Diem3))
           {
               System.out.println("Moi nhap lai diem!");
           }
        } while (!KTDiem(t)||!setDiem1(Diem3));
    }

    @Override
    public String toString() {
        return "HocVien{" +super.toString()+ "Diem1=" + Diem1 + ", Diem2=" + Diem2 + ", Diem3=" + Diem3 + '}';
    }
    
}
