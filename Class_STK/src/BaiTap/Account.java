package BaiTap;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
	private long STK;
	private String TenTaiKhoan;
	private double SoTienTrongTK;
	public Account() {
		super();
		STK=999999;
		TenTaiKhoan="";
		SoTienTrongTK=50;
	}
	public Account(long sTK, String tenTaiKhoan, double soTienTrongTK) {
		super();
		STK = sTK;
		TenTaiKhoan = tenTaiKhoan;
		SoTienTrongTK = soTienTrongTK;
	}
	public long getSTK() {
		return STK;
	}
	public String setSTK(long sTK) {
		if(sTK<0||sTK==999999) {
			this.STK=999999;
			return "So TK phai > 0 va khac 999999";
		}
		else {
			STK = sTK;
			return "";
		}
		
	}
	public String getTenTaiKhoan() {
		return TenTaiKhoan;
	}
	public String setTenTaiKhoan(String tenTaiKhoan) {
		if(tenTaiKhoan=="")
		{
			this.TenTaiKhoan="Ten chua xac dinh";
			return "Ten tai khoan phai xac dinh";
		}
		else
		{
			this.TenTaiKhoan=tenTaiKhoan;
			return "";
		}
	}
	public double getSoTienTrongTK() {
		return SoTienTrongTK;
	}
	public String setSoTienTrongTK(double soTienTrongTK) {
		if(soTienTrongTK<50)
		{
			this.SoTienTrongTK=50;
			return "So tien trong tai khoan phai > 50";
		}
		else
		{
			this.SoTienTrongTK=soTienTrongTK;
			return "";
		}
	}
	public void Nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so tai khoan:");
		STK=sc.nextLong();
		sc.nextLine();
		System.out.println("Nhap ten tai khoan:");
		TenTaiKhoan=sc.nextLine();
		System.out.println("Nhap so tien trong tai khoan:");
		SoTienTrongTK=sc.nextDouble();
	}
	@Override
	public String toString() {
		Locale local=new Locale("vi","vn");
		NumberFormat formater=NumberFormat.getCurrencyInstance(local);
		return String.format("%10d %15s %15s\n", STK,TenTaiKhoan,formater.format(SoTienTrongTK));
	}
	public String NapTien(double sotiennap)
	{
		if(sotiennap<=0)
			return "so tien nap phai lon hon 0";
		else
		{
			setSoTienTrongTK(sotiennap+SoTienTrongTK);
			return "Nap tien thanh cong";
		}
	}
	public String ChuyenTien(Account tk_nhan,double sotienchuyen)
	{
		if(tk_nhan==null)
			return "tai khoan nhan khong hop le";
		if(sotienchuyen > this.SoTienTrongTK)
			return String.format("So tien chuyen [%f] nhieu hon so tien co trong tai khoan [%f]" , sotienchuyen,SoTienTrongTK);
		tk_nhan.setSoTienTrongTK(sotienchuyen+tk_nhan.SoTienTrongTK);
		return"Chuyen tien thanh cong";
	}
	public String RutTien(double SoTienRut)
	{
		if(SoTienRut>this.SoTienTrongTK)
			return String.format("So tien rut [%f] lon hon so tien co trong tai khoan [%f]", SoTienRut,SoTienTrongTK);
		setSoTienTrongTK(SoTienTrongTK-SoTienRut);
		return "Rut tien thanh cong";
	}
}
