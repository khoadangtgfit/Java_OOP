package communityuni.com.model;

import java.util.Scanner;

public class TaiLieu {
	String maTaiLieu,tenNhaXuatBan;
	int soBanPhatHanh;
	Scanner sc=new Scanner(System.in);
	public void Nhap()
	{
		System.out.println("Nhap ma tai lieu:");
		maTaiLieu=sc.nextLine();
		System.out.println("Nhap ten nha xuat ban:");
		tenNhaXuatBan=sc.nextLine();
		System.out.println("Nhap so ban phat hanh:");
		soBanPhatHanh=sc.nextInt();
	}
	public void Xuat()
	{
		 System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20sn",
	                "Ma Tai Lieu", "Nha Xuat Ban", "So Ban Phat Hanh",
	                "Tac Gia Sach", "So Trang Sach", "So Phat Hanh",
	                "Thang Phat Hanh", "Ngay Phat Hanh");
	     System.out.printf("%20s %20s %20d", maTaiLieu,
	                tenNhaXuatBan, soBanPhatHanh);
	}
}
