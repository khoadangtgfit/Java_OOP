package communityuini.com.model;

import java.util.Scanner;

public class Sach {
	public String maSach,nhaXuatBan;
	private double donGia;
	private int soLuong;
	Scanner sc=new Scanner(System.in);
	public String getMaSach() {
		return maSach;
	}
	public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong, Scanner sc) {
		super();
		this.maSach = maSach;
		this.nhaXuatBan = nhaXuatBan;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.sc = sc;
	}
	public Sach() {
		super();
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}	
	public void Nhap()
	{
		System.out.println("Nhập mã sách:");
		maSach=sc.nextLine();
		System.out.println("Nhập tên nhà xuất bản:");
		nhaXuatBan=sc.nextLine();
		System.out.println("Nhập đơn giá:");
		donGia=sc.nextDouble();
		System.out.println("Nhập số lượng:");
		soLuong=sc.nextInt();
	}
	public String toString()
	{
		return "Mã sách: "+this.maSach+", tên nhà xuất bản:"+this.nhaXuatBan+", đơn giá:"+
				this.donGia+",số lượng :"+this.soLuong;
	}
}
