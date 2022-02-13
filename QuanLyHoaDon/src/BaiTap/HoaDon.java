package BaiTap;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class HoaDon {
	protected String mahd,tenkh,maphong;
	protected LocalDate ngayhd;
	protected double dongia;
	public String getMahd() {
		return mahd;
	}
	public void setMahd(String mahd) {
		this.mahd = mahd;
	}
	public String getTenkh() {
		return tenkh;
	}
	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}
	public String getMaphong() {
		return maphong;
	}
	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}
	public LocalDate getNgayhd() {
		return ngayhd;
	}
	public void setNgayhd(LocalDate ngayhd) {
		this.ngayhd = ngayhd;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public HoaDon(String mahd, String tenkh, String maphong, LocalDate ngayhd, double dongia) {
		super();
		this.mahd = mahd;
		this.tenkh = tenkh;
		this.maphong = maphong;
		this.ngayhd = ngayhd;
		this.dongia = dongia;
	}
	public HoaDon() {
		super();
	}
	public void Nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma hd:");
		mahd=sc.nextLine();
		System.out.println("Nhap ten khach hang:");
		tenkh=sc.nextLine();
		System.out.println("Nhap ma phong:");
		
	}
	
	
}
