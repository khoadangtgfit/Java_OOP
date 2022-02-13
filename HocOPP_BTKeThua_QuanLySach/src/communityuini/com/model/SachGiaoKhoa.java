package communityuini.com.model;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
	private String tinhTrang;
	private int number;
	private double thanhTien;
	public SachGiaoKhoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SachGiaoKhoa(String tinhTrang,int number) {
		super();
		this.tinhTrang=tinhTrang;
		this.number=number;
		// TODO Auto-generated constructor stub
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	public String tinhTrangSach(int x)
	{
		switch (number) {
		case 0: {
			tinhTrang="cũ";
			break;
		}
		case 1:
		{
			tinhTrang="Mới";
			break;
		}
		default:
			break;
		}
		return tinhTrang;
	}
	public void Nhap()
	{
		super.Nhap();
		System.out.println("Nhập tình trạng(0-cũ/1-mới):");;
		number=sc.nextInt();
	}
	public String toString() {
		return super.toString()+",tình trạng sách: "+this.tinhTrangSach(number);
	}
	}
