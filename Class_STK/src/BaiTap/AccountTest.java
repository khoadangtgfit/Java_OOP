package BaiTap;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountList list=new AccountList(20);
		int chon=0;
		do {
			chon=menu();
			switch(chon)
			{
			case 1: ThemTK(list); break;
			case 2:System.out.println("So TK hien la la:"+list.XuatSL()); break;
			case 3: inThongtinTacaTK(list); break;
			case 4: naptien(list); break;
			case 5: chuyentien(list); break;
			case 6: chuyentien(list);
			
			}
		}while(chon<7);
	}
	private static void ThemTK(AccountList list) {
		list.Them1Account();
	}
	public static int menu()
	{
		int chonCV;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Them tai khoan");
		System.out.println("2.So tai khoan hien co");
		System.out.println("3.In thong tin tat ca TK");
		System.out.println("4.Nap tien vao TK");
		System.out.println("5.Rut tien");
		System.out.println("6.Chuyen tien");
		System.out.println("7.Ket thuc");
		System.out.println("Moi chon:");
		chonCV=sc.nextInt();
		return chonCV;
	}
	private static void chuyentien(AccountList list) {
		// TODO Auto-generated method stub
		
	}

	private static void naptien(AccountList list) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int soTK;
		double sotiennap;
		System.out.println("Nhap so TK");
		soTK=sc.nextInt();
		Account acc=list.TimTK(soTK);
		if(acc!=null)
		{
			System.out.println("Nhap so tien:");
			sotiennap=sc.nextDouble();
			System.out.println(acc.NapTien(sotiennap));
		}
	}

	private static void inThongtinTacaTK(AccountList list) {
		// TODO Auto-generated method stub
		System.out.println(list.Xuat());
	}

}
