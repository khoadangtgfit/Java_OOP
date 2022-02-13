/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

/**
 *
 * @author Administrator
 */
public class QuanLyPerSon {
    private PerSon a[];
    static int slps;

    public QuanLyPerSon() {
        a=new PerSon[100];
    }
    
    public QuanLyPerSon(PerSon[] a) {
        this.a = a;
    }

    public PerSon[] getA() {
        return a;
    }

    public void setA(PerSon[] a) {
        this.a = a;
    }
    public void Nhap1SinhVien()
    {
        if(slps>=a.length)
        {
            System.out.println("Qua so luong!");
        }
        else
        {
            PerSon b=new SinhVien();
            b.Nhap();
            a[slps]=b;
            slps++;
        }
    }
    public void XuatDSSinhVien()
    {
        for(int i=0;i<slps;i++)
        {
            System.out.println(a[i].toString());
        }
    }
    public void TimKiemSV(String ten)
    {
        for(int i=0;i<slps;i++)
        {
            if(a[i].getHoTen().equals(ten))
            {
                System.out.println(a[i].toString());
            }
        }
    }
    public void XoaSV(String ten)
    {
        int vt=0;
        boolean flag=false;
        for(int i=0;i<slps;i++)
        {
            if(a[i].getHoTen().equals(ten))
            {
                vt=i;
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            for(int i=vt;i<slps;i++)
            {
                a[i]=a[i+1];
            }
            slps--;
            System.out.println("Da xoa 1 sv");
        }
        else{
            System.out.println("Khong tim thay sv co ten "+ten);
        }
    }
   
}
