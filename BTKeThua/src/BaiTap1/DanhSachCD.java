/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DanhSachCD {
    private CD ds[];
    private int sl;

    public DanhSachCD() {
        ds=null;
        sl=0;
    }

    public DanhSachCD(CD[] ds, int sl) {
        this.ds = ds;
        this.sl = sl;
    }
    public void Ngang()
    {	System.out.printf("\n====================================================\n");
    }
    public void TieuDe()
    {
        Ngang();
        System.out.printf("|%-7s|%-20s|%-10s|%-10s|","Ma CD","Tua CD","So Bai Hat","Gia Thanh");
        Ngang();
    }
    public void NhapSL()
    {
        Scanner sc=new Scanner(System.in);
        do {            
            System.out.println("Nhap so luong:");
            sl=sc.nextInt();
            if(sl<=0)
                System.out.println("Nhap sai! sl phai >0! moi nhap lai");
        } while (sl<=0);
    }
    public void NhapDSCD()
    {
        NhapSL();
        ds=new CD[sl];
        for(int i=0;i<sl;i++)
        {
            System.out.println("Nhap thong tin CD thu "+(i+1));
            ds[i]=new CD();
            ds[i].input();
        }
    }
    public void XuatDSCD()
    {
        TieuDe();
        for(int i=0;i<sl;i++)
        {
            ds[i].output();
            Ngang();
        }
    }
    public void SapXep()
    {
        for(int i=0;i<sl-1;i++)
        {
            for(int j=i+1;j<sl;j++)
            {
                if(ds[i].getMaCD()<ds[j].getMaCD())
                {
                    CD t=new CD();
                    t=ds[i];
                    ds[i]=ds[j];
                    ds[j]=t;
                }
            }
        }
    }
}
