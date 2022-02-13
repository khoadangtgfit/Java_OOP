package community.model.com;

public class NhanVienChinhThuc extends NhanVien {
	public NhanVienChinhThuc()
	{
		super();
	}
	public NhanVienChinhThuc(int ma,String ten)
	{
		super(ma,ten);
	}
	public void TinhLuong() {
		// TODO Auto-generated method stub
		super.TinhLuong();
		System.out.println("Day la nhan vien thoi vu");
	}
}
