package javaw;

public class new_prime
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,m=0,f=0;
		int n=67;
		m=n/2;
		if((n==0)||(n==1))
		{
			f=1;
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					f=1;
					break;
				}
			}
		
			if(f==0)
			{
				System.out.println(n+" is a prime no.");
			}
			else
				System.out.print(n+" is not a prime no.");
		}
	}

}
