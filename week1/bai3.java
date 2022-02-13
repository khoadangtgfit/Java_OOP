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
public class bai3 {
    public static void Nhap(int a[],int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu "+(i+1));
            a[i]=sc.nextInt();
        }
    }
    public static void Xuat(int a[],int n)
    {
        for(int i=0;i<n;i++){
            System.out.println("\t"+a[i]);
        }
    }
    public static int TimPTMAX(int a[],int n)
    {
        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a[];
        System.out.println("Nhap so phan tu:");
        n=sc.nextInt();     
        a=new int[n];
        Nhap(a,n);
        Xuat(a, n);
        System.out.println("Phan tu lon nhat trong mang="+TimPTMAX(a, n));
    }
}
