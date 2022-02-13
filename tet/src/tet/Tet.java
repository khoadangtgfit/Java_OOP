/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tet;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Tet {
    static ArrayList<Integer> dsData=new ArrayList();

    public static void Menu()
    {
        System.out.println("1.Them");
        System.out.println("2.Xuat");
        System.out.println("3.Sua");
        System.out.println("4.Xoa");
        System.out.println("5.Tim Kiem");
        System.out.println("6.Sap Xep");
        System.out.println("7.Thoat");
        System.out.println("Xin moi chon");
        int chon = new Scanner(System.in).nextInt();
        switch(chon)
        {
            case 1: Them(); break;
            case 2: Xuat(); break;
            case 3: Sua(); break;
            case 4: Xoa(); break;
            case 5: TimKiem(); break;
            case 6: SapXep(); break;
            default: break;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void Them()
    {
        System.out.println("Nhap gia tri muon them:");
        int value=new Scanner(System.in).nextInt();
        dsData.add(value);
    }
    public static void Xuat()
    {
        for(int i=0;i<dsData.size();i++){
            System.out.println(dsData.get(i));
        }
    }
    public static void Sua()
    {
        System.out.println("Vi tri muon sua:");
        int vt=new Scanner(System.in).nextInt();
        System.out.println("Nhap gia tri moi:");
        int value=new Scanner(System.in).nextInt();
        dsData.set(vt, value);
    }
    public static void main(String[] args) {
        while (true) {            
            Menu();
        }
        
    }
    
}
