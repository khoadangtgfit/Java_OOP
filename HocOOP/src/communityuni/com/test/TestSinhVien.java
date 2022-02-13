package communityuni.com.test;

import communityuni.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien obama=new SinhVien();
		SinhVien taolao= new SinhVien("Dang phuoc khoa",7.8);
		System.out.println("hoten ="+taolao.getHoTen());
		System.out.println("diem ="+taolao.getDiem());
		obama.setDiem(9.0);
		System.out.println("Diem obama="+obama.getDiem());
	}

}
