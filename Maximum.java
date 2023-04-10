import java.util.*;

class Max {
	int num1;
	int num2;
	void setData() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the firstno");
		int num1=kb.nextInt();
		System.out.println("Enter the second number");
		int num2=kb.nextInt();
		System.out.println("Enter the third number");
		int num3=kb.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("The Greatest No is "+num1);
			}
		}
		else if(num2>num3) {
			System.out.println("The Greatest No is "+num2);
			
		}
		else {
			System.out.println("The Greatest No is "+num3);
		}
		
	}
	
	
}
public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Max m1=new Max();
       m1.setData();
	}

}
