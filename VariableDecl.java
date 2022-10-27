
public class VariableDecl {

	public static void main(String[] args) {
		double num1, num2;
		double result1;
		
		num1=1.0000001;
		num2=2.0000001;
		result1=num1+num2;
		
		int num3, num4;
		int result2; //int 범위 초과 overflow
		
		num3=2100000000;
		num4=2100000000;
		
		result2=num3+num4;
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
