package communityuini.com.model;

import java.util.Scanner;

public class SachThamKhao extends Sach {
	private double thue,thanhTien;

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public SachThamKhao() {
		super();
	}
	public SachThamKhao(double thue)
	{
		super();
		this.thue=thue;
	}
	public void Nhap()
	{
		super.Nhap();
		System.out.println("Nhập thuế:");
		thue=sc.nextDouble();
	}
	public String toString()
	{
		return super.toString()+ ",thue:"+this.thue;
	}

}
