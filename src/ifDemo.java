
public class ifDemo {
	
	public static void main(String[] args) {
		int month=14;
		switch(month){
		case 1:System.out.println("January");
		       break;
		case 2:System.out.println("Febuary");
			break;
		case 3:System.out.println("March");
			break;
		case 4:System.out.println("April");
			break;
		case 5:System.out.println("May");
			break;
		case 6:System.out.println("June");
			break;
		case 7:System.out.println("July");
			break;
		case 8:System.out.println("August");
			break;
		case 9:System.out.println("Spetember");
			break;
		case 10:System.out.println("October");
			break;
		case 11:System.out.println("November");
			break;
		case 12:System.out.println("December");
			break;
		default:System.out.println("Incorrect Value");
			
		}
	}
	public static void main2(String[] args) {
		int marks = 50;

		if (marks < 40)
			System.out.println("Failed");
		else if (marks < 50)
			System.out.println("Thrid class");
		else if (marks < 70)
			System.out.println("second class");
		else if (marks < 90)
			System.out.println("first class");
		else
			System.out.println("distinction");

	}

	public static void main1(String[] args) {
		System.out.println("one");
		System.out.println("two");
		System.out.println("three");
	}
}
