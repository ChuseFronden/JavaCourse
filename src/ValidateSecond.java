import java.util.Scanner;

public class ValidateSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter grade (0-5): ");
		int a = Integer.parseInt(input.nextLine());
		
		if (a >= 0 && a <= 5) {
		  System.out.println("OK"); 
		  } 
		else {
			System.out.println("Please enter an integer between 0 and 5.");
		}
		
	}

}
