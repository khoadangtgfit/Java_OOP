package TestTry_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TestTryCatch {
	public static String taolao()
	{
		int x=0;
		x=x+10;
		return "khoa ngu";
	}
	public static void main(String args[])
	{
		int chon=0;
		do {
			System.out.println("1.di choi");
			System.out.println("2.di nhau");
			System.out.println("3.di hoc");
			System.out.println("0.thoat");
			Scanner sc=new Scanner(System.in);
			try {
				System.out.println("chon chuc nang:");
				chon=sc.nextInt();
			}
			catch (InputMismatchException ei) {
				System.out.println("nhap sai nhap lai");
				
				// TODO: handle exception
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (chon!=0);
		System.out.println(taolao());
	}
}
