
import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = Integer.parseInt(input.nextLine());
		if (a < 0) {
			a = (a * -1);
		}

		String number = Integer.toString(a);
		
		String[] numberofs = number.split("");
		
		int[] numbers = new int[numberofs.length];
		int result = 1;
		
		for (int i = 0; i < numberofs.length; i++) {
			
			numbers[i] = Integer.parseInt(numberofs[i]);
			result = result * numbers[i];
		}
		System.out.println(result);

	}

}