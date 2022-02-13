package commununi.com;

import communityuni.model.com.NhanVien;

public class TestAlias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1=new NhanVien(1, "obama");
		NhanVien nv2=new NhanVien(2, "Putin");
		nv1=nv2;
		nv2.setTen("Kim Jong Un");
		System.out.println("Ten cua nhan vien 1="+nv1.getTen());
		nv1.setTen("Ho cam dao");
		System.out.println("Ten cua nhan vien 2="+nv2.getTen());
		NhanVien nv3 =new NhanVien(3, "Ong thanh");
		NhanVien nv4 =new NhanVien(4, "Ong hung");
		nv3=nv4.copy();
		System.out.println("Ten nhan vien 3= "+nv3.getTen());
		nv4.setTen("Teo");
		System.out.println("Ten nhan vien 3= "+nv3.getTen());
		nv3.setTen("Khoa");
		System.out.println("Ten cua nhan vien 4="+nv4.getTen());
	}

}
