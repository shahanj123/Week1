public class Assignment1 {

	public static void main(String[] args) {
		// Question 4
		long a= Integer.parseInt(args[0]);
		if (a % 2 == 0) {
			System.out.println("Number is Even");

		}else {
			System.out.println("Number is Odd");

		}
				
		//Question 1 & 2
		long b= Integer.parseInt(args[1]);
		long c= Integer.parseInt(args[2]);
		System.out.println(b*b);
		System.out.println(b*c*a);
		
		// Question 3
		int bill= 100;
		double tip= 0.25;
		
		double total= bill+bill*tip;
		System.out.println(total);
		
		// Question 5
		int sport = 3;
		String schoolSport;
		switch (sport) {
		case 1:
			schoolSport= "Basketball";
			break;
		case 2:
			schoolSport= "Football";
			break;
		case 3:
			schoolSport= "Swimming";
			break;
		default:
				schoolSport= "Invalid";
		}
		System.out.println(schoolSport);
		
		//Question 6
		double height= 5.11; // feet.inches
		int age= 18;
		
		if (age >= 18) {
			if (height >= 5.4 ){
				System.out.println("Women's Clothes");
			} else {
				System.out.println("Mens's Clothes");
			}
			
		}else {
			System.out.println("Kids Clothes");
		}
	}

}

