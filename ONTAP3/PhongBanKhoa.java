/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ONTAP3;

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

    public String getMaPBK() {
        return MaPBK;
    }

    public void setMaPBK(String MaPBK) {
        this.MaPBK = MaPBK;
    }

    public String getTenPBK() {
        return TenPBK;
    }

    public void setTenPBK(String TenPBK) {
        this.TenPBK = TenPBK;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("-Nhap ma PBK:");
        MaPBK=sc.nextLine();
        System.out.println("-Nhap ten PBK:");
        TenPBK=sc.nextLine();
    }

    @Override
    public String toString() {
        return "PhongBanKhoa{" + "MaPBK=" + MaPBK + ", TenPBK=" + TenPBK + '}';
    }

   
}
