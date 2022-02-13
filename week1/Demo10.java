/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author Administrator
 */
public class Demo10 {
    public static void main(String[] args) {
        PhanSo ps1=new PhanSo(7, -1);
        PhanSo ps2=new PhanSo(7,3);
        PhanSo tong=ps1.Cong2PS(ps2).RutGon().ChuanHoa();
        PhanSo tich=ps1.Tich2PS(ps2).RutGon().ChuanHoa();
        PhanSo chuanhoa=ps1.ChuanHoa();
        chuanhoa.output();
        tong.output();
        tich.output();
    }
}
