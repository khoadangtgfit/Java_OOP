package week1;

import java.util.Scanner;

public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so dong:");
		int n=sc.nextInt();
		System.out.println("Nhap so cot:");
		int m=sc.nextInt();
		int a[][]=new int [n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=(int)(Math.random()*50);
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}
		int k;
		do {
			System.out.println("Nhap dong can tinh tong:");
			k=sc.nextInt();
			if(k<0||k>n-1)
				System.out.println("Nhap sai moi nhap lai!");
		} while (k<0||k>n-1);
		int Tong=0;
		for(int i=0;i<m;i++)
		{
			Tong+=a[k][i];
		}
		System.out.println("Tong phan tu cua dong "+k+"="+Tong);
	}

}
