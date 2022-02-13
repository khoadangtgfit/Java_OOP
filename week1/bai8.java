/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai8 {
    public static void SapXep(String a)
    {
        String b[]=a.split(" ");
        int c[]=new int[b.length];
        for(int i=0;i<b.length;i++)
        {
            c[i]=Integer.parseInt(b[i]);
        }
        for(int i=0;i<c.length-1;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]>c[j])
                {
                    int t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                }
            }
        }
        for(int i=0;i<c.length;i++)
        {
            System.out.print("\t"+c[i]);
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String a="";
        a=sc.nextLine();
        SapXep(a);
    }
}
