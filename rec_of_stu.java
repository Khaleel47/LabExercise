package lab_exercise;
public class rec_of_stu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id[]= {101,102,103,104,105};
		String name[]= {"khaleel","sabir","kashif",
				"yaseen","faiz"};
		System.out.println("THE student details are \n"
				+ "ID:\tNAME:");
		for(int i=0;i<5;i++)
		{
			System.out.println(id[i]+"\t"+name[i]);
		}
	}
}