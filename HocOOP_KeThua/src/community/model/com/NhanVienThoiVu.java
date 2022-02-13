package community.model.com;

public class NhanVienThoiVu extends NhanVien{
	public NhanVienThoiVu()
	{
		super();
	}
	public NhanVienThoiVu(int ma,String ten)
	{
		super(ma,ten);
	}
	public void TinhLuong()
	{
		super.TinhLuong();
		System.out.println("Day la nhan vien thoi vu");
	}
}
