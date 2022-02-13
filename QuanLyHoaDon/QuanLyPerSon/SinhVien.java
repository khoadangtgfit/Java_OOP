//  Họ và tên: Đặng Phước Khoa
 // Lớp:19DTHE1
 //MSSV:1911066165
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SinhVien extends ConNguoi{
    private String MSSV;
    private double DiemTB;

    public SinhVien() {
    }
    public SinhVien(String MSSV, double DiemTB, String HoTen, String NgaySinh) {
        super(HoTen, NgaySinh);
        this.MSSV = MSSV;
        this.DiemTB = DiemTB;
    }
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma so sinh vien:");
        MSSV = sc.nextLine();
        System.out.println("Nhap diem trung binh:");
        DiemTB = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "SinhVien{" +super.toString()+ "MSSV=" + MSSV + ", DiemTB=" + DiemTB + '}';
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public double getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(double DiemTB) {
        this.DiemTB = DiemTB;
    }
    
}
