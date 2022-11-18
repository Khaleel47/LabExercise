package lab_exercise;
import java.util.*;

public class all_oper_excp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number");
		n = s.nextInt();
	    m = s.nextInt();
	    try
	    {
	    	if(n==0 || m==0)
		    { System.out.println("any of the number should not be "
		    		+ "equal to zero(0) "); }
	    	else
	    	{
	    	System.out.println(n + " + " + m + " = " + (n+m));
	    	System.out.println(n + " - " + m + " = " + (n-m));
	    	System.out.println(n + " * " + m + " = " + (n*m));
        	System.out.println(n + " / " + m + " = " + (n/m));
	    }	}
	    catch(ArithmeticException e)
	    {    	
		    System.out.println(" number should not be zero(0) "
		    			+e.getMessage());  		    
	    }
	    catch(InputMismatchException f)
	    {
	     	System.out.println(" number should not be zero(0) "
	    			+f.getMessage());
	    }
	}
} 