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
public class CD {
    private int MaCD,SoBaiHat;
    private String TuaCD;
    private float GiaThanh;

    public int getMaCD() {
        return MaCD;
    }

    public void setMaCD(int MaCD) {
        if(MaCD<=0)
            MaCD=999999;
        this.MaCD = MaCD;
    }

    public int getSoBaiHat() {
        return SoBaiHat;
    }

    public void setSoBaiHat(int SoBaiHat) {
        this.SoBaiHat = SoBaiHat;
    }

    public String getTuaCD() {
        return TuaCD;
    }

    public void setTuaCD(String TuaCD) {
        this.TuaCD = TuaCD;
    }

    public float getGiaThanh() {
        return GiaThanh;
    }

    public void setGiaThanh(float GiaThanh) {
        this.GiaThanh = GiaThanh;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma CD:");
        MaCD=sc.nextInt();
        setMaCD(MaCD);
        sc.nextLine();
        System.out.println("Nhap tua CD:");
        TuaCD=sc.nextLine();
        do {            
            System.out.println("Nhap so bai hat:");
            SoBaiHat=sc.nextInt();
            if(SoBaiHat<=0)
                System.out.println("Nhap sai roi! moi nhap lai!");
        } while (SoBaiHat<=0);
        do {            
            System.out.println("Nhap gia thanh:");
            GiaThanh=sc.nextFloat();
            if(GiaThanh<=0)
                System.out.println("Nhap sai roi! moi nhap lai!");
        } while (GiaThanh<=0);
       
    }
    public void output()
    {
        System.out.printf("|%-7d|%-20s|%-10d|%-10f|",MaCD,TuaCD,SoBaiHat,GiaThanh);
    }
    public static void main(String[] args) {
        CD a=new CD();
        a.input();
        CD b=new CD();
        b.input();
        a.output();
        b.output();
    }
}
