package lab_exercise;
import java.util.*;
public class car_name_model {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum car{Rolls_Royce(2022), Lamborgini(2021), Ferari(2019);
			private int a;
			private car(int a)
			{
				this.a=a;
			}	
		}
		System.out.println("Car_Name:\tModel-Year:");
		for(car c : car.values())
			System.out.println(c+"\t"+c.a);	
	}

}
