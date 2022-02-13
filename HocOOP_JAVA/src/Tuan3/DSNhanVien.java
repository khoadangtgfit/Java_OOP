package Tuan3;

import java.util.Scanner;

public class DSNhanVien {
	private NhanVien a[];
	private int sl;
	public DSNhanVien(NhanVien[] a, int sl) {
		super();
		this.a = a;
		this.sl = sl;
	}
	public DSNhanVien()
	{
		a=null;
		sl=0;
	}
	public void _ngang()
	{	System.out.printf("\n============================================================================");
	}
	//==========================================   
	public void tieuDe() 
	{
		_ngang();
		System.out.printf("\n| %-11s| %-30s|  %-10s| %-12s |","Ma So", "Ho Ten", "Luong co Ban", "He So Luong");
		_ngang();
	}
	public void NhapSL()
	{
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Moi nhap so luong:");
			sl=sc.nextInt();
			if(sl<1) System.out.println("Nhap sai so luong! Moi nhap lai");
		} while (sl<1);
	}
	public void Nhap()
	{
		NhapSL();
		a=new NhanVien[sl];
		for(int i=0;i<sl;i++)
		{
			a[i]=new NhanVien();
			a[i].Nhap();
		}
	}
	public void Xuat()
	{
		tieuDe();
		for(int i=0;i<sl;i++)
		{
			a[i].Xuat();
			_ngang();
			System.out.println();
		}
	}
	public void XuatSL()
	{
		NhanVien a=new NhanVien();
		a.InSLNhanVien();
	}
	public void init(){
        sl=10;
        a=new NhanVien[sl];
        a[0]= new NhanVien("2011060024", "Tran Trung Truc",	 2002);
        a[1]= new NhanVien("2011060029", "Ho Mai Thuy",		 2001);
        a[2]= new NhanVien("2011060022", "Nguyen Cong Bang",	 2002 );
        a[3]= new NhanVien("2011060028", "Dang Van Thanh",	 2002);
        a[4]= new NhanVien("2011060021", "Truong Quoc Cong",	 2000);
        a[5]= new NhanVien("2011060027", "Duong Quoc Khanh",	 2001);
        a[6]= new NhanVien("2011060026", "Nguyen Thi Kieu My", 2002);
        a[7]= new NhanVien("2011060020", "Vo Van Cuong",		 2002);
        a[8]= new NhanVien("2011060023", "Huynh Kim Cuong",	 2001);
        a[9]= new NhanVien("2011060025", "Phan Van Manh",		 2002);
      
    }
}
