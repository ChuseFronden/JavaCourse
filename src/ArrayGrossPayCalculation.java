import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter your hourly wage: ");
	double wage = Double.parseDouble(input.nextLine().replace(',', '.'));
	
		System.out.print("Enter the number of days: ");
		int days = Integer.parseInt(input.nextLine());
		int[] hours = new int[days];
		int sum = 0;
		for (int i = 0; i < days; i++) {
			System.out.print("Hours worked on day " + (i+1) + ": ");
			hours[i] = Integer.parseInt(input.nextLine());
			sum = sum + hours[i];
		}
		double grosspay = 0;
		for (int i = 0; i < days; i++) {
			if (hours[i] <= 8) {
				grosspay += hours[i] * wage;
			}
			else {
				grosspay += hours[i] * wage + (hours[i] - 8) * wage * 0.5;
			}
		}

		System.out.println("Total work hours is " + sum);
		System.out.println("Gross pay is " + twoDecimals.format(grosspay).replace(".",","));
		System.out.println("You entered the following daily hours: ");
		for (int i = 0; i < days; i++) {
			System.out.print(hours[i]+ " ");
		}
}
}
	

