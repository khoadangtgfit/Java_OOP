package communityuni.com.test;

import communityuni.com.model.HinhChuNhat;
import communityuni.com.model.HinhHoc;

public class TestHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h;
		h=new HinhChuNhat(4, 5);
		System.out.println("Chu vi ="+h.tinhChuVi());
		System.out.println("Dien tich ="+h.tinhDienTich());
	}

}
