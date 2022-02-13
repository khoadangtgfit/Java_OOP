package week2;

public class PhuongTrinhBacNhat {
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public PhuongTrinhBacNhat(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public PhuongTrinhBacNhat() {
		super();
	}
	public double GiaiPT()
	{
		return -(double)b/a;
	}
	public String toString()
	{
		return "x="+GiaiPT();
	}
}
