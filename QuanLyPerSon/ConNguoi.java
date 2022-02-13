//  Họ và tên: Đặng Phước Khoa
 // Lớp:19DTHE1
 //MSSV:1911066165
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ConNguoi {
    protected String HoTen,NgaySinh;

    public ConNguoi() {
    }

    public ConNguoi(String HoTen, String NgaySinh) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        HoTen=sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        NgaySinh =sc.nextLine();
    }
    @Override
    public String toString() {
        return "ConNguoi{" + "HoTen=" + HoTen + ", NgaySinh=" + NgaySinh + '}';
    }
}
