package communityuni.com;

public class SinhVien {
	private int ma;
	private String ten;
	private double diem;
	public SinhVien()
	{
		
	}
	public SinhVien(int ma)
	{
		this();
		this.ma=ma;
	}
	public SinhVien(int ma,String ten)
	{
		this(ma);
		this.ten=ten;
	}
	public SinhVien(int ma,String ten,double diem)
	{
		this(ma,ten);
		this.diem=diem;
	}
	public void xetTotNghiep()
	{
		if(this.diem>=5)
		{
			System.out.println("Tot nghiep");
		}
		else
		{
			System.out.println("Chua duoc tot nghiep");
		}
	}
	public void xetTotNghiep(double diem)
	{
		System.out.println("Ban co diem "+diem);
	}
	public void xetTotNghiep(double diem,int vunguutien)
	{
		System.out.println("ban co diem "+diem+" ;vung uu tien ="+vunguutien);
	}
}
