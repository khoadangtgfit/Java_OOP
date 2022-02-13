package communityuni.com.model;
public class SinhVien {
	private String hoTen;
	private double diem;
	public void setHoTen(String hoten)
	{
		this.hoTen=hoten;
	}
	public String getHoTen()
	{
		return this.hoTen;
	}
	public void setDiem(double diem)
	{
		this.diem=diem;
	}
	public double getDiem()
	{
		return this.diem;
	}
	public SinhVien()
	{
		System.out.println("Đây là constructor mặc định");
	}
	public SinhVien(String hoTen,double Diem)
	{
		this.hoTen=hoTen;
		this.diem=Diem;
		System.out.println("Đây là constructor có đối số");
	}
}
