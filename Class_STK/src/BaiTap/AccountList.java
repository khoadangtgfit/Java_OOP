package BaiTap;

public class AccountList {
	Account [] accList;
	int count;
	public AccountList()
	{
		accList =new Account[10];
		count=0;
	}
	public AccountList(int n)
	{
		if(n>0) {
		accList=new Account[n];
		}
		else
		{
			accList =new Account[10];
			count=0;
		}
	}
	public void Them1Account()
	{
		if(count>=accList.length)
		{
			System.out.println("Mang day khong them duoc");
		}
		else
		{
			Account a=new Account();
			a.Nhap();
			accList[count]=a;
			count++;
		}
	}
	public Account TimTK(long sotaikhoan)
	{
		for(Account a:accList)
		{
			if(a.getSTK()==sotaikhoan)
				return a;
		}
		return null;
	}
	public void XoaTK(long sotaikhoan)
	{
		int vt=0;
		boolean flag=false;
		for(int i=0;i<count;i++)
		{
			if(accList[i].getSTK()==sotaikhoan)
				vt=i; flag=true; break;
		}
		if(flag==true) {
			for(int i=vt;i<count;i++)
			{
				accList[i]=accList[i+1];
			}
			count--;
		}
		else {
			System.out.println("Khong co tai khoan khoan nao co so TK la "+sotaikhoan);
		}
	}
	public int XuatSL()
	{
		return count;
	}
	public String Xuat()
	{
		String ttTatCaTK="";
		for(int i=0;i<count;i++)
			ttTatCaTK+=accList[i].toString();
		return ttTatCaTK;
	}
}
