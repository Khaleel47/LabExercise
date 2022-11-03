package javaw;

public class palindrome
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int r,s=0,t;
		int n=12345432;
		t=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(t==s)
			System.out.println(t+" is a palindrome.");
		else
			System.out.println(t+" is not a palindrome.");
	}

}
