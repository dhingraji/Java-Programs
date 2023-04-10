class Sum {
	int num1;
	int num2;
	void sum(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("Sum="+sum);
		
	}
}
public class Addition {

	public static void main(String[] args) {
		Sum s1=new Sum();
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		s1.sum(num1,num2);
		
		// TODO Auto-generated method stub

	}

}
