/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Administrator
 */
public class test {
    static byte b=0;
    private float a=5;
    public static void Xuat()
    {
        b+=1;
        System.out.println(b);
    }
    public static void main(String []a)
    {
        Xuat();
        System.out.println("Tong="+tong(3, 6));
    
    }
    public static int tong(int a,int b)
    {
        return a+b;
    }
    

}
