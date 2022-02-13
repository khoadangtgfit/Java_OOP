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
public class Demo2 {
    public static void main(String []args)
    {
        Mang m1=new Mang();
        int a[],n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n:");
        n=sc.nextInt();
        a=new int[n];
        m1.input(a, n);
        m1.output(a,n);
        System.out.println("Phan tu max ="+m1.timMax(a, n));
        m1.SapXep(a, n);
        m1.output(a,n);
        
    }
    
}
