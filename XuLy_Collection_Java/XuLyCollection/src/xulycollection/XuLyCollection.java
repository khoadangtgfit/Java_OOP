/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulycollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class XuLyCollection {

    /**
     * @param args the command line arguments
     */
    static HashMap<Integer,String> map=new HashMap<>();
    public static void Menu()
    {
        System.out.println("1.Them");
        System.out.println("2.Xuat");
        System.out.println("3.Xoa");
        System.out.println("4.Sua");
        System.out.println("5.Tim");
        System.out.println("6.Thoat");
        System.out.println("Moi ban chon:");
        int chon=new Scanner(System.in).nextInt();
        switch(chon)
        {
            case 1:
                them();
                break;
            case 2:
                xuat();
                break;
            case 3:
                xoa();
                break;
            case 4:
                sua();
                break;
            case 5:
                tim();
                break;
            case 6:
                break;
        }
    }
  public static void main(String a[])
  {
      while(true)
      {
          Menu();
      }
      
  }

    private static void them() {
        System.out.println("Nhap ma:");
        int ma=new Scanner(System.in).nextInt();
        if(map.containsKey(ma)==false)
        {
            System.out.println("Nhap ten:");
            String ten=new Scanner(System.in).nextLine();
            map.put(ma, ten);
        }
        else
        {
            System.out.println("Ma "+ma+" da ton tai");
        }
    }

    private static void xuat() {
        for(Map.Entry<Integer,String> item:map.entrySet())
        {
            System.out.println(item.getKey()+"-"+item.getValue());
        }
    }

    private static void xoa() {
        System.out.println("Nhap ma can xoa:");
        int ma=new Scanner(System.in).nextInt();
        if(map.containsKey(ma)==true)
        {
            map.remove(ma);
        }
        else
        {
            System.out.println("Ma "+ma+" khong ton tai");
        }
    }

    private static void sua() {
        System.out.println("Nhap ma muon sua:");
        int ma=new Scanner(System.in).nextInt();
        if(map.containsKey(ma)==true)
        {
            System.out.println("Nhap ten:");
            String ten=new Scanner(System.in).nextLine();
            map.put(ma, ten);
        }
        else
        {
            System.out.println("Ma "+ma+" khong ton tai");
        }
    }
    
    private static void tim() {
        System.out.println("Nhap ten can tim:");
        String ten=new Scanner(System.in).nextLine();
        for(Map.Entry<Integer,String>item:map.entrySet())
        {
            if(map.containsValue(ten)==true)
            {
                System.out.println(item.getKey()+"-"+item.getValue());
            }
        }
    }

}
