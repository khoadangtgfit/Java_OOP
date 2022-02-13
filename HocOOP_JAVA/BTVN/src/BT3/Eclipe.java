/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Eclipe extends HinhTron{
    private double a,b;
    @Override
    public void Nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a:");
        a=sc.nextDouble();
        System.out.println("Nhap b:");
        b=sc.nextDouble();
    }
    
    @Override
    public double TinhDT() {
        return super.PI*a*b;
    }
    
   
    
    
}
