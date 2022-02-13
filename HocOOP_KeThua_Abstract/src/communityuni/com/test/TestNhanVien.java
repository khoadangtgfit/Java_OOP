package communityuni.com.test;

import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo=new NhanVienChinhThuc(1,"khoa");
		teo.tinhLuong();
		NhanVienThoiVu ty=new NhanVienThoiVu(1,"ty");
		ty.tinhLuong();
	}

}
