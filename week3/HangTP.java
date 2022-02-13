/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HangTP extends HangHoa{
    private Class_Date ngaysx=new Class_Date();
    private Class_Date ngayhh=new Class_Date();

    public HangTP(Class_Date ngaysx, Class_Date ngayhh) {
        this.ngaysx = ngaysx;
        this.ngayhh = ngayhh;
    }

    public HangTP(Class_Date ngaysx, Class_Date ngayhh, String maHang, String tenHang, long donGia) {
        super(maHang, tenHang, donGia);
        this.ngaysx = ngaysx;
        this.ngayhh = ngayhh;
    }

    public HangTP() {
    }
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap ngay sx:");
        ngaysx.Nhap();
        System.out.println("Nhap ngay hh:");
        ngayhh.Nhap();
        
    }

    @Override
    public String toString() {
        return "HangTP{"+super.toString() + "ngaysx=" + ngaysx.toString() + ", ngayhh=" + ngayhh.toString() + '}';
    }

    public Class_Date getNgaysx() {
        return ngaysx;
    }

    public void setNgaysx(Class_Date ngaysx) {
        this.ngaysx = ngaysx;
    }

    public Class_Date getNgayhh() {
        return ngayhh;
    }

    public void setNgayhh(Class_Date ngayhh) {
        this.ngayhh = ngayhh;
    }
    
}
