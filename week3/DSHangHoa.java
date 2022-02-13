/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Administrator
 */
public class DSHangHoa {
    private HangHoa[] a;
    static int slhh;

    public DSHangHoa() {
        slhh=0;
        a=new HangHoa[100];
    }

    public DSHangHoa(HangHoa[] a, int slhh) {
        this.a = a;
        DSHangHoa.slhh = slhh;
    }
    public void Nhap1HangDM()
    {
        if(slhh>=a.length)
            System.err.println("Qua so luong!");
        else{
            HangHoa b=new HangDM();
            b.Nhap();
            a[slhh]=b;
            slhh++;
        }
    }
    public void Nhap1HangTP()
    {
        if(slhh>=a.length)
            System.err.println("Qua so luong!");
        else{
            HangHoa b=new HangTP();
            b.Nhap();
            a[slhh]=b;
            slhh++;
        }
    }
    public void XuatDSHangDM()
    {
        for(int i=0;i<slhh;i++)
        {
            if(a[i] instanceof HangDM)
            {
                System.out.println(a[i].toString());
            }
        }      
    }
     public void XuatDSHangTP()
    {
        for(int i=0;i<slhh;i++)
        {
            if(a[i] instanceof HangTP)
            {
                System.out.println(a[i].toString());
            }
        }      
    }
}
