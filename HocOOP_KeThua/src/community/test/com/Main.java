package community.test.com;

import community.model.com.NhanVienChinhThuc;
import community.model.com.NhanVienThoiVu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo=new NhanVienChinhThuc(1,"Nguyen van teo");
		NhanVienThoiVu ty =new NhanVienThoiVu(1, "Tran Thi Ty");
		teo.TinhLuong();
		ty.TinhLuong();
	}

}
