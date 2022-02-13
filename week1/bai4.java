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
public class bai4 {
    public static void main(String []args)
    {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong:");
        n=sc.nextInt();
        System.out.println("Nhap so cot:");
        m=sc.nextInt();
        int a[][];
        a=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=(int)(Math.random()*50);
            }
        }
       for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("\t"+a[i][j]);
            }
            System.out.println();
        }
       int tong=0;
       for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                tong+=a[i][j];
            }
        }
        System.out.println("Tong cac phan tu="+tong);
    }
}
