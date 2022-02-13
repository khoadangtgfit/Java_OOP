package week2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestNhanVien {
	static ArrayList<NhanVien> arr=new ArrayList<NhanVien>();
	public static void Ngang()
    {
    	System.out.printf("\n=====================================================================================\n");
    }
	static public void Menu()
	{
		int chon;
		do {
			System.out.println("==================MENU==================");
			System.out.println("1.Nhap thong tin nhan vien");
			System.out.println("2.Xuat thong tin cac nhan vien");
			System.out.println("3.Sap xep cac nhan vien theo luong giam dan");
			System.out.println("0.Thoat");
			System.out.println("==================MENU==================");
			System.out.println("Moi chon:");
			do {
				chon=new Scanner(System.in).nextInt();
				if(chon<0||chon>3)
					System.out.println("Chon sai! moi chon lai");
			} while (chon<0||chon>3);
			if(chon==1)
			{
				NhanVien a=new NhanVien();
				a.Nhap();
				arr.add(a);
			}
			else if(chon==2)
			{
				Ngang();
				System.out.printf("|%-4s|%-10s|%-20s|%-14s|%-14s|%-16s|","STT","MaNV","Ho Ten","Luong Co Ban","He So Luong","Luong Chinh Thuc");
				Ngang();
				for(int i=0;i<arr.size();i++)
				{
					arr.get(i).Xuat(i+1);
					Ngang();
				}
			}
			else if(chon==3)
			{
				arr.sort((p1,p2)->{
					if(p1.TinhLuong()>p2.TinhLuong())
						return 1;
					else
						return -1;
				});
			}
			
		} while (chon!=0);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
		
	}

}
