package BaiTap;
/*
 * cho ngẫu nhiên số N và N số tự nhiên
 * Tìm dãy con tăng đơn điệu dài nhất
 * INPUT:
 * 10
 * 3 4 5 6 8 2 2 1 9 8
 * OUTPUT:
 * 6
 * */
public class DayConTangDaiNhat {
	public static void TimDayCondaiNhat(int a[],int n) {
		for(int i=0;i<n;i++) {
			a[i]=(int) (Math.random()%10);
		}
		System.out.println("input:");
		for(int i=0;i<n;i++) {
			System.out.print("\t"+a[i]);
		}
		int l[]=new int[n];
		int lmax=0;
		for(int i=0;i<n;i++) {
			lmax=0;
			for(int j=0;j<i;j++) {
				if(a[j]<a[i]) {
					if(l[j]<l[i]) {
						lmax=l[i];
					}
				}
			}
			l[i]=lmax+1;
		}
		System.out.println("Ket qua:"+lmax);
	}
	
	public static void main(String[] args) {
		int a[]=null;
		int n=0;
		TimDayCondaiNhat(a,n);
		
	}
}
