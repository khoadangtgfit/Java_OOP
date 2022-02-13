package Tuan3;

import java.util.Scanner;

public class NhanVien {
	private String MaSo,HoTen;
    private float LuongCoban;
    private int HeSoLuong;
    static int SoLuongNhanVien=0;

    public NhanVien(String MaSo, String HoTen, int HeSoLuong) {
        this.MaSo = MaSo;
        this.HoTen = HoTen;
        this.LuongCoban=20000;
        this.HeSoLuong = HeSoLuong;
        SoLuongNhanVien++;
    }
    public NhanVien()
    {
       LuongCoban=20000;
       SoLuongNhanVien++;
    }

    public void setMaSo(String MaSo) {
        this.MaSo = MaSo;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setHeSoLuong(int HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public String getMaSo() {
        return MaSo;
    }

    public String getHoTen() {
        return HoTen;
    }

    public int getHeSoLuong() {
        return HeSoLuong;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        HoTen=sc.nextLine();
        System.out.println("Nhap ma nhan vien:");
        MaSo=sc.nextLine();
        System.out.println("Nhap so luong nhan vien:");
        SoLuongNhanVien=sc.nextInt();
    }
    public void Xuat()
    {
    	System.out.printf("\n| %-11s| %-30s|  %-10f| %-12d |",MaSo, HoTen, LuongCoban, HeSoLuong);
    }
    public float TinhLuong()
    {
    	return LuongCoban*HeSoLuong;
    }
    public static void InSLNhanVien()
    {
    	System.out.println("So luong nhan vien ="+SoLuongNhanVien);
    }
}
