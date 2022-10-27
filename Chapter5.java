
public class Chapter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		int num2 = 100;
		
		int big;
		
		
		big=(num1>num2) ? num1 : num2;
		System.out.println("큰 수"+big);
		
		if(num1>num2) {
			System.out.println("큰 수"+num1);
		}else {
			System.out.println("큰 수"+num2);
		}
		//절대값
		int ddd = Math.abs(num1-num2);
		System.out.println(ddd);
		
		if((num1-num2)>0) {
			System.out.println("큰수"+(num1-num2));
		}else {
			System.out.println("큰수"+-(num1-num2));
		}
	}

}
