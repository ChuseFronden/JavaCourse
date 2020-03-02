import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsThird {

		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.print("Enter gross salary: ");
				double a = Double.parseDouble(input.nextLine().replace(',', '.'));
				
				System.out.print("Enter income tax rate: ");
				double b = Double.parseDouble(input.nextLine().replace(',', '.'));
				
				double calculateNetSalary = a - ( a / 100 * b);
				System.out.print("\n");
				
				DecimalFormat twoDecimals = new DecimalFormat("0.00");
				
				System.out.println("The net salary is " + twoDecimals.format(calculateNetSalary));
					}
		private static double readDouble(Scanner input) {
			 return Double.parseDouble(input.nextLine().replace(',', '.'));
			 }

}			
	