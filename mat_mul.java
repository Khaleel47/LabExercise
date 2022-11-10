package lab_exercise;

public class mat_mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{2,3}};
		int b[][]= {{2,3},{3,4}};
		int m[][]=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				m[i][j]=0;
				m[i][j]=a[i][j]*b[i][j];
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}

}
