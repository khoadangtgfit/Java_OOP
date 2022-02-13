package communityuni.com;

public class TestParemeter {

	public static int sum(int ...arr)
	{
		int s=0;
		for(int i=0;i<arr.length;i++)
				s+=arr[i];
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=sum(1,2,3,4,5);
		System.out.println(s);
	}

}
