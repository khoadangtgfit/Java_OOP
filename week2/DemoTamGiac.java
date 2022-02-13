package week2;

public class DemoTamGiac { 
	public static void Ngang()
	{
		System.out.printf("\n==============================================================\n");
	}
	public static void TieuDe()
	{
		System.out.printf("|%-5s|%-5s|%-5s|%-10s|%-10s|%-17s|","Canh 1","Canh 2","Canh 3","Chu vi","Dien tich","Loai tam giac");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac a[]=new TamGiac[10];
		a[0]=new TamGiac(3, 3, 5);
		a[1]=new TamGiac(2, 6, 5);
		a[2]=new TamGiac(2, 3, 1);
		Ngang();
		TieuDe();
		Ngang();
		for(int i=0;i<3;i++)
		{
			a[i].Xuat();
			Ngang();
		}
	
		
	}
	
}
