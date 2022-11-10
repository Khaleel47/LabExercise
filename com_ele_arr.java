package lab_exercise;

import java.util.Arrays;

public class com_ele_arr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub int f=0; 
//		int t[]=new int[5];
		int a[]= {4,5,6,7,8};
		int b[]= {4,6,8,2,10};
		System.out.println("A= "+Arrays.toString(a));
		System.out.println("B= "+Arrays.toString(b));
		
		System.out.println("the common elements are:");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(" "+a[i]);
				}
			}
		}
	}
}