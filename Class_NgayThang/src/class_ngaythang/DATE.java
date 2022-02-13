/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_ngaythang;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DATE {
    public int ngay,thang,nam;
     int Ngay_Max[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
     
    public DATE(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    public DATE() {
    }
    
    public boolean NgayHopLe()
    {
        if(nam%4==0)
             Ngay_Max[2]=29;
        if(ngay<=Ngay_Max[thang])
        {
            return true;
        }
        return false;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        do {
            
            System.out.println("Nhap ngay:");
            sc.nextInt();
            System.out.println("Nhap thang:");
            sc.nextInt();
            System.out.println("Nhap nam");
            sc.nextInt();
            if(!NgayHopLe())
                System.out.println("Ngay ko hop le! moi nhap lai");
        } while (!NgayHopLe()||ngay<=0||thang<=0||nam<=0);
    }

    @Override
    public String toString() {
        return "DATE{" + "ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + '}';
    }
    public int TinhSoThuTuNgayTrongNam()
    {
        int sum=0;
        if(nam%4==0)
             Ngay_Max[2]=29;
        for(int i=1;i<thang;i++)
               sum+=Ngay_Max[i];
        return sum+ngay;
    }
    public void Ngaytt(int stt,int nam)
    {
        if(nam%4==0)
             Ngay_Max[2]=29;
        for(int i=1;i<=12;i++)
        {
            if(stt<Ngay_Max[i])
            {
                setNgay(stt);
                setThang(i);
                setNam(nam);
                break;
            }
            stt-=Ngay_Max[i];
        }
        System.out.println(toString());
    }
    public void NgayKeTiep()
    {
        if(nam%4==0)
             Ngay_Max[2]=29;
        if(ngay==Ngay_Max[thang])
        {
            setNgay(1);
            setThang(thang+1);
          
        }
    }
}
