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
public class khoa {
    public static int sl=0;

    public khoa() {
        sl++;
    }

    public static int getSl() {
        return sl;
    }
    public static void xuat()
    {
        System.out.println("Khoa ngu");
    }
    
}
