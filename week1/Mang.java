/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Mang {
    private int n;
    private int a[];

    public int getN() {
        return n;
    }

    public int[] getA() {
        return a;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    public void input(int a[],int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu "+(i+1));
            a[i]=sc.nextInt();
        }
       
    }
    public void output(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("\t"+a[i]);
        }
    }
    public double tinhTBLe(int a[],int n)
    {
        int dem=0,tong=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                tong+=a[i];
                dem++;
            }
        }
        double kq=(tong*1.0)/dem;
        return kq;
    }
    public int timMax(int a[],int n)
    {
        int vtmax=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[vtmax])
                vtmax=i;
        }
        return a[vtmax];
    }
    public void SapXep(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
}
