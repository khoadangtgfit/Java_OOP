/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PhongBanKhoa {
    public String MaPBK,TenPBK;

    public PhongBanKhoa(String MaPBK, String TenPBK) {
        this.MaPBK = MaPBK;
        this.TenPBK = TenPBK;
    }

    public PhongBanKhoa() {
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("-Nhap Ma PBK:");
        MaPBK=sc.nextLine();
        System.out.println("-Nhap Ten PBK:");
        TenPBK=sc.nextLine();
    }

    @Override
    public String toString() {
        return "{" + "MaPBK=" + MaPBK + ", TenPBK=" + TenPBK + '}';
    }
    
}
