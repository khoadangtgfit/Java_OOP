/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo()
    {
        tu=0;
        mau=1;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tu:");
        tu=sc.nextInt();
        System.out.println("Nhap mau:");
        mau=sc.nextInt();
    }
    public void output()
    {
        System.out.println(tu+"/"+mau);
    }
    public int UCLN()
    {
        int a=Math.abs(tu);
        int b=Math.abs(mau);
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public void RutGon()
    {
        int a =UCLN();
        tu/=a;
        mau/=a;
    }
    public PhanSo cong(PhanSo p)
    {
        PhanSo kq=new PhanSo();
        kq.tu=tu*p.mau+mau*p.tu;
        kq.mau=mau*p.mau;
        return kq;
    }
    public PhanSo tru(PhanSo p)
    {
        PhanSo kq=new PhanSo();
        kq.tu=tu*p.mau-mau*p.tu;
        kq.mau=mau*p.mau;
        return kq;
    }
    public PhanSo nhan(PhanSo p)
    {
        PhanSo kq=new PhanSo();
        kq.tu=tu*p.tu;
        kq.mau=mau*p.mau;
        return kq;
    }
    public PhanSo chia(PhanSo p)
    {
        PhanSo kq=new PhanSo();
        kq.tu=tu*p.mau;
        kq.mau=mau*p.tu;
        return kq;
    }
}
