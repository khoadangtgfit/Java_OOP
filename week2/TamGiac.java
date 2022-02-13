package week2;


public class TamGiac {
	private int a,b,c;

	public TamGiac(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public TamGiac() {
		super();
	}
	public int TinhChuVi()
	{
		return a+b+c;
	}
	public float TinhDienTich()
	{
		float p=(float)(a+b+c)/2;
		return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public String toString()
	{
		int x=(int)Math.pow(a, 2);
		int y=(int)Math.pow(b, 2);
		int z=(int)Math.pow(c, 2);
		if(a==c&&a==b&&c==b)
			return "Tam Giac Deu";
		else if((a==c)||(c==a)||(b==c))
			return "Tam Giac Can";
		else if((x==y+z)^(y==x+z)^(z==x+y))
		{
			return "Tam Giac Vuong";
		}
		else if((x==y+z)^(y==x+z)^(z==x+y)&&(a==c)^(c==a)^(b==c))
			return "Tam Giac Vuong Can";
		else if(a<=0||b<=0||c<=0||a>=b+c||b>=a+c||c>=a+b)
			return "Ko phai tam giac";
		else
			return "Tam Giac Thuong";
	}
	public void Xuat()
	{
		float x=TinhChuVi();
		float y=TinhDienTich();
		String s=toString();
		System.out.printf("|%-5d |%-5d |%-5d |%-10f|%-10f|%-17s|",a,b,c,x,y,s);
	}
}
