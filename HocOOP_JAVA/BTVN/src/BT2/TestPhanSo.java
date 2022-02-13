/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Administrator
 */
public class TestPhanSo {
    public static void main(String[] args) {
        PhanSo ps1=new PhanSo(-1, -1);
        PhanSo ps2=new PhanSo(-1, -1);
        PhanSo tong=ps1.Tong(ps2).RutGon().ChuanHoa();
        PhanSo hieu=ps1.Hieu(ps2).RutGon().ChuanHoa();
        PhanSo tich=ps1.Tich(ps2).RutGon().ChuanHoa();
        PhanSo thuong=ps1.Thuong(ps2).RutGon().ChuanHoa();
        System.out.println("Tong="+tong.Xuat());
        System.out.println("Hieu="+hieu.Xuat());
        System.out.println("Tich="+tich.Xuat());
        System.out.println("Thuong="+thuong.Xuat());
        
    }
}
