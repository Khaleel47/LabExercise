package javaw;

public class prime_or_not
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,m=0,f=0;
		int n=98;
		m=n/2;
		if((n==0)||(n==1))
		{
			System.out.print(n+" is not a prime no.");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.print(n+" is not a prime no.");
					f=1;
					break;
				}
			}
		
			if(f==0)
			{
				System.out.println(n+" is a prime no.");
			}
		}
	}

}
