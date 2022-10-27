
public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =65;
		
		switch(n) {
		case 'A': //Ascii Code
			System.out.println("Simple Java");
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
		default:
			System.out.println("The best programming language");
		}
		
		System.out.println("Do you like Java?");
		
		
		//additional ex
		int month = 8;
		String monthString = "";
		
		switch(month) {
		case 1: monthString="January";
				break;
		case 2: monthString="February";
				break;
		case 3: monthString="March";
				break;
		case 4: monthString="April";
				break;
		case 5: monthString="May";
				break;
		case 6: monthString="June";
				break;
		case 7: monthString="July";
				break;
		case 8: monthString="August";
				break;
		case 9: monthString="September";
				break;
		case 10: monthString="October";
				break;
		case 11: monthString="November";
				break;
		case 12: monthString="December";
				break;
		default : monthString = "Invalid month";
				break;
		}
		System.out.println(monthString);
	}

}
