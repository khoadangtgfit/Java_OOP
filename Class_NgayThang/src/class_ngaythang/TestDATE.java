/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_ngaythang;

/**
 *
 * @author Administrator
 */
public class TestDATE {
    public static void main(String[] args) {
        DATE a=new DATE(1,2,2000);
        System.out.println("Thu tu ngay trong nam= "+a.TinhSoThuTuNgayTrongNam());
        DATE b=new DATE();
        b.Ngaytt(32, 2000);
    }
}
