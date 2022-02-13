package communityuni.com.test;

import java.util.ArrayList;
import java.util.Scanner;

import communityuini.com.model.Sach;
import communityuini.com.model.SachGiaoKhoa;
import communityuini.com.model.SachThamKhao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sach> arrSGK=new ArrayList<>();
		ArrayList<SachThamKhao> arrSTK=new ArrayList<>();
		int soSachGiaoKhoa,soSachThamKhao,chon=0;
		double tongTienSachGiaoKhoa=0,tongTienSachThamKhao=0,tongDonGiaSachThamKhao=0,
				trungBinhCongDonGia=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("=============MENU=============");
			System.out.println("1.Nhập thông tin sách giáo khoa");
			System.out.println("2.Nhập thông tin sách tham khảo");
			System.out.println("0.Thoat");
			do {
				chon=sc.nextInt();
				if(chon<0||chon>2)
					System.out.println("Lựa chọn sai mời nhập lại");
			} while (chon<0||chon>2);
			if(chon==1)
			{
				SachGiaoKhoa h=new SachGiaoKhoa();
				h.Nhap();
				arrSGK.add(h);
			}
			else if(chon==2)
			{
				SachThamKhao h=new SachThamKhao();
				h.Nhap();
				arrSTK.add(h);
			}
		} while (chon!=0);
		System.out.println("Thông tin sách giáo khoa:");
		for(int i=0;i<arrSGK.size();i++)
		{
			System.out.println(arrSGK.get(i).toString());
		}
		System.out.println("Thông tin sách tham khao:");
		for(int i=0;i<arrSTK.size();i++)
		{
			System.out.println(arrSTK.get(i).toString());
		}
		Sach p=new SachGiaoKhoa();
		p.Nhap();
	}


}
