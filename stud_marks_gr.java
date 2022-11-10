package lab_exercise;

public class stud_marks_gr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mrk[]= {100,88,89,80,90,95};
		char rnk[]= {'A','B','C','D','E'};
		String name[]= {"khaleel","sabir","kashif",
				"yaseen","faiz"};
		int n= mrk.length;
		int tmp; 
		
		for(int i=0;i<n-1;i++)
		{
				if(mrk[i]>mrk[i+1]) 
				{
					tmp=mrk[i];
					mrk[i]=mrk[i+1];
					mrk[i+1]=tmp;
				}
		}
		System.out.println("Marks:  NAME:  Rank:");
		for(int i=n-1,k=0;i>=0;i--)
		{
			System.out.println(mrk[i]+"\t"+name[k]+"\t"+rnk[k]);
			k++;
		}
	}
}
