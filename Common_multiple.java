
public class Common_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int num=1; num<100; num++) {
			if(num%5!=0&&num%7!=0)
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count"+count);
	}

}
