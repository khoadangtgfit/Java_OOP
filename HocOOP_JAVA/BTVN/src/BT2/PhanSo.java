/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PhanSo {
    private int tu,mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tu so:");
        tu=sc.nextInt();
        do {            
            System.out.println("Nhap mau so:");
            mau=sc.nextInt();
            if(mau==0)
                System.err.println("Mau phai khac 0 moi nhap lai!");
        } while (mau==0);
    }
    public int UCLN()
    {
        int a=Math.abs(tu);
        int b=Math.abs(mau);
        if(a==0)
            return b;
        else if(b==0)
            return a;
        while(a!=b){
            if(a>b) a-=b;
            else if(a<b) b-=a;
        }
            return a;
    }
    public PhanSo RutGon(){
        int t=UCLN();
        this.tu/=t;
        this.mau/=t;
        return this;
    }
    public PhanSo ChuanHoa(){
        if((tu<0&&mau<0)||(mau<0&&tu>0)){
            tu*=-1;
            mau*=-1;
        }
      return this;
    }
    public PhanSo Tong(PhanSo ps1){
        PhanSo kq=new PhanSo();
        kq.tu=tu*ps1.mau+mau*ps1.tu;
        kq.mau=mau*ps1.mau;
        return kq;
    }
    public PhanSo Hieu(PhanSo ps1){
        PhanSo kq=new PhanSo();
        kq.tu=tu*ps1.mau-mau*ps1.tu;
        kq.mau=mau*ps1.mau;
        return kq;
    }
    public PhanSo Tich(PhanSo ps1){
        PhanSo kq=new PhanSo();
        kq.tu=tu*ps1.tu;
        kq.mau=mau*ps1.mau;
        return kq;
    }
    public PhanSo Thuong(PhanSo ps1){
        PhanSo kq=new PhanSo();
        kq.tu=tu*ps1.mau;
        kq.mau=mau*ps1.tu;
        return kq;
    }
    public String Xuat(){
        if(tu==mau){
            return "1";
        }
        else if(mau==1){
            return ""+tu;
        }
        else if(tu==0){
            return ""+0;
        }
        else{
            return tu+"/"+mau;
        }
    }
    
}
